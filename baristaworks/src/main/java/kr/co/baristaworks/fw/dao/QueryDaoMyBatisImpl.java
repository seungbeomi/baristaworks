package kr.co.baristaworks.fw.dao;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("queryDao")
public class QueryDaoMyBatisImpl extends AbstractQueryDao implements QueryDao {

  private static final Logger logger = LoggerFactory.getLogger(QueryDaoMyBatisImpl.class);

  @Resource(name = "batchSqlSession")
  private SqlSession simpleSqlSession;

  @Resource(name = "batchSqlSession")
  private SqlSession batchSqlSession;

  @Override
  public <T> T selectOne(String sqlId) {
    return simpleSqlSession.selectOne(sqlId);
  }

  @Override
  public <T> T selectOne(String sqlId, Object param) {
    return simpleSqlSession.selectOne(sqlId, param);
  }

  @Override
  public <E> List<E> selectList(String sqlId) {
    return simpleSqlSession.selectList(sqlId);
  }

  @Override
  public <E> List<E> selectList(String sqlId, Object param) {
    return simpleSqlSession.selectList(sqlId, param);
  }

  @Override
  public <E> List<E> selectList(String sqlId, Object param, RowBounds rowBounds) {
    return simpleSqlSession.selectList(sqlId, param, rowBounds);
  }

  @Override
  public <K, V> Map<K, V> selectMap(String sqlId, String mapKey) {
    return simpleSqlSession.selectMap(sqlId, mapKey);
  }

  @Override
  public <K, V> Map<K, V> selectMap(String sqlId, Object param, String mapKey) {
    return simpleSqlSession.selectMap(sqlId, param, mapKey);
  }

  @Override
  public <K, V> Map<K, V> selectMap(String sqlId, Object param, String mapKey,
      RowBounds rowBounds) {
    return simpleSqlSession.selectMap(sqlId, param, mapKey, rowBounds);
  }

  @Override
  public void select(String sqlId, Object param, ResultHandler handler) {
    simpleSqlSession.select(sqlId, param, handler);
  }

  @Override
  public void select(String sqlId, ResultHandler handler) {
    simpleSqlSession.select(sqlId, handler);
  }

  @Override
  public void select(String sqlId, Object param, RowBounds rowBounds,
      ResultHandler handler) {
    simpleSqlSession.select(sqlId, param, rowBounds, handler);
  }

  @Override
  public int insert(String sqlId) {
    return update(sqlId, null);
  }

  @Override
  public int insert(String sqlId, Object param) {
    return update(sqlId, param);
  }

  @Override
  public int update(String sqlId) {
    return update(sqlId, null);
  }

  @Override
  public int update(String sqlId, Object param) {
    // param일 리스트타입일 경우, 배치처리
    if (param instanceof List) {
      int affectedRows = 0;
      List<Object> list = (List<Object>) param;
      logger.debug("Batch sql count : {}", list.size());
      for (Object obj : list) {
        batchSqlSession.update(sqlId, obj);
      }
      // 배치처리된 row 수 계산
      List<BatchResult> results = batchSqlSession.flushStatements();
      for (BatchResult result : results) {
        int[] updateCounts = result.getUpdateCounts();
        for (int affectedRow : updateCounts) {
          affectedRows += affectedRow;
        }
      }
      logger.debug("Complete. {} rows affected.", affectedRows);
      return affectedRows;
    }
    return simpleSqlSession.update(sqlId, param);
  }

  @Override
  public int delete(String sqlId) {
    return update(sqlId, null);
  }

  @Override
  public int delete(String sqlId, Object param) {
    return update(sqlId, param);
  }

  @Override
  public Connection getConnection() {
    return simpleSqlSession.getConnection();
  }

  @Override
  public int execute(List<SqlHolder> sqlHolders) {
    int affectedRows = 0;
    for (SqlHolder sqlHolder : sqlHolders) {
      String sqlId = sqlHolder.getSqlId();
      Object param = sqlHolder.getParam();
      // param일 리스트타입일 경우, 배치처리
      if (param instanceof List) {
        List<Object> list = (List<Object>) param;
        for (Object obj : list) {
          batchSqlSession.update(sqlId, obj);
          logPrinter(sqlId, param);
        }
      } else {
        batchSqlSession.update(sqlId, param);
        logPrinter(sqlId, param);
      }
    }
    // 배치처리된 row 수 계산
    List<BatchResult> results = batchSqlSession.flushStatements();
    for (BatchResult result : results) {
      int[] updateCounts = result.getUpdateCounts();
      for (int affectedRow : updateCounts) {
        affectedRows += affectedRow;
      } 
    }
    logger.debug("Complete. {} rows affected.", affectedRows);
    return affectedRows;
  }
  
  ///////////////////////////////////////////////////////////////////
  // P R I V A T E   M E T H O D
  private void logPrinter(String sqlId, Object param) {
    StringBuilder sb = new StringBuilder();
    sb.append("Sql Id : '");
    sb.append(sqlId);
    sb.append("', Param : ");
    sb.append(param);
    logger.debug(sb.toString());
  }

}
