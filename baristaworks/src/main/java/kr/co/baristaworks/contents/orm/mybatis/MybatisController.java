package kr.co.baristaworks.contents.orm.mybatis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/orm/mybatis")
public class MybatisController {

	@RequestMapping(method=RequestMethod.GET)
	public String index(Model model) {
		return "orm/mybatis/index";
	}
	
}
