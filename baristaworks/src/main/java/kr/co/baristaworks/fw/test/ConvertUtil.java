package kr.co.baristaworks.fw.test;

import static org.junit.Assert.fail;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.dbunit.dataset.Column;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.dataset.xml.FlatXmlDataSet;

public class ConvertUtil {
  /**
   * XML 데이터셋으로 부터 리스트를 생성한다.
   * 
   * @param path
   *          객체생성을 위한 XML파일 경로
   * @param clazz
   *          생성클래스
   * @return 클래스
   */
  public static List<Object> createParamList(String path, Class clazz) {
    List<Object> result = null;
    try {
      IDataSet dataSet = new FlatXmlDataSet(new FileInputStream(path));
      ITable table = dataSet.getTable(clazz.getSimpleName());
      result = convertITableToBeanList(table, clazz);
    } catch (Exception e) {
      fail("객체생성에 실패하였습니다. Cause by : " + e);
    }
    return result;
  }
  
  /**
   * XML 데이터셋으로 부터 클래스를 생성한다.
   * 
   * @param path
   * @param clazz
   * @return
   */
  public static Object createParam(String path, Class clazz) {
    return createParamList(path, clazz).get(0);
  }

  /**
   * DbUnit의 ITable로부터 Bean 리스트로 변환한다.
   * 
   * @param iTable
   *          DbUnit의 ITable
   * @param clazz
   *          변환할 클래스객체
   * @return DbUnit의 ITable로부터 변환된 Bean리스트
   * @throws IllegalArgumentException
   * @throws DataSetException
   * @throws IllegalAccessException
   * @throws InvocationTargetException
   * @throws IntrospectionException
   * @throws InstantiationException
   */
  public static List<Object> convertITableToBeanList(ITable iTable, Class<?> clazz) 
      throws IllegalArgumentException, DataSetException,
      IllegalAccessException, InvocationTargetException,
      IntrospectionException, InstantiationException {

    Column[] columns = iTable.getTableMetaData().getColumns();

    Object bean;
    PropertyDescriptor pd;
    List<Object> beanList = new ArrayList<Object>();

    for (int i = 0; i < iTable.getRowCount(); i++) {
      bean = clazz.newInstance();
      for (int j = 0; j < columns.length; j++) {
        pd = new PropertyDescriptor(columns[j].getColumnName(), clazz);
        Method w = pd.getWriteMethod();
        Class<?>[] argTypes = w.getParameterTypes();
        if (argTypes.length == 1) {
          w.invoke(
              bean,
              new Object[] { convertType(argTypes[0],
                  iTable.getValue(i, columns[j].getColumnName())) });
        } else {
          w.invoke(
              bean,
              new Object[] { convertType(argTypes[i],
                  iTable.getValue(i, columns[j].getColumnName())) });
        }
      }
      beanList.add(bean);
    }
    return beanList;
  }

  /**
   * 객체를 클래스타입에 맞게 변환한다.
   * 
   * @param type
   *          타입
   * @param value
   *          객체
   * @return type로 변환된 객체
   */
  private static Object convertType(Class<?> type, Object value) {

    Object obj = null;

    if (value == null) {
      return null;
    } else if (type == int.class) {
      obj = Integer.parseInt(value.toString());
    } else if (type == String.class) {
      obj = String.valueOf(value.toString());
    }

    return obj;
  }
}
