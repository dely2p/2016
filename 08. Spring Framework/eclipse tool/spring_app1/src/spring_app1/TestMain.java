package spring_app1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		// Spring : Bean 관리하는  Container
		// 콩 자판기
		/*FileSystemResource fsr = new FileSystemResource("src/app.xml");
		BeanFactory bf = new XmlBeanFactory(fsr);*/		
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		Object obj = bf.getBean("bean");
		Hello h = (Hello)obj;
		h.sayHello("희두몬");
	}
}
