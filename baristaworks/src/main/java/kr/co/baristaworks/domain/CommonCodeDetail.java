package kr.co.baristaworks.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class CommonCodeDetail implements Serializable  {

  private String codeId;
  private String code;
  private String codeNm;
  private String codeDc;
  
}
