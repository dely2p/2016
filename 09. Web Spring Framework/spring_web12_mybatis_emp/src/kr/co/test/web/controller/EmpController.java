package kr.co.test.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.test.web.dao.Dao;
import kr.co.test.web.dto.EmpDTO;

@Controller
public class EmpController {

	@Autowired
	Dao dao;
	
	@RequestMapping("/empList.do")
	public ModelAndView list(){
		return new ModelAndView("list", "list", dao.selectAll());
	}
	
	@RequestMapping(value="/add.do", method=RequestMethod.GET)
	public String add(){
		return "insertForm";
	}
	
	@RequestMapping(value="/add.do", method=RequestMethod.POST)
	public String insertOk(
		@ModelAttribute("empDto")EmpDTO dto){
			/*req.setCharacterEncoding("UTF-8");*/
			dao.add(dto);
		
		
			// 완료 후 list페이지로 이동
			return "redirect:/empList.do";
	}
}
