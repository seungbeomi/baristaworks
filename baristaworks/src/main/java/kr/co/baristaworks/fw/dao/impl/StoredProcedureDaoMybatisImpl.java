package kr.co.baristaworks.fw.dao.impl;

import javax.annotation.Resource;

import kr.co.baristaworks.fw.dao.StoredProcedureDao;

import org.apache.ibatis.session.SqlSession;

public class StoredProcedureDaoMybatisImpl implements StoredProcedureDao {
  
  @Resource(name="simpleSqlSession")
  private SqlSession sqlSession;
  
  @Override
  public void execute(String sqlId, Object param) {
    sqlSession.update(sqlId, param);
  }

}
