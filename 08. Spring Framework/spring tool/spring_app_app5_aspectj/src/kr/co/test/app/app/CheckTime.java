package kr.co.test.app.app;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class CheckTime {
	public Object logAround(ProceedingJoinPoint pjp) throws Throwable{
		// 메서드 이름 얻어오기
		String methodName = pjp.getSignature().getName();
		System.out.println("현재 실행중인 메서드"+methodName);
		StopWatch sw = new StopWatch();
		sw.start();
		Object obj = pjp.proceed();
		sw.stop();
		System.out.println("처리시간 : "+sw.getTotalTimeSeconds());
		
		return obj;
		
	}
}
