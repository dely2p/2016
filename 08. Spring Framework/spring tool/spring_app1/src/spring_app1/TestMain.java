package spring_app1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		// 객체 관리는 스프링을 통해서 유지
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		Object obj1 = bf.getBean("bean");
		Object obj2 = bf.getBean("bean");
		System.out.println("obj1 : "+obj1);
		System.out.println("obj2 : "+obj2);
		
		Hello h = (Hello)obj1;
		h.sayHello("희두몬");
	}
}
