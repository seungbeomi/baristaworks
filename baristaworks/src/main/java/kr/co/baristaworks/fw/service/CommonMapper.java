package kr.co.baristaworks.fw.service;

import java.util.List;

import kr.co.baristaworks.domain.CommonCodeDetail;
import kr.co.baristaworks.domain.CommonCodeVO;

public interface CommonMapper {

  List<CommonCodeDetail> selectCommonCodeDetail(CommonCodeVO commonCodeVO);

  Object selectNextId(String tableName);

  void updateNextId(String tableName);

}
