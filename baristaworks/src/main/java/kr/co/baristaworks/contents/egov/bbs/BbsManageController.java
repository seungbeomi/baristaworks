package kr.co.baristaworks.contents.egov.bbs;

import java.util.List;

import javax.validation.Valid;

import kr.co.baristaworks.domain.BbsManage;
import kr.co.baristaworks.domain.BbsManageVO;
import kr.co.baristaworks.domain.CommonCodeDetail;
import kr.co.baristaworks.domain.CommonCodeVO;
import kr.co.baristaworks.fw.service.CommonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
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
  private CommonService commonService;
  
  @ModelAttribute("typeList")
  public List<CommonCodeDetail> typeList() {
    CommonCodeVO vo = new CommonCodeVO();
    vo.setCodeId("COM004");
    return commonService.selectCommonCodeDetail(vo);
  }
  
  @ModelAttribute("attrbList")
  public List<CommonCodeDetail> attrbList() {
    CommonCodeVO vo = new CommonCodeVO();
    vo.setCodeId("COM009");
    return commonService.selectCommonCodeDetail(vo);
  }
  
  // 전체리스트
	@RequestMapping(method=RequestMethod.GET)
	public String list(@ModelAttribute("command") BbsManageVO bbsManageVO, Model model) {
	  List<BbsManageVO> result = bbsManageService.selectBbsManageList();
	  model.addAttribute("result", result);
		return "egov/bbsmanage/list";
	}
	
	// 상세보기
	@RequestMapping(value="/{bbsId}", method=RequestMethod.GET)
	public String show(@PathVariable("bbsId") String bbsId, ModelMap model) {
	  BbsManage result = bbsManageService.selectBbsManage(bbsId);
    model.addAttribute("bbsManageVO", result);
	  return "egov/bbsmanage/show";
	}
	
	// 입력 폼
	@RequestMapping(params = "form", method=RequestMethod.GET)
	public String form(@ModelAttribute("bbsManage") BbsManageVO bbsManageVO, ModelMap model) {
	  
	  bbsManageVO.setReplyPosblAt("N");
	  bbsManageVO.setFileAtchPosblAt("N");
	  model.addAttribute("bbsManage", bbsManageVO);
	  
	  return "egov/bbsmanage/create";
	}
	
	// 입력
	@RequestMapping(method=RequestMethod.POST)
	public String create(@ModelAttribute("bbsManage") @Valid BbsManage bbsManage, BindingResult result, ModelMap model) {
	  
	  // 권한체크
	  SecurityContext securityContext = SecurityContextHolder.getContext();
	  Authentication authentication = securityContext.getAuthentication();
	  
	  Assert.isTrue(authentication.isAuthenticated());
	  
	  // Validation
	  if (result.hasErrors()) {
	    return "egov/bbsmanage/create";
	  }
	  
	  // 저장
	  bbsManage.setFrstRegisterId(authentication.getName());
	  bbsManage.setUseAt("Y");
	  bbsManageService.insertBbsManage(bbsManage);
	  
	  return "redirect:/egov/bbsmanage/" + bbsManage.getBbsId();
	}
	
	// 수정 폼
	@RequestMapping(value="/{bbsId}", params = "form", method=RequestMethod.GET)
  public String edit(@PathVariable("bbsId") String bbsId, ModelMap model) {
    BbsManage result = bbsManageService.selectBbsManage(bbsId);
    model.addAttribute("bbsManageVO", result);
    return "egov/bbsmanage/update";
  }
	
	// 수정
	@RequestMapping(value="/{bbsId}", params = "form", method=RequestMethod.PUT)
	public String update(@PathVariable("bbsId") String bbsId, 
	    @ModelAttribute("bbsManageVO") @Valid BbsManageVO bbsManageVO, 
	    BindingResult result, ModelMap model) {
	  
	  // 권한체크
    SecurityContext securityContext = SecurityContextHolder.getContext();
    Authentication authentication = securityContext.getAuthentication();
    
    Assert.isTrue(authentication.isAuthenticated());
    
    // Validation
    if (result.hasErrors()) {
      model.addAttribute("bbsManageVO", bbsManageVO);
      return "egov/bbsmanage/update";
    }
    
    bbsManageService.updateBbsManage(bbsManageVO);
	  
    return "redirect:/egov/bbsmanage/" + bbsManageVO.getBbsId();
	}
	
	// 삭제
	@RequestMapping(value="/{bbsId}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("bbsId") String bbsId) {
	  return "egov/bbsmanage/list";
	}
	
}
