package kr.co.baristaworks.contents.orm.jpa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/orm/jpa")
public class JpaController {

	@RequestMapping(method=RequestMethod.GET)
	public String index(Model model) {
		return "orm/jpa/index";
	}
	
}
