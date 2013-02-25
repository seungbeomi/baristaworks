package kr.co.baristaworks.contents.egov.bbs;

import java.util.List;

import kr.co.baristaworks.domain.BbsManage;
import kr.co.baristaworks.domain.BbsManageVO;

public interface BbsManageMapper {

  List<BbsManageVO> selectBbsManageList();

  int insertBbsManage(BbsManage bbsManage);

  BbsManage selectBbsManage(String bbsId);

	int updateBbsManage(BbsManage bbsManage);
  
}
