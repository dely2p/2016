package kr.co.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		CollectionInter ci = ac.getBean("collection", CollectionInter.class);
		
		ci.printList();
		ci.printMap();
	}
	
}
