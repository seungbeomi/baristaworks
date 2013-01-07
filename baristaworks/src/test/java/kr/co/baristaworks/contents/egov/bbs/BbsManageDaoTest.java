package kr.co.baristaworks.contents.egov.bbs;

import java.util.Date;

import kr.co.baristaworks.domain.BbsManage;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/root-context.xml")
//@Transactional
public class BbsManageDaoTest {

  //@Autowired
  //private BbsManageDao bbsManageDao;
  
  @Test
  public void testSchemaExport() {
    Configuration config = new Configuration();
    //config.addAnnotatedClass(BbsManage.class);
    config.configure("hibernate.cfg.xml");  // hibernate.cfg.xml
    
    new SchemaExport(config).create(true, false);
  }
  
  @Test
  public void testFindAll() {
    /*
    List<BbsManage> result = bbsManageDao.findAll();
    System.out.println(">>> " + result);
    */
    for (int i=0; i < 10; i++) {
      BbsManage entity = new BbsManage();
      //entity.setBbsId("BBSMSTR_000000000001");
      entity.setBbsNm("테스트 게시판 " + i);
      entity.setBbsIntrcn("테스트 게시판입니다.");
      entity.setBbsTyCode("BBST01");
      entity.setBbsAttrbCode("BBSA03");
      entity.setUseAt("Y");
      entity.setFrstRegistPnttm(new Date());
      entity.setAtchPosblFileSize(3);
      entity.setFileAtchPosblAt("Y");
      entity.setFrstRegisterId("son");
      //bbsManageDao.save(entity);
    }

    //List<BbsManage> result2 = bbsManageDao.findAll();
    //System.out.println(">>> " + result2);

  }

}
