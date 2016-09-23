package com.moaboa.dao;

import java.util.List;

import com.moaboa.dto.WebToonDTO;

public interface Dao {
	public void insertOne(WebToonDTO dto);
	public List<WebToonDTO> selectAll(String week);
	public WebToonDTO selectWebToon(String wName, String site);
}
