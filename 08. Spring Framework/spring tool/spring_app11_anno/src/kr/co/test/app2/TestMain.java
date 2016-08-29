package kr.co.test.app2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		/*BeanFactory bf;*/
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		SystemMonitor sm = ac.getBean("sm",SystemMonitor.class);
		
		sm.print();
	}
}
