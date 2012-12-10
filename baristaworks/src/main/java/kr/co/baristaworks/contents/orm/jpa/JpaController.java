package kr.co.baristaworks.contents.orm.jpa;

import java.util.List;

import javax.validation.Valid;

import kr.co.baristaworks.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/orm/jpa")
public class JpaController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(method=RequestMethod.GET)
	public String index(Model model) {
		List<User> users = (List<User>) userRepository.findAll();
		model.addAttribute("users", users);
		return "orm/jpa/index";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String show(Model model, @PathVariable Long id) {
		User user = userRepository.findOne(id);
		model.addAttribute("user", user);
		return "orm/jpa/show";
	}
	
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public String form(Model model) {
		model.addAttribute("user", new User());
		return "orm/jpa/form";
	}
	
	@RequestMapping(value="/{id}/edit", method=RequestMethod.GET)
	public String edit(Model model, @PathVariable Long id) {
		User user = userRepository.findOne(id);
		model.addAttribute("user", user);
		return "orm/jpa/edit";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String create(@Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			return "orm/jpa/form";
		}
		userRepository.save(user);
		return "orm/jpa/index";
	}
	
	@RequestMapping(value="/", method=RequestMethod.PUT)
	public String update(@Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			return "orm/jpa/edit";
		}
		userRepository.save(user);
		return "orm/jpa/index";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable Long id) {
		userRepository.delete(id);
		return "orm/jpa/index";
	}
	
}
