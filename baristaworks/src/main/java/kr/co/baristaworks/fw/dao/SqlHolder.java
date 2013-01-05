package kr.co.baristaworks.fw.dao;

import lombok.Data;

@Data
public class SqlHolder {

  /**
   * Query Id
   */
  private String queryId;
  
  /**
   * Query의 파라미터 
   */
  private Object paramObject;
  
  /**
   * 생성자
   * @param queryId QueryId
   * @param paramObject Query의 파라미터
   */
  public SqlHolder(String queryId, Object paramObject) {
    this.queryId = queryId;
    this.paramObject = paramObject;
  }
  
}
