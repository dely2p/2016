package spring_app_app6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		Weapon w = ac.getBean("weapon", Weapon.class);
		w.fire(); // 총기사용시간을 os에 파일로 기록
		w.reload();
		
	}
	
}

