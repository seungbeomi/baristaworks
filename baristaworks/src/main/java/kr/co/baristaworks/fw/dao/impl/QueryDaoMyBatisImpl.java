package kr.co.baristaworks.fw.dao.impl;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import kr.co.baristaworks.fw.dao.QueryDao;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("queryDao")
public class QueryDaoMyBatisImpl implements QueryDao {
  
  @Resource(name="simpleSqlSession")
  private SqlSession sqlSession;

  @Override
  public <T> T selectOne(String sqlId) {
    return sqlSession.selectOne(sqlId);
  }

  @Override
  public <T> T selectOne(String sqlId, Object param) {
    return sqlSession.selectOne(sqlId, param);
  }

  @Override
  public <E> List<E> selectList(String sqlId) {
    return sqlSession.selectList(sqlId);
  }

  @Override
  public <E> List<E> selectList(String sqlId, Object param) {
    return sqlSession.selectList(sqlId, param);
  }

  @Override
  public <E> List<E> selectList(String sqlId, Object param, RowBounds rowBounds) {
    return sqlSession.selectList(sqlId, param, rowBounds);
  }

  @Override
  public <K, V> Map<K, V> selectMap(String sqlId, String mapKey) {
    return sqlSession.selectMap(sqlId, mapKey);
  }

  @Override
  public <K, V> Map<K, V> selectMap(String sqlId, Object param, String mapKey) {
    return sqlSession.selectMap(sqlId, param, mapKey);
  }

  @Override
  public <K, V> Map<K, V> selectMap(String sqlId, Object param, String mapKey,
      RowBounds rowBounds) {
    return sqlSession.selectMap(sqlId, param, mapKey, rowBounds);
  }

  @Override
  public void select(String sqlId, Object param, ResultHandler handler) {
    sqlSession.select(sqlId, param, handler);
  }

  @Override
  public void select(String sqlId, ResultHandler handler) {
    sqlSession.select(sqlId, handler);
  }

  @Override
  public void select(String sqlId, Object param, RowBounds rowBounds,
      ResultHandler handler) {
    sqlSession.select(sqlId, param, rowBounds, handler);
  }

  @Override
  public int insert(String sqlId) {
    return sqlSession.insert(sqlId);
  }

  @Override
  public int insert(String sqlId, Object param) {
    return sqlSession.insert(sqlId, param);
  }

  @Override
  public int update(String sqlId) {
    return sqlSession.update(sqlId);
  }

  @Override
  public int update(String sqlId, Object param) {
    return sqlSession.update(sqlId, param);
  }

  @Override
  public int delete(String sqlId) {
    return sqlSession.delete(sqlId);
  }

  @Override
  public int delete(String sqlId, Object param) {
    return sqlSession.delete(sqlId, param);
  }

  @Override
  public Connection getConnection() {
    return sqlSession.getConnection();
  }

}
