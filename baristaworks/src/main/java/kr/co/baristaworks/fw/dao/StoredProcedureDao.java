package kr.co.baristaworks.fw.dao;

public interface StoredProcedureDao {

  void queryForObject(String sqlId, Object paramObject);
  
}
