package kr.co.baristaworks.core.service;

import java.util.List;

import kr.co.baristaworks.domain.CommonCodeDetail;
import kr.co.baristaworks.domain.CommonCodeVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonCodeService {

  @Autowired
  private CommonCodeMapper commonCodeMapper;
  
  public List<CommonCodeDetail> selectCommonCodeDetail(CommonCodeVO commonCodeVO) {
    return commonCodeMapper.selectCommonCodeDetail(commonCodeVO);
  }
  
}
