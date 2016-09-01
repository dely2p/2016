package kr.co.test.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.test.web.dao.MemberDAO;
import kr.co.test.web.dto.MemberDTO;

@Controller
public class RegisterController {
	/*@RequestMapping("/reg/reg.do")
	public String registerForm(){
		return "register/form";
	}*/
	
	@RequestMapping("reg/registerOk.do")
	public String registerOk(@ModelAttribute("dto")MemberDTO dto){
		MemberDAO dao = new MemberDAO();
		dao.insertOne(dto);
		return "redirect:/login.do";
	}	
}
