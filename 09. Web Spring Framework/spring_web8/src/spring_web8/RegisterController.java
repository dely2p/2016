package spring_web8;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.test.web.dto.MemberDTO;

@Controller
public class RegisterController {
	@RequestMapping("/register/step1.do")
	public String processStep1(){
		return "step1";
	}
	
	@RequestMapping("/register/step2.do")
	public String processStep2(@RequestParam(value="ck", defaultValue="false")Boolean b){
								//파라미터가 ck인 것을 가져다가 형변환 해서 b에 담아줌
		System.out.println("파라미터 값"+b);
		if(b){
			System.out.println("약관동의 한 상태 ");
		}else{
			return "step1";
		}
		return "step2";
	}
	
	@RequestMapping("/register/step3.do")
	public ModelAndView processStep3(/*
			@RequestParam("id")String id,
			@RequestParam("pw")String pw,
			@RequestParam("confirm")String confirm,
			@RequestParam("email")String email*/
			@ModelAttribute("dto") MemberDTO dto){
		ModelAndView mav = null;
		if(!dto.getId().isEmpty() && dto.getPw().equals(dto.getConfirm()) && !dto.getEmail().isEmpty()){
			
			// 파라미터 값 가져오기
			// kr.co.test/web/dto/MemberDTO 클래스 생성		
			// 이걸로 dto객체 만들기	
			/*MemberDTO dto = new MemberDTO(id, pw, confirm, email);*/
			
			
			mav = new ModelAndView("welcome","dto",dto);
			// MemberDAO dao = new MemberDAO();
			// dao.add(dto);
			
			// welcome.jsp 이동
		}else{
			mav = new ModelAndView("step2");
		}
		return mav;
		
	}
}
