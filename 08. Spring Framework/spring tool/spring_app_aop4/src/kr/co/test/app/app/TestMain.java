package kr.co.test.app.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		//BeanFactory : AOP 지원하지 않음
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		CustomerService cs = ac.getBean("cs", CustomerService.class);
		
		
		cs.printName();
		
		/*cs.printEmail();*/
	}
}
