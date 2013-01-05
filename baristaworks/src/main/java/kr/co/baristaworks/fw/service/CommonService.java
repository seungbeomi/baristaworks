package kr.co.baristaworks.fw.service;

import java.util.List;

import kr.co.baristaworks.domain.CommonCodeDetail;
import kr.co.baristaworks.domain.CommonCodeVO;
import kr.co.baristaworks.fw.dao.QueryDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {
  
  @Autowired
  private QueryDao queryDao;
  
  public List<CommonCodeDetail> selectCommonCodeDetail(CommonCodeVO commonCodeVO) {
    return queryDao.selectList("CommonMapper.selectCommonCodeDetail", commonCodeVO);
  }
  public Long selectNextId(String tableName) {
    return queryDao.selectOne("CommonMapper.selectNextId", tableName);
  }
/*
  @Autowired
  private CommonMapper commonMapper;
  
  public List<CommonCodeDetail> selectCommonCodeDetail(CommonCodeVO commonCodeVO) {
    return commonMapper.selectCommonCodeDetail(commonCodeVO);
  }
  
  public Long selectNextId(String tableName) {
    
    Object result = commonMapper.selectNextId(tableName);
    Long nextId = ((BigDecimal) result).longValue();
    commonMapper.updateNextId(tableName);
  
    return nextId; 
  }
*/
}
