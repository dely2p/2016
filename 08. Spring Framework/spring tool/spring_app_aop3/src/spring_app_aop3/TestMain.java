package spring_app_aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		Bank b = ac.getBean("imple", Bank.class);
		b.transfer();
	}
}
