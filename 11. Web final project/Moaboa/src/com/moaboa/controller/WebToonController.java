package com.moaboa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.AlternativeJdkIdGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.moaboa.dao.Dao;

@Controller
public class WebToonController {
	@Autowired
	Dao dao;
	@RequestMapping("/webToon.do")
	public ModelAndView WebToonMainView(@RequestParam(value="week", defaultValue="mon")String week){
		return new ModelAndView("webToonMainView", "webToonList", dao.selectAll(week));
	}
	
	@RequestMapping("/webToonDetail.do")
	public ModelAndView WebToonDetail(@RequestParam(value="wname")String wName, @RequestParam(value="site")String site){

		return new ModelAndView("webToonDetail", "webToonDetail", dao.selectWebToon(wName, site));
	}
	
	@RequestMapping(value="transferOk.do",method=RequestMethod.GET)
	public String transfer(){
		return "transferOk";
	}
}
