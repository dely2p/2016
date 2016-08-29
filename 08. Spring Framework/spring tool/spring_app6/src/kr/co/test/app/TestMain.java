package kr.co.test.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		Data d = bf.getBean("data",Data.class);
		/* Data 클래스에는 int number 멤버변수
		 * setter, getter 구성 되어 있다.
		 */
		//d.setNumber(300); xml에서 같은 기능을 구현할 수 있음
		System.out.println("출력 값 : "+d.getNumber());
	}
}
