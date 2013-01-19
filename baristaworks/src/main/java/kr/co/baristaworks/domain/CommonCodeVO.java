package kr.co.baristaworks.domain;

import java.io.Serializable;

//@Data
public class CommonCodeVO implements Serializable  {

  private String codeId;

  public String getCodeId() {
    return codeId;
  }

  public void setCodeId(String codeId) {
    this.codeId = codeId;
  }
  
}
