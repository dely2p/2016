package d20160602;
// DB 관련 클래스, 인터페이스 : java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx1 {
	public static void main(String[] args) {
		// jdbc 드라이버 로딩
		String driver = "oracle.jdbc.driver.OracleDriver";
		//String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
		//String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		try {
			// 1. jdbc 드라이버 로딩
			Class.forName(driver);
			// 2. Connection 객체를 생성
			conn = DriverManager.getConnection(url,user,password);		
			System.out.println("conn : "+conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("연결 실패 ");
		}
		
		// 3. db 사용할 sql문장
		String sql = "SELECT *FROM dept";
		// 4. 문장 객체
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			// 5. sql문 실행(select문은 ResultSet객체를 반환)
			rs = stmt.executeQuery(sql); // 실행결과가 담겨있는 집합(여러개)
			// 6. 레코드별 로직 처리
			while(rs.next()){ // 실행결과에서 하나를 뽑고 다음행으로 이동(다음메소드가 있으면 true, 없으면 false)
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println("deptno : " + deptno + " dname : "+ dname + " loc : "+loc);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// 7. 자원 반납
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
