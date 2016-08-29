package kr.co.test.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// Model : data
		// View : 찾아갈 view의 이름
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","안녕하세요");
		// req.setAttribute("msg","안녕하세요");
		mav.setViewName("hello");
		// /hello.jsp
		return mav;
	}

}
