package kr.co.test.app.dao;

import java.util.ArrayList;

import kr.co.test.app.vo.DeptVO;

public class MySqlDAO implements CommonDAO{


	@Override
	public void connect() {
		System.out.println("mysql db 연결됨");		
	}

	@Override
	public void insert(DeptVO vo) {
		System.out.println("m-dept테이블 데이터 추가");		
	}

	@Override
	public void update(DeptVO vo) {
		System.out.println("m-dept테이블 데이터 변경");		
	}

	@Override
	public void delete(int no) {
		System.out.println("m-dept테이블 데이터 삭제");		
	}

	@Override
	public DeptVO selectOne(int no) {
		System.out.println("m-dept테이블 1건 조회");
		return null;
	}

	@Override
	public ArrayList<DeptVO> selectAll() {
		System.out.println("m-dept테이블 전체 조회");
		return null;
	}

	@Override
	public void close() {
		System.out.println("m-자원반납");		
	}

}
