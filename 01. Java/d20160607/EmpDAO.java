package d20160607;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.33:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private StringBuffer sb = new StringBuffer();
	private ResultSet rs;
	
	public EmpDAO(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : + "+conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			
		} catch (SQLException e) {
			System.out.println("db연결 실패");
		}
	}
	
	public ArrayList<EmpVO> selectAll(){
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		sb.setLength(0); 
		sb.append("SELECT * FROM emp");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getShort("deptno");
				
				
				EmpVO vo = new EmpVO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public EmpVO selectOne(int no){
		EmpVO vo = null;
		// sql문 초기화
		sb.setLength(0);
		sb.append("SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno ");
		sb.append("FROM emp ");
		sb.append("WHERE empno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");				
				vo = new EmpVO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(vo==null)
			System.out.println("직원이 존재하지 않음");
		return vo;		
	}
	// 삽입
	public void insertOne(EmpVO vo){
		sb.setLength(0);
		sb.append("INSERT INTO emp ");
		sb.append("VALUES (?,?,?,?,sysdate,?,?,?)");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, vo.getEmpno());
			pstmt.setString(2, vo.getEname());
			pstmt.setString(3, vo.getJob());
			pstmt.setInt(4, vo.getMgr());
			//pstmt.setString(5, vo.getHiredate());
			pstmt.setInt(5, vo.getSal());
			pstmt.setInt(6, vo.getComm());
			pstmt.setInt(7, vo.getDeptno());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	// 수정
	public void updateOne(EmpVO vo){
		sb.setLength(0);
		sb.append("UPDATE emp ");
		sb.append("SET ENAME = ? , JOB = ? , MGR = ? , HIREDATE = ? , SAL = ? , COMM = ? DEPT = ?");
		sb.append("WHERE emp_empno = ? ");
		
		try{
			pstmt = conn.prepareStatement(sb.toString());
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, vo.getEmpno());
			pstmt.setString(2, vo.getEname());
			pstmt.setString(3, vo.getJob());
			pstmt.setInt(4, vo.getMgr());
			pstmt.setString(5, vo.getHiredate());
			pstmt.setInt(6, vo.getSal());
			pstmt.setInt(7, vo.getComm());
			pstmt.setInt(8, vo.getDeptno());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
	// 삭제
	public void deleteOne(int empno){
		sb.setLength(0);
		sb.append("DELETE emp ");
		sb.append("WHERE empno == ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, empno);
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
