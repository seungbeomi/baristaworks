package kr.co.baristaworks.fw.dao;

import javax.annotation.Resource;


import org.apache.ibatis.session.SqlSession;

public class StoredProcedureDaoMybatisImpl implements StoredProcedureDao {
  
  @Resource(name="simpleSqlSession")
  private SqlSession sqlSession;
  
  @Override
  public void execute(String sqlId, Object param) {
    sqlSession.update(sqlId, param);
  }

}
