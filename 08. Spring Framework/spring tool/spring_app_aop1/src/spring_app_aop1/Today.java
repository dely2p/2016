package spring_app_aop1;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;
//현재 시간 출력
public class Today implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		Calendar c = null;
		//c.getInstance().getTime();
		System.out.println(c.getInstance().getTime());
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(d));
		
	}
	
	
	
}
