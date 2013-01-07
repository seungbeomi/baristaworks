package kr.co.baristaworks.fw.dao;

public interface StoredProcedureDao {

  void execute(String sqlId, Object param);
  
}
