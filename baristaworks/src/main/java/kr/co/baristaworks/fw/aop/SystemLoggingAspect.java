package kr.co.baristaworks.fw.aop;

import kr.co.baristaworks.fw.log.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.util.StopWatch;

public class SystemLoggingAspect {

  //private static final Logger log = LoggerFactory.getLogger(SystemLoggingAspect.class);
  private static final Logger log = Logger.getLogger(SystemLoggingAspect.class);

  /**
   * Controller 로그출력
   * 
   * @param joinPoint
   * @return
   * @throws Throwable
   */
  public Object loggingController(ProceedingJoinPoint joinPoint) throws Throwable {
    StopWatch stopWatch = new StopWatch();
    try {
      final Signature signature = joinPoint.getStaticPart().getSignature();
      String clazzName = joinPoint.getTarget().getClass().getSimpleName();
      String methodName = signature.getName();
      String target = clazzName + "." + methodName;
      log.debug("1. Begin controller : {}", target);
      for (Object arg : joinPoint.getArgs()) {
        log.debug("1. Parmas : {}", arg.toString());
      }
      stopWatch.start();
      Object result = joinPoint.proceed();
      log.debug("1. End controller : {}", target);
      return result;
    } catch (Throwable e) {
      throw e;
    } finally {
      stopWatch.stop();
      log.debug("1. Process time : {} seconds", stopWatch.getTotalTimeSeconds());
    }
  }

  /**
   * Service 로그 출력
   * 
   * @param joinPoint
   * @return
   * @throws Throwable
   */
  public Object loggingService(ProceedingJoinPoint joinPoint) throws Throwable {
    StopWatch stopWatch = new StopWatch();
    try {
      final Signature signature = joinPoint.getStaticPart().getSignature();
      String clazzName = joinPoint.getTarget().getClass().getSimpleName();
      String methodName = signature.getName();
      String target = clazzName + "." + methodName;
      log.debug("2. Begin service : {}", target);
      for (Object arg : joinPoint.getArgs()) {
        log.debug("2. Parmas : {}", arg.toString());
      }
      stopWatch.start();
      Object result = joinPoint.proceed();
      log.debug("2. End service : {}", target);
      return result;
    } catch (Throwable e) {
      throw e;
    } finally {
      stopWatch.stop();
      log.debug("2. Process time : {} seconds", stopWatch.getTotalTimeSeconds());
    }
  }

  /**
   * Dao 로그출력
   * 
   * @param joinPoint
   * @return
   * @throws Throwable
   */
  public Object loggingDao(ProceedingJoinPoint joinPoint) throws Throwable {
    StopWatch stopWatch = new StopWatch();
    try {
      final Signature signature = joinPoint.getStaticPart().getSignature();
      String clazzName = joinPoint.getTarget().getClass().getSimpleName();
      String methodName = signature.getName();
      String target = clazzName + "." + methodName;
      log.debug("3. Begin dao : {}", target);
      if (signature instanceof MethodSignature) {
        final MethodSignature ms = (MethodSignature) signature;
        final Class<?>[] parameterTypes = ms.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
          Class<?> type = parameterTypes[i];
          if ("java.lang.String".equals(type.getName())) {
            log.debug("3. Sql id : {}", joinPoint.getArgs()[i]);
            break;
          }
        }
      }
      stopWatch.start();
      Object result = joinPoint.proceed();
      log.debug("3. End dao : {}", target);
      return result;
    } catch (Throwable e) {
      throw e;
    } finally {
      stopWatch.stop();
      log.debug("3. Process time : {} seconds", stopWatch.getTotalTimeSeconds());
    }
  }

}
