package com.moaboa.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.moaboa.dto.WebToonDTO;


public class WebToonDAO implements Dao{
	SqlSession ss;
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	@Override
	public void insertOne(WebToonDTO dto) {
		ss.insert("com.moaboa.dao.insertNaver", dto);
	}
	@Override
	public List<WebToonDTO> selectAll(String week) {
		return ss.selectList("com.moaboa.dao.selectWebToonAll", week);
	}
	@Override
	public WebToonDTO selectWebToon(String wName, String site) {
/*		if(site.equals("naver")){

		}else if(site.equals("daum")){
			return null;
		}else{
			return null;
		}*/
		return ss.selectOne("com.moaboa.dao.selectWebToonNaver", wName);
	}
}