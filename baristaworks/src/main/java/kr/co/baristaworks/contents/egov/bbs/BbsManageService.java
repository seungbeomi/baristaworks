package kr.co.baristaworks.contents.egov.bbs;

import java.util.List;

import kr.co.baristaworks.domain.BbsManageVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class BbsManageService {
  
  @Autowired
  private BbsManageMapper bbsManageMapper;
  
  public List<BbsManageVO> selectBbsManageList() {
    return bbsManageMapper.selectBbsManageList();
  }

}
