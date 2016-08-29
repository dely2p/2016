package kr.co.test.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WelcomeController implements Hello, Controller{

	String name;
	
	public void setName(String name){
		this.name = name;
	}

	@Override
	public String sayHello() {
		return name+"님 안녕하세요~~";
		
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", sayHello());
		mav.setViewName("welcome");
		return mav;
	}

}
