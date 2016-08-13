package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.EmpVO;

public class EmpDAO {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private StringBuffer sb = new StringBuffer();
	
	public EmpDAO(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	
	public ArrayList<EmpVO> selectAll(){
		ArrayList<EmpVO> list = new ArrayList<>();
		
		sb.setLength(0);
		sb.append("SELECT empno, ename, sal, job, deptno FROM emp");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery(); // select문 외에는 executeUpdate();
			
			while(rs.next()){
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");
				String job = rs.getString("job");
				int deptno = rs.getInt("deptno");
				EmpVO vo = new EmpVO(empno, ename, sal, job, deptno);
				list.add(vo);
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public EmpVO selectOne(int no){
		sb.setLength(0);
		sb.append("SELECT * FROM EMP ");
		sb.append("WHERE empno = ? ");
		EmpVO vo = null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			
			rs.next();
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int sal = rs.getInt("sal");
			int deptno = rs.getInt("deptno");
			vo = new EmpVO(no, ename, sal, job, deptno);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
		
	}
	
	public void insert(EmpVO vo){
		
		sb.setLength(0);
		sb.append("INSERT INTO EMP (EMPNO, ENAME, SAL, JOB, DEPTNO) ");
		sb.append("VALUES (EMP_EMPNO_SEQ.NEXTVAL, ?, ?, ?, ?) " );
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getEname());
			pstmt.setInt(2, vo.getSal());
			pstmt.setString(3, vo.getJob());			
			pstmt.setInt(4, vo.getDeptno());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void updateOne(EmpVO vo){
		sb.setLength(0);
		sb.append("UPDATE emp ");
		sb.append("SET ename = ?, sal = ?, job = ?, deptno = ? ");
		sb.append("WHERE empno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getEname());
			pstmt.setInt(2, vo.getSal());
			pstmt.setString(3, vo.getJob());
			pstmt.setInt(4, vo.getDeptno());
			pstmt.setInt(5, vo.getEmpno());
			pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteOne(int no){
		sb.setLength(0);
		sb.append("DELETE emp ");
		sb.append("WHERE empno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			pstmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void close(){
		
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
}
