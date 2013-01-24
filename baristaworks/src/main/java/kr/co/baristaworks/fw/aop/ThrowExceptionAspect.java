package kr.co.baristaworks.fw.aop;

import kr.co.baristaworks.fw.exception.SystemException;
import kr.co.baristaworks.fw.log.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ThrowExceptionAspect {

	private static final Logger log = Logger.getLogger(ThrowExceptionAspect.class);
	
	public void throwException(JoinPoint joinPoint, Throwable ex) {
		if (ex instanceof SystemException) {
			log.error("SystemExcepion이 발생하였습니다.");
		} else if (ex instanceof Exception) {
			log.error("Exception이 발생하였습니다.");
		} 
		System.out.println(">>> 에러메세지 : " + ex.toString());
	}
	
}
