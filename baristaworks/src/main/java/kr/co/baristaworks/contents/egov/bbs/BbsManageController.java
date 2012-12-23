package kr.co.baristaworks.contents.egov.bbs;

import java.util.List;

import kr.co.baristaworks.core.service.CommonCodeService;
import kr.co.baristaworks.domain.BbsManageVO;
import kr.co.baristaworks.domain.CommonCodeDetail;
import kr.co.baristaworks.domain.CommonCodeVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/egov/bbsmanage")
public class BbsManageController {
  
  @Autowired
  private BbsManageService bbsManageService;
  
  @Autowired
  private CommonCodeService commonCodeService;

  // 전체리스트
	@RequestMapping(method=RequestMethod.GET)
	public String index(@ModelAttribute("command") BbsManageVO bbsManageVO, Model model) {
	  List<BbsManageVO> result = bbsManageService.selectBbsManageList();
	  model.addAttribute("result", result);
		return "egov/bbsmanage/index";
	}
	
	// 상세보기
	public String show() {
	  return "egov/bbsmanage/show";
	}
	
	// 입력 폼
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String form(@ModelAttribute("command") BbsManageVO bbsManageVO, ModelMap model) {
	  
	  CommonCodeVO vo = new CommonCodeVO();
	  vo.setCodeId("COM004");
	  List<CommonCodeDetail> typeList = commonCodeService.selectCommonCodeDetail(vo);
	  vo.setCodeId("COM009");
	  List<CommonCodeDetail> attrbList = commonCodeService.selectCommonCodeDetail(vo);
	  
	  model.addAttribute("typeList", typeList);
	  model.addAttribute("attrbList", attrbList);
	  model.addAttribute("bbsManageVO", bbsManageVO);
	  
	  return "egov/bbsmanage/form";
	}
	
	// 입력
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String create(@ModelAttribute("command") BbsManageVO bbsManageVO, ModelMap model) {
	  return "redirect:/egov/bbsmanage";
	}
	
	// 수정 폼
	@RequestMapping(value="/{bbsId}/edit", method=RequestMethod.GET)
  public String edit(@PathVariable("bbsId") String bbsId) {
    return "egov/bbsmanage/edit";
  }
	
	// 수정
	@RequestMapping(method=RequestMethod.PUT)
	public String update() {
	  return "egov/bbsmanage/index";
	}
	
	// 삭제
	@RequestMapping(value="/{bbsId}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("bbsId") String bbsId) {
	  return "egov/bbsmanage/index";
	}
	
}
