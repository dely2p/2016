package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.DeptVO;

public class DeptDAO {
	// 환경변수를 private한 멤버 변수로 설정
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private StringBuffer sb = new StringBuffer();
	
	
	// 기본 생성자에 의해서 Connection 객체를 생성
	public DeptDAO() {
		try {
				Class.forName(driver);	
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("conn : "+conn);
				
		} catch (SQLException e) {
			System.out.println("드라이버 로딩실패");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("db연결 실패");
			e.printStackTrace();
		}
	} // DeptDAO() constructor end ///////
	
	public ArrayList<DeptVO> selectAll(){
		ArrayList<DeptVO> list = new ArrayList<>();
		// 3. 문장 작성
		sb.setLength(0);
		sb.append("SELECT * FROM dept");
		// 4. 문장 객체
		try {
			pstmt = conn.prepareStatement(sb.toString());
			// 4.5. ? 있다면 ?에 값을 할당
			
			// 5. 실행 ==> ResultSet 리턴
			rs = pstmt.executeQuery();
			// 6. 레코드별 로직 처리
			while(rs.next()){
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println("deptno : "+deptno );
				System.out.println("dname : "+dname );
				System.out.println("loc : "+loc );
				DeptVO vo = new DeptVO(deptno, dname, loc);		
				list.add(vo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list; 
	}
	
	// 부서 1건 조회하기
	public DeptVO selectOne(int no){
		
		// 3. sql문 작성
		// 문장 초기화
		sb.setLength(0);
		sb.append("SELECT * FROM dept ");
		sb.append("WHERE deptno = ? ");
		DeptVO vo = null;
		
		// 4. 문장 객체
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			// 5. 실행
			rs = pstmt.executeQuery();
			// 6. 레코드별 로직처리
			rs.next();
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			vo = new DeptVO(no, dname, loc);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
	
	// 데이터 1건 추가하기
	public void insertOne(DeptVO vo){
		
		// 3. sql문 작성
		sb.setLength(0);
		sb.append("INSERT INTO dept ");
		sb.append("VALUES (DEPT_DEPTNO.NEXTVAL, ?, ? ) "); // 시퀀스(중복된 값 없앰)
		
		// 4. 문장 객체
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getDname());
			pstmt.setString(2, vo.getLoc());
			
			// 5. 실행
			pstmt.executeUpdate();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public void deleteOne(int no){
		// 3. sql문 작성
		sb.setLength(0);
		sb.append("DELETE dept ");
		sb.append("WHERE deptno = ? ");
		
		// 4. 문장 객체
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			// 5. 실행
			pstmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void updateOne(DeptVO vo){		
		// 3. sql문 작성
				sb.setLength(0);
				sb.append("Update dept ");
				sb.append("SET dname = ?, loc = ? ");
				sb.append("WHERE deptno = ? ");
				
				// 4. 문장 객체
				try {
					pstmt = conn.prepareStatement(sb.toString());
					pstmt.setString(1, vo.getDname());
					pstmt.setString(2, vo.getLoc());
					pstmt.setInt(3, vo.getDeptno());
					// 5. 실행
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
