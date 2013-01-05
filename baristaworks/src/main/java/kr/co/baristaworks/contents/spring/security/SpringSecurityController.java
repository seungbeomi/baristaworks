package kr.co.baristaworks.contents.spring.security;

import org.springframework.ui.Model;

//@Controller
//@RequestMapping(value="/spring/security")
public class SpringSecurityController {

	//@RequestMapping(method=RequestMethod.GET)
	public String index(Model model) {
		return "spring/security/index";
	}
	
}
