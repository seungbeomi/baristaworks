package kr.co.baristaworks.core.service;

import java.util.List;

import kr.co.baristaworks.domain.CommonCodeDetail;
import kr.co.baristaworks.domain.CommonCodeVO;

public interface CommonCodeMapper {

  List<CommonCodeDetail> selectCommonCodeDetail(CommonCodeVO commonCodeVO);

}
