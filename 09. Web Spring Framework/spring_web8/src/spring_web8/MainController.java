package spring_web8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class MainController {
	
	@RequestMapping("/main.do")
	// 요청을 맵핑 시켜줄게
	public String main(Model m){
		m.addAttribute("msg", "메시지 왔당~~~");
		return "main";
	}
}
