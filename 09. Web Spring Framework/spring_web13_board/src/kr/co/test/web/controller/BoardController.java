package kr.co.test.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.test.web.dao.Dao;

@Controller
public class BoardController {
	@Autowired
	Dao dao;
	
	@RequestMapping("/list.do")
	public ModelAndView boardList(){
		System.out.println("dao :" + dao);
		//BoardOracleDao bod = new BoardOracleDao();
		return new ModelAndView("list","list",dao.selectList());
	}
	
	@RequestMapping("/writeForm")
	public String from(){
		return "writeForm";
	}
	
}
