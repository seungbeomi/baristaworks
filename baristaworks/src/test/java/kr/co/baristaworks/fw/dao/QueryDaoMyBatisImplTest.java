package kr.co.baristaworks.fw.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import kr.co.baristaworks.contents.egov.bbs.BbsManageService;
import kr.co.baristaworks.domain.BbsManage;
import kr.co.baristaworks.domain.BbsManageVO;
import kr.co.baristaworks.fw.dao.QueryDao;
import kr.co.baristaworks.fw.dao.SqlHolder;
import kr.co.baristaworks.fw.test.ConvertUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.database.annotations.TestDataSource;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBean;

@SpringApplicationContext( { "spring/context-common.xml", "spring/context-mybatis.xml", "spring/context-aop.xml" })
@RunWith(UnitilsJUnit4TestClassRunner.class)
//@Transactional(TransactionMode.ROLLBACK)
public class QueryDaoMyBatisImplTest {
  
  @TestDataSource
  private DataSource dataSource;

  @SpringBean("queryDao")
  private QueryDao queryDao;
  
  @SpringBean("bbsManageService")
  private BbsManageService bbsManageService;
  
  @Test
  @DataSet("QueryDaoMyBatisImplTest.xml")
  public void test() throws Exception {
    // 조회
    List<BbsManageVO> result = queryDao.selectList("BbsManageMapper.selectBbsManageList");
    assertEquals(1, result.size());
    
    /*
    // insert
    // 1. XML로 부터 Param객체생성
    String paramFilePath = "DATASET/kr/co/baristaworks/fw/dao/impl/QueryDaoMyBatisImplTest-param.xml"; 
    BbsManage parm = (BbsManage) ConvertUtil.createParam(paramFilePath, BbsManage.class);
    
    // 2. 테스트 메소드 실행
    int affected = bbsManageService.insertBbsManage(parm);
    assertEquals(1, affected);
    
    // 3. DB 검증
    String expectedFilePath = "DATASET/kr/co/baristaworks/fw/dao/impl/QueryDaoMyBatisImplTest-expected.xml";
    Assertion.assertEquals(dataSource, expectedFilePath, "bbsmanage");
    */
    
    String paramFilePath = "DATASET/kr/co/baristaworks/fw/dao/impl/QueryDaoMyBatisImplTest-paramList.xml"; 
    List<Object> list = ConvertUtil.createParamList(paramFilePath, BbsManage.class);
    
    long i = 0L;
    for (Object obj : list) {
      BbsManage bbsManage = (BbsManage) obj;
      bbsManage.setBbsId(i);
      i++;
    }
    
    //int rows = queryDao.insert("BbsManageMapper.insertBbsManage", list);
    
    for (Object obj : list) {
      //bbsManageService.insertBbsManage((BbsManage) obj);
      
      //queryDao.insert("BbsManageMapper.insertBbsManage", obj);
    }
    
    // SqlHolder 
    List<SqlHolder> sqlHolders = new ArrayList<SqlHolder>();
    sqlHolders.add(new SqlHolder("BbsManageMapper.insertBbsManage", list));
    sqlHolders.add(new SqlHolder("BbsManageMapper.deleteBbsManage", 0));
    queryDao.execute(sqlHolders);
    
    queryDao.selectList("BbsManageMapper.selectBbsManageList");
  }

}
