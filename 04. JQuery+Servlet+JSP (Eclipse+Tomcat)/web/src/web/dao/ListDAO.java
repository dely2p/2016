package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.ListVO;

public class ListDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.39:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private StringBuffer sb = new StringBuffer();
	
	public ListDAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			//System.out.println(conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public ArrayList<ListVO> selectAll(){
		ArrayList<ListVO> list = new ArrayList<>();
		ListVO vo = null;
		sb.setLength(0);
		sb.append("SELECT gno, writer, contents, regdate ");
		sb.append("FROM guestbook ");
		sb.append("ORDER BY gno desc ");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int gno = rs.getInt("gno");
				String writer = rs.getString("writer");
				String contents = rs.getString("contents");
				String regdate = rs.getString("regdate");
				vo = new ListVO(gno, writer, contents, regdate);
				list.add(vo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	public ListVO selectOne(int gno){
		sb.setLength(0);
		sb.append("SELECT gno, writer, contents, regdate ");
		sb.append("FROM guestbook ");
		sb.append("WHERE gno = ? ");
		ListVO vo = null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, gno);
			rs = pstmt.executeQuery();
			
			rs.next();
			String writer = rs.getString("writer");
			String contents = rs.getString("contents");
			String regdate = rs.getString("regdate");
			vo = new ListVO(gno, writer, contents, regdate);   
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return vo;
	}
	
	public void insertOne(ListVO vo){
		
		sb.setLength(0);
		sb.append("INSERT INTO guestbook ");
		sb.append("VALUES (GUESTBOOK_GNO_SEQ.NEXTVAL, ?, ?, SYSDATE ) ");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getContents());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateOne(ListVO vo){
		sb.setLength(0);
		sb.append("UPDATE guestbook ");
		sb.append("SET writer = ?, contents = ? ");
		sb.append("WHERE gno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getContents());
			pstmt.setInt(3, vo.getGno());
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void deleteOne(int gno){
		
		sb.setLength(0);
		sb.append("DELETE guestbook ");
		sb.append("WHERE gno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, gno);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	
}
