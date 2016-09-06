package kr.co.test.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.test.web.dao.Dao;
import kr.co.test.web.dto.DeptDTO;

@Controller
public class DeptController {
	@Autowired
	Dao dao;
	
	@RequestMapping("/deptList.do")
	public ModelAndView list(){
		return new ModelAndView("list", "list", dao.selectAll());
	}
	
	@RequestMapping(value="/add.do", method=RequestMethod.GET)
	public String add(){
		return "insertForm";
	}
	/*add.do ==> post 방식일 때 호출할 메서드*/	
	@RequestMapping(value="/add.do", method=RequestMethod.POST)
	public String insertOk(
		/*@RequestParam("deptno") int deptno,
		@RequestParam("dname") String dname,
		@RequestParam("loc") String loc*/
		@ModelAttribute("deptDto")DeptDTO dto){
			/*req.setCharacterEncoding("UTF-8");*/
			dao.add(dto);
		
		
			// 완료 후 list페이지로 이동
			return "redirect:/deptList.do";
	}
}
