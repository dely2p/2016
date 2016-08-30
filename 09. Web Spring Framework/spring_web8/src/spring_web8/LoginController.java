package spring_web8;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping("/login.do")
	public String login(){		
		return "login/login";
	}
	@RequestMapping("/loginOk.do")
	public String logOk(
			/*HttpServletRequest req, */
			@RequestParam(value="id")String id,
			@RequestParam("pw")String pw,
			HttpSession hs){
		// MemberDAO dao = new MemberDAO();
		
		/*String id = req.getParameter("id");
		String pw = req.getParameter("pw");*/
		System.out.println("id: "+id);
		System.out.println("pw: "+pw);
		// db 연결 후 id, pw 검사후 존재하는 사용자라면
		// 세션에 id 속성 담기
		hs.setAttribute("id", id);
		return "main";
	}
	
	
}
