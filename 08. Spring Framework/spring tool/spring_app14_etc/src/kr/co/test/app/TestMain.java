package kr.co.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		Character ch = ac.getBean("character",Character.class);
	
		ch.status();
		// 이름 : 홍길동
		// 나이 : 20세
		
	}
}
