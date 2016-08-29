package spring_app_aop3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class LoggingAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
		//System.out.println(sdf.format(d));
		
		File f = new File("C:\\log\\log"+sdf.format(d)+".txt");
		
		FileWriter fw = new FileWriter(f);
		fw.write(sdf.format(d)+" : 비밀리에 이체 진행중입니다.");
		
		fw.close();
	}
}
