package kr.co.baristaworks.contents.java.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/java/spring")
public class SpringController {

	@RequestMapping(method=RequestMethod.GET)
	public String index(Model model) {
		return "java/spring/index";
	}
	
}
