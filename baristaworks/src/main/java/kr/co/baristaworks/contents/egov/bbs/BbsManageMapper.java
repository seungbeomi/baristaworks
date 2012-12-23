package kr.co.baristaworks.contents.egov.bbs;

import java.util.List;

import kr.co.baristaworks.domain.BbsManageVO;

public interface BbsManageMapper {

  List<BbsManageVO> selectBbsManageList();
  
}
