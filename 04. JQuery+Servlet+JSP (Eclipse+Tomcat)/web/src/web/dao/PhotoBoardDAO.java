package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.PhotoBoardVO;

public class PhotoBoardDAO {

	// 기본생성자에서 Connection 객체 생성	
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private StringBuffer sb = new StringBuffer();
	
	public PhotoBoardDAO() {
		conn = MakeConnection.getInstance().getConnection();
	}
	// selectAll()
	public ArrayList<PhotoBoardVO> selectAll(){
		ArrayList<PhotoBoardVO> list = new ArrayList<>();
		PhotoBoardVO vo;
		
		sb.setLength(0);
		sb.append("SELECT PNO, TITLE, CONTENTS, WRITER, FILENAME, REGDATE ");
		sb.append("FROM photoboard ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int pno = rs.getInt("pno");
				String title = rs.getString("title");
				String contents = rs.getString("contents");
				String writer = rs.getString("writer");
				String filename = rs.getString("filename");
				String regdate = rs.getString("regdate");
				vo = new PhotoBoardVO(pno, title, contents, writer, filename, regdate);
				list.add(vo);				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return list;
	}
	
	// selectOne(int pno)
	public PhotoBoardVO selectOne(int pno){
		PhotoBoardVO vo = null;
		sb.setLength(0);
		sb.append("SELECT PNO, TITLE, CONTENTS, WRITER, FILENAME, REGDATE ");
		sb.append("FROM photoboard ");
		sb.append("WHERE pno = ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, pno);
			pstmt.executeQuery();
			
			rs.next();
			String title = rs.getString("title");
			String contents = rs.getString("contents");
			String writer = rs.getString("writer");
			String filename = rs.getString("filename");
			String regdate = rs.getString("regdate");
			vo = new PhotoBoardVO(pno, title, contents, writer, filename, regdate);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}	
	
	// insertOne(PhotoBoardVO vo)
	public void insertOne(PhotoBoardVO vo){
		
		sb.setLength(0);
		sb.append("INSERT INTO photoboard ");
		sb.append("VALUES (photoboard_pno_seq.nextval, ?, ?, ?, ?, sysdate )");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContents());
			pstmt.setString(3, vo.getWriter());
			pstmt.setString(4, vo.getFilename());
			pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
