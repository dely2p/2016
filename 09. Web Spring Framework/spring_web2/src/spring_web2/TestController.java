package spring_web2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","축 졸업 희두몬"); // 이름, 값 을 담음
		mav.setViewName("mon"); // 찾아갈 view name
		return mav;
	}
	
}
