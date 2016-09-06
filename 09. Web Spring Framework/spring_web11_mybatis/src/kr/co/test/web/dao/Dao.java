package kr.co.test.web.dao;

import java.util.List;

import kr.co.test.web.dto.DeptDTO;

public interface Dao {
	public List<DeptDTO> selectAll();
	public void add(DeptDTO dto);
}
