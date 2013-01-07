package kr.co.baristaworks.fw.dao;

import lombok.Data;

@Data
public class SqlHolder {

  /**
   * Sql Id
   */
  private String sqlId;
  
  /**
   * Query의 파라미터 
   */
  private Object param;
  
  /** 디폴트생성자 */
  public SqlHolder() {}
  
  /**
   * 생성자
   * @param sqlId Sql Id
   * @param param Query의 파라미터
   */
  public SqlHolder(String sqlId, Object param) {
    this.sqlId = sqlId;
    this.param = param;
  }
  
}
