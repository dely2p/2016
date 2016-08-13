package d20160602;
// DB ���� Ŭ����, �������̽� : java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx1 {
	public static void main(String[] args) {
		// jdbc ����̹� �ε�
		String driver = "oracle.jdbc.driver.OracleDriver";
		//String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
		//String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		try {
			// 1. jdbc ����̹� �ε�
			Class.forName(driver);
			// 2. Connection ��ü�� ����
			conn = DriverManager.getConnection(url,user,password);		
			System.out.println("conn : "+conn);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("���� ���� ");
		}
		
		// 3. db ����� sql����
		String sql = "SELECT *FROM dept";
		// 4. ���� ��ü
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			// 5. sql�� ����(select���� ResultSet��ü�� ��ȯ)
			rs = stmt.executeQuery(sql); // �������� ����ִ� ����(������)
			// 6. ���ڵ庰 ���� ó��
			while(rs.next()){ // ���������� �ϳ��� �̰� ���������� �̵�(�����޼ҵ尡 ������ true, ������ false)
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println("deptno : " + deptno + " dname : "+ dname + " loc : "+loc);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// 7. �ڿ� �ݳ�
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
