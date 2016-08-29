package spring_app12_javaconf;
// app.xml 역할

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name="helloBean")
	public Hello helloWorld(){
		return new HelloImple();
	}
}
