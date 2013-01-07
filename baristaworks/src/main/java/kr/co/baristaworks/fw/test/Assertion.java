package kr.co.baristaworks.fw.test;

import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.sql.Connection;

import javax.sql.DataSource;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.dataset.SortedTable;
import org.dbunit.dataset.xml.FlatXmlDataSet;

/**
 * 검증을 위한 클래스
 * @author seungbeomi
 *
 */
public class Assertion {

  /**
   * 예상되는 결과값의 XML파일을 읽어들여, 현재 데이터베이스내의 데이터와 동일한지 검증한다.
   * 
   * @param dataSource 데이터소스
   * @param connection DbUnit 데이터베이스 커넥션
   * @param path 예상되는 결과값의 XML파일 경로
   * @param tableName 테이블명
   */
  public static void assertEquals(DataSource dataSource, String path, String tableName) {
    try {
      Connection conn = dataSource.getConnection();
      IDatabaseConnection connection = new DatabaseConnection(conn);
      IDataSet databaseDataSet = connection.createDataSet();
      ITable actualTable = databaseDataSet.getTable(tableName);
  
      IDataSet expectedDataSet = new FlatXmlDataSet(new FileInputStream(path));
      ITable expectedTable = expectedDataSet.getTable(tableName);
  
      org.dbunit.Assertion.assertEquals(new SortedTable(expectedTable), new SortedTable(actualTable, expectedTable.getTableMetaData()));
    } catch (Exception e) {
      fail("데이터베이스 검증에 실패하였습니다. Cause by : " + e);
    }
  }
}
