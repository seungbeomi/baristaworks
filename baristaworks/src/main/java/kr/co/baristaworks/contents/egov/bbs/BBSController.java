package kr.co.baristaworks.contents.egov.bbs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/egov/bbs")
public class BBSController {

	@RequestMapping(method=RequestMethod.GET)
	public String index(Model model) {
		return "egov/bbs/index";
	}
	
}
