package kr.co.test.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.test.web.dto.BoardDTO;

@Repository
public class BoardOracleDao implements Dao{
	@Autowired
	SqlSession ss;
	
	@Override
	public List<BoardDTO> selectList(){
		return ss.selectList("kr.co.test.board.total");
	}

	@Override
	public void selectOne(int no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertOne(BoardDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOne(BoardDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOne(int no) {
		// TODO Auto-generated method stub
		
	}
}
