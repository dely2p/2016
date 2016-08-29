package spring_app1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConf {
	@Bean(name="bean")
	public Hello helloWorld(){
		return new HelloKr();
	}
}
