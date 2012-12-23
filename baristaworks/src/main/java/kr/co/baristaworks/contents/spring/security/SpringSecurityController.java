package kr.co.baristaworks.contents.spring.security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/spring/security")
public class SpringSecurityController {

	@RequestMapping(method=RequestMethod.GET)
	public String index(Model model) {
		return "spring/security/index";
	}
	
}
