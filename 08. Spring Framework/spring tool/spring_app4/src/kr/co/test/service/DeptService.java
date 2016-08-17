package kr.co.test.service;

import kr.co.test.app.dao.CommonDAO;
import kr.co.test.app.dao.OracleDAO;
import kr.co.test.app.vo.DeptVO;

public class DeptService implements DBService{

	CommonDAO dao;
	
	// 기본생성자는 멤버변수의 값을 null로 초기화
	public DeptService(CommonDAO dao) {
		this.dao = dao;
		this.dao.connect();
	}
	
	@Override
	public void readAll() {
		dao.selectAll();
		
	}

	@Override
	public void readOne(int no) {
		dao.selectOne(no);
		
	}

	@Override
	public void write(DeptVO vo) {
		dao.insert(vo);
		
	}

	@Override
	public void modify(DeptVO vo) {
		dao.update(vo);
		
	}

	@Override
	public void drop(int no) {
		dao.delete(no);
		
	}

}
