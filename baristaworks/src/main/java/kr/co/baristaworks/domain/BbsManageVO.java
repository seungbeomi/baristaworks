package kr.co.baristaworks.domain;


//@Data
public class BbsManageVO extends BbsManage {
  
  /** 게시판유형 코드명 */
  private String bbsTyCodeNm;

  /** 게시판속성 코드명 */
  private String bbsAttrbCodeNm;

  public String getBbsTyCodeNm() {
    return bbsTyCodeNm;
  }

  public void setBbsTyCodeNm(String bbsTyCodeNm) {
    this.bbsTyCodeNm = bbsTyCodeNm;
  }

  public String getBbsAttrbCodeNm() {
    return bbsAttrbCodeNm;
  }

  public void setBbsAttrbCodeNm(String bbsAttrbCodeNm) {
    this.bbsAttrbCodeNm = bbsAttrbCodeNm;
  }

}
