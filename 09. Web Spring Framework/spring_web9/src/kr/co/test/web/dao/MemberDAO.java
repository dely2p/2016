package kr.co.test.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.test.web.dto.MemberDTO;

public class MemberDAO {
	
	//JDBC연결
	Connection conn;
	StringBuffer sb = new StringBuffer();
	ResultSet rs;
	PreparedStatement pstmt;

	public MemberDAO() {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
		String user = "scott";
		String password = "tiger";
		
		try{                      
			Class.forName(driver);                    
			conn = DriverManager.getConnection(url, user , password);                  

		}catch(ClassNotFoundException e){                                                   
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean selectOne(MemberDTO dto){
		sb.setLength(0);
		sb.append("SELECT * ");
		sb.append("FROM member ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	public void insertOne(MemberDTO dto){
		sb.setLength(0);
		sb.append("INSERT INTO member ");
		sb.append("VALUES(?,?,?) ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getEmail());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("멤버추가함");
	}
}
