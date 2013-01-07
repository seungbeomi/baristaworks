package kr.co.baristaworks.fw.dao;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;


public interface QueryDao {
  
  /**
   * Retrieve a single row mapped from the statement key
   * @param <T> the returned object type
   * @param sqlId
   * @return Mapped object
   */
  <T> T selectOne(String sqlId);

  /**
   * Retrieve a single row mapped from the statement key and parameter.
   * @param <T> the returned object type
   * @param sqlId Unique identifier matching the statement to use.
   * @param param A parameter object to pass to the statement.
   * @return Mapped object
   */
  <T> T selectOne(String sqlId, Object param);

  /**
   * Retrieve a list of mapped objects from the statement key and parameter.
   * @param <E> the returned list element type
   * @param sqlId Unique identifier matching the statement to use.
   * @return List of mapped object
   */
  <E> List<E> selectList(String sqlId);

  /**
   * Retrieve a list of mapped objects from the statement key and parameter.
   * @param <E> the returned list element type
   * @param sqlId Unique identifier matching the statement to use.
   * @param param A parameter object to pass to the statement.
   * @return List of mapped object
   */
  <E> List<E> selectList(String sqlId, Object param);

  /**
   * Retrieve a list of mapped objects from the statement key and parameter,
   * within the specified row bounds.
   * @param <E> the returned list element type
   * @param sqlId Unique identifier matching the statement to use.
   * @param param A parameter object to pass to the statement.
   * @param rowBounds  Bounds to limit object retrieval
   * @return List of mapped object
   */
  <E> List<E> selectList(String sqlId, Object param, RowBounds rowBounds);

  /**
   * The selectMap is a special case in that it is designed to convert a list
   * of results into a Map based on one of the properties in the resulting
   * objects.
   * Eg. Return a of Map[Integer,Author] for selectMap("selectAuthors","id")
   * @param <K> the returned Map keys type
   * @param <V> the returned Map values type
   * @param sqlId Unique identifier matching the statement to use.
   * @param mapKey The property to use as key for each value in the list.
   * @return Map containing key pair data.
   */
  <K, V> Map<K, V> selectMap(String sqlId, String mapKey);

  /**
   * The selectMap is a special case in that it is designed to convert a list
   * of results into a Map based on one of the properties in the resulting
   * objects.
   * @param <K> the returned Map keys type
   * @param <V> the returned Map values type
   * @param sqlId Unique identifier matching the statement to use.
   * @param param A parameter object to pass to the statement.
   * @param mapKey The property to use as key for each value in the list.
   * @return Map containing key pair data.
   */
  <K, V> Map<K, V> selectMap(String sqlId, Object param, String mapKey);

  /**
   * The selectMap is a special case in that it is designed to convert a list
   * of results into a Map based on one of the properties in the resulting
   * objects.
   * @param <K> the returned Map keys type
   * @param <V> the returned Map values type
   * @param sqlId Unique identifier matching the statement to use.
   * @param param A parameter object to pass to the statement.
   * @param mapKey The property to use as key for each value in the list.
   * @param rowBounds  Bounds to limit object retrieval
   * @return Map containing key pair data.
   */
  <K, V> Map<K, V> selectMap(String sqlId, Object param, String mapKey, RowBounds rowBounds);

  /**
   * Retrieve a single row mapped from the statement key and parameter
   * using a {@code ResultHandler}.
   * @param sqlId Unique identifier matching the statement to use.
   * @param param A parameter object to pass to the statement.
   * @param handler ResultHandler that will handle each retrieved row
   * @return Mapped object
   */
  void select(String sqlId, Object param, ResultHandler handler);

  /**
   * Retrieve a single row mapped from the statement
   * using a {@code ResultHandler}.
   * @param sqlId Unique identifier matching the statement to use.
   * @param handler ResultHandler that will handle each retrieved row
   * @return Mapped object
   */
  void select(String sqlId, ResultHandler handler);

  /**
   * Retrieve a single row mapped from the statement key and parameter
   * using a {@code ResultHandler} and {@code RowBounds}
   * @param sqlId Unique identifier matching the statement to use.
   * @param rowBounds RowBound instance to limit the query results
   * @param handler ResultHandler that will handle each retrieved row
   * @return Mapped object
   */
  void select(String sqlId, Object param, RowBounds rowBounds, ResultHandler handler);

  /**
   * Execute an insert statement.
   * @param sqlId Unique identifier matching the statement to execute.
   * @return int The number of rows affected by the insert.
   */
  int insert(String sqlId);

  /**
   * Execute an insert statement with the given parameter object. Any generated
   * autoincrement values or selectKey entries will modify the given parameter
   * object properties. Only the number of rows affected will be returned.
   * @param sqlId Unique identifier matching the statement to execute.
   * @param param A parameter object to pass to the statement.
   * @return int The number of rows affected by the insert.
   */
  int insert(String sqlId, Object param);

  /**
   * Execute an update statement. The number of rows affected will be returned.
   * @param sqlId Unique identifier matching the statement to execute.
   * @return int The number of rows affected by the update.
   */
  int update(String sqlId);

  /**
   * Execute an update statement. The number of rows affected will be returned.
   * @param sqlId Unique identifier matching the statement to execute.
   * @param param A parameter object to pass to the statement.
   * @return int The number of rows affected by the update.
   */
  int update(String sqlId, Object param);

  /**
   * Execute a delete statement. The number of rows affected will be returned.
   * @param sqlId Unique identifier matching the statement to execute.
   * @return int The number of rows affected by the delete.
   */
  int delete(String sqlId);

  /**
   * Execute a delete statement. The number of rows affected will be returned.
   * @param sqlId Unique identifier matching the statement to execute.
   * @param param A parameter object to pass to the statement.
   * @return int The number of rows affected by the delete.
   */
  int delete(String sqlId, Object param);

  /**
   * Retrieves inner database connection
   * @return Connection
   */
  Connection getConnection();
  
  int execute(List<SqlHolder> sqlHolders);
  
}
