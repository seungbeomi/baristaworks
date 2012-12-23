package kr.co.baristaworks.domain;

import lombok.Data;

@Data
public class BbsManageVO extends BbsManage {
  
  /** 게시판유형 코드명 */
  private String bbsTyCodeNm;

  /** 게시판속성 코드명 */
  private String bbsAttrbCodeNm;

}
