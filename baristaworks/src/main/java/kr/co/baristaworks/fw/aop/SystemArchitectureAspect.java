package kr.co.baristaworks.fw.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareError;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SystemArchitectureAspect {

  @DeclareError("inDaoLayer() && callServiceLayer() ")
  public static final String DAOsNotFromServices = "DAO must not call Service!";
  
  //@DeclareError(" (call(* java.sql.*.*(..)) && !within(*.dao.*) ) ")
  public static final String JdbcOnlyInDAOs = "JDBC only in DAOs!";
  
  
  
  @Pointcut("execution(public * kr.co.baristaworks..*Controller.*(..))")
  public void inControllerLayer() {}

  @Pointcut("within(kr.co.baristaworks..service..*)")
  public void inServiceLayer() {}
  
  @Pointcut("call(* kr.co.baristaworks..service.*.*(..))")
  //@Pointcut("call(* kr.co.baristaworks..*Service.*(..))")
  public void callServiceLayer() {}

  @Pointcut("within(kr.co.baristaworks..dao..*)")
  public void inDaoLayer() {}

  public void serviceMethod() {}
  
  public void daoMethod() {}
  
  public void checkDao(JoinPoint joinPoint) {
    System.out.println("daoToService architecture checking.");
    throw new RuntimeException("Dao can't call Service's method.");
  }
  
//===== basics =====
// TODO : ROLE, LOGGER와 같은 변수 제외시켜야 함.
@Pointcut("!(execution(* *(..)) || withincode(* *(..)) || withincode(*.new(..)))")
public void clazz(){
}

// ===== package =====
@Pointcut("within(com.sds.emp..web..*)")
public void inWebPkg() {
}

@Pointcut("within(com.sds.emp..services.*)")
public void inInterfacePkg() {
}

@Pointcut("within(com.sds.emp..services.impl..*)")
public void inImplementationPkg() {
}

@Pointcut("within(com.sds.emp..services.vo..*)")
public void inVOPkg() {
}

@Pointcut("within(integration..* || unit..*)")
public void inTestPkg() {
}

// ===== module names =====
@Pointcut("within(com.sds.emp..web..*Action)")
public void actionName() {
}

@Pointcut("within(com.sds.emp..web..*Form)")
public void formName() {
}

@Pointcut("within(com.sds.emp..services.I*)")
public void interfaceName() {
}

@Pointcut("within(com.sds.emp..services.vo.*VO)")
public void voName() {
}

@Pointcut("within(com.sds.emp..services.impl..*Impl)")
public void implementationName() {
}

@Pointcut("within(com.sds.emp..services.impl..*DAO)")
public void daoName() {
}

// ===== calls to modules =====
@Pointcut("call(* com.sds.emp..web.*Action.*(..)) && call(* com.sds.emp..web.*Form.*(..))")
public void callToWeb() {
} 

@Pointcut("call(* com.sds.emp..services.impl.*DAO.*(..))")
public void callToDAO() {
}

@Pointcut("call(com.sds.emp..services.impl.*DAO.new(..))")
public void callToDAOConstructor() {
}

@Pointcut("call(* com.sds.emp..services.impl.*Impl.*(..))")
public void callToImplementation() {
}

@Pointcut("call(com.sds.emp..services.impl.*Impl.new(..))")
public void callToImplConstructor() {
} 

@Pointcut("call(* java.sql.Connection.*(..))")
public void callToConnection() {
  }
/*
// ===== Naming Rule =====
// TODO : 클래스와 인터페이스 구분해줘야 함. 
@DeclareWarning ("inInterfacePkg() && !(inImplementationPkg() || inVOPkg()) && clazz() && !interfaceName()")
static final String nrMsg1 = "services 패키지에 속한 모든 인터페이스의 이름은 I로 시작해야 합니다.";
@DeclareWarning ("inWebPkg() && clazz() && !(actionName() || formName())")
static final String nrMsg2 = "web 패키지에 속한 모든 클래스의 이름은 Action 또는 Form으로 끝나야 합니다.";
@DeclareWarning ("inVOPkg() && clazz() && !voName()")
static final String nrMsg3 = "vo 패키지에 속한 모든 클래스의 이름은 VO로 끝나야 합니다.";
@DeclareWarning ("inImplementationPkg() && clazz() && !(implementationName() || daoName())")
static final String nrMsg4 = "services 패키지에 속한 모든 클래스의 이름은 Impl 또는 DAO로 끝나야 합니다.";

// ===== component interaction rules =====
@DeclareError("!inWebPkg() && callToWeb()")
static final String irMsg5 = "web 패키지에 속한 모든 클래스에 접근할 수 없습니다.";
@DeclareError("inWebPkg() && ( callToDAO() || callToImplementation())")
static final String irMsg1 = "Action 클래스에서는 특정 서비스의 구현 클래스나 DAO 클래스에 직접 접근할 수 없습니다.";
@DeclareError("callToConnection() && !inTestPkg()")
static final String irMsg2 = "java.sql.Connection 객체에 직접 접근할 수 없습니다. SYSTEMiER Technical Service를 이용하세요.";
@DeclareError("callToDAOConstructor()")
static final String irMsg3 = "DAO 인스턴스를 직접 생성하실 수 없습니다. 객체간 참조 관계는 서비스 속성 정의 XML에 정의하여 사용하세요.";
@DeclareError("callToImplConstructor()")
static final String irMsg4 = "서비스 구현 클래스의 인스턴스를 직접 생성하실 수 없습니다. 객체간 참조 관계는 서비스 속성 정의 XML에 정의하여 사용하세요.";
}
*/
}