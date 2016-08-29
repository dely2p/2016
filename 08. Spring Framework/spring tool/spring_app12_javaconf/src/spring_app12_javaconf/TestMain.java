package spring_app12_javaconf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		/*ApplicationContext ac = new ClassPathXmlApplicationContext();*/
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Hello h = ac.getBean("helloBean",Hello.class);
		h.printHello("spring Java Config");
	}
}
