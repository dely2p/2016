package kr.co.test.app.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		//app.xml에서 설정 읽어와서
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		Dao dao = ac.getBean("dao",Dao.class);
		
		//dao라는 빈을 찾아
		System.out.println("전체 데이터는 "+dao.selectCount()+"입니다.");
	}
}
