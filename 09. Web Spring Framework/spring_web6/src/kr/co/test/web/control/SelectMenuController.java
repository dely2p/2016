package kr.co.test.web.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SelectMenuController{
	
	@RequestMapping(value="selectHobby.do") // method 호출오면 알려줌
	public ModelAndView ccc(HttpServletRequest req){
		String[] hobby = req.getParameterValues("hobby");
		ModelAndView mav = new ModelAndView("printHobby","hobby",hobby);
						// new ModelAndView(뷰이름, 모델객체명, 전달객체)
		return mav;
	}
/*	@RequestMapping(value="lunch.do")
	public ModelAndView bbb(){		
		return new ModelAndView("goodTime","msg","Enjoy your lunch!!!");
	}*/
	@RequestMapping(value="lunch.do")
	public String ddd(Model m){		
		m.addAttribute("msg", "Enjoy your time");
		return "goodTime";
	}
	
	@RequestMapping(value="gohome.do")
	public ModelAndView aaa(){
		return new ModelAndView("gohome", "msg","집에가고시포요");
	}
	


}
