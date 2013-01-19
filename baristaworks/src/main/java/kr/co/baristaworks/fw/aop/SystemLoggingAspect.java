package kr.co.baristaworks.fw.aop;

import kr.co.baristaworks.fw.log.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.util.StopWatch;

@Aspect
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
      String classDotMethod = clazzName + "." + methodName;
      //log.debug("1. Begin controller : {}", target);
      //log.debug("1. Begin controller : {}", joinPoint.getSignature().toString());
      StringBuilder sb = new StringBuilder();
      int i = 0;
      for (Object arg : joinPoint.getArgs()) {
        if (i > 0) {
          sb.append(", ");
        }
        sb.append(arg.toString());
        i++;
      }
      String target = classDotMethod + "(" + sb.toString() + ")";
      log.debug("1. Begin controller : {}", target);
      //log.debug("1. Parmas : {}", sb.toString());
      stopWatch.start();
      Object result = joinPoint.proceed();
      log.debug("1. End controller : {}", target);
      return result;
    } catch (Throwable e) {
      throw e;
    } finally {
      stopWatch.stop();
      log.debug("   - Controller Process time : {} seconds", stopWatch.getTotalTimeSeconds());
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
      String classDotMethod = clazzName + "." + methodName;
      StringBuilder sb = new StringBuilder();
      int i = 0;
      for (Object arg : joinPoint.getArgs()) {
        if (i > 0) {
          sb.append(", ");
        }
        sb.append(arg.toString());
        i++;
      }
      String target = classDotMethod + "(" + sb.toString() + ")";
      log.debug("2. Begin service : {}", target);
      stopWatch.start();
      Object result = joinPoint.proceed();
      log.debug("2. End service : {}", target);
      return result;
    } catch (Throwable e) {
      throw e;
    } finally {
      stopWatch.stop();
      log.debug("   - Service Process time : {} seconds", stopWatch.getTotalTimeSeconds());
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
      String classDotMethod = clazzName + "." + methodName;
      StringBuilder sb = new StringBuilder();
      int i = 0;
      for (Object arg : joinPoint.getArgs()) {
        if (i > 0) {
          sb.append(", ");
        }
        sb.append(arg.toString());
        i++;
      }
      String target = classDotMethod + "(" + sb.toString() + ")";
      log.debug("3. Begin dao : {}", target);
      if (signature instanceof MethodSignature) {
        final MethodSignature ms = (MethodSignature) signature;
        final Class<?>[] parameterTypes = ms.getParameterTypes();
        for (int j = 0; j < parameterTypes.length; j++) {
          Class<?> type = parameterTypes[j];
          if ("java.lang.String".equals(type.getName())) {
            log.debug("   -> Sql id : {}", joinPoint.getArgs()[j]);
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
      log.debug("   - Dao Process time : {} seconds", stopWatch.getTotalTimeSeconds());
    }
  }

}
