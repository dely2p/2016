package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.BoardVO;

public class BoardDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private StringBuffer sb = new StringBuffer();
	
	public BoardDAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public BoardVO selectOne(int bno){		
		
		sb.setLength(0);
		sb.append("SELECT * FROM board ");
		sb.append("WHERE bno = ? ");
		BoardVO vo = null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			
			rs.next();			
			String title = rs.getString("title");
			String writer = rs.getString("writer");
			String contents = rs.getString("contents");
			int hits = rs.getInt("hits");
			String regdate = rs.getString("regdate");
			int status = rs.getInt("status");
			vo = new BoardVO(bno, title, writer, contents, hits, regdate, status);			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return vo;
	}
	
	public ArrayList<BoardVO> selectAll(){
		
		ArrayList<BoardVO> list = new ArrayList<>();
		BoardVO vo;
		sb.setLength(0);
		sb.append("SELECT bno, title, writer, ");
		sb.append("contents, hits, ");
		sb.append("TO_CHAR(REGDATE, 'YYYY-MM-DD') REGDATE, ");
		sb.append("status FROM board ");
		sb.append("ORDER BY bno desc ");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String contents = rs.getString("contents");
				int hits = rs.getInt("hits");
				String regdate = rs.getString("regdate");
				int status = rs.getInt("status");
				vo = new BoardVO(bno, title, writer, contents, hits, regdate, status);				
				list.add(vo);				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertOne(BoardVO vo){
		
		sb.setLength(0);
		sb.append("INSERT INTO board ");
		sb.append("VALUES (BOARD_BNO_SEQ.nextval, ?, ?, ?, 0, sysdate, 1 ) ");
		// status : 0	블라인드처리
		// 			1	정상 글
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContents());
			/*pstmt.setInt(4, vo.getHits());
			pstmt.setString(5, vo.getRegdate());
			pstmt.setInt(6, vo.getStatus());*/
			pstmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateOne(BoardVO vo){
		
		sb.setLength(0);
		sb.append("UPDATE board ");
		sb.append("SET title = ?, writer = ?, contents = ? ");
		sb.append("WHERE bno = ? ");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContents());
			pstmt.setInt(4, vo.getBno());
			pstmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void deleteOne(int bno){
		
		sb.setLength(0);
		sb.append("DELETE board ");
		sb.append("WHERE bno = ? ");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			pstmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void close(){
		
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
