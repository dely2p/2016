package d20160607;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// Database Access Object : DAO
public class DeptDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private StringBuffer sb = new StringBuffer();
	private ResultSet rs;
	
	public DeptDAO(){
		// 객체를 초기화
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : + "+conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			
		} catch (SQLException e) {
			System.out.println("db연결 실패");
		}
	}// DeptDAO constructor end
	
	// 전체조회하는 메서드
	public ArrayList<DeptVO> selectAll(){
		ArrayList<DeptVO> list = new ArrayList<DeptVO>();
		// 3번~7번
		sb.setLength(0); // 기존 내용이 있다면 지우기
		sb.append("SELECT * FROM dept");	// 새로 쓰기

		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				DeptVO vo = new DeptVO(deptno, dname, loc);
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}// selectAll() end
	
	// 1건 조회
	public DeptVO selectOne(int no){
		DeptVO vo = null;
		// sql문 초기화
		sb.setLength(0);
		sb.append("SELECT deptno, dname, loc ");
		sb.append("FROM dept ");
		sb.append("WHERE deptno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				vo = new DeptVO(deptno, dname, loc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(vo==null)
			System.out.println("부서가 존재하지 않음");
		return vo;		
	}	// selectOne() end
	
	// 입력
	public void insertOne(DeptVO vo){
		sb.setLength(0);
		sb.append("INSERT INTO dept ");
		sb.append("VALUES (dept_deptno.nextval,?,?)");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getDname());
			pstmt.setString(2, vo.getLoc());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	// 수정
	public void updateOne(DeptVO vo){
		sb.setLength(0);
		sb.append("UPDATE dept ");
		sb.append("SET DNAME = ? , LOC = ? ");
		sb.append("WHERE dept_deptno = ? ");
		
		try{
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, vo.getDeptno());
			pstmt.setString(2, vo.getDname());
			pstmt.setString(3, vo.getLoc());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	// 삭제
	public void deleteOne(int deptno){
		sb.setLength(0);
		sb.append("DELETE dept ");
		sb.append("WHERE dept_deptno == ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, deptno);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// 접속 종료(자원반납)
	public void close(){
		try{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
