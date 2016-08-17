package spring_app2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		// 스프링 컨테이너
		/*BeanFactory bf = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		Object obj = bf.getBean("coffee");
		Coffee cf = (Coffee)obj;
		cf.drink("희두몬");*/
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		Object obj = bf.getBean("ameri");
		Coffee cf = (Coffee)obj;
		cf.drink("은진");

	}
}
