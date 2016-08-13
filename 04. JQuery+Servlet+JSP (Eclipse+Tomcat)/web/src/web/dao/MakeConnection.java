package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MakeConnection {
	// 싱글톤 패턴을 적용-중복되지않고, 유일한 클래스
	private static MakeConnection mc = new MakeConnection();
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	
	private MakeConnection(){
		
	}
	
	public static MakeConnection getInstance(){
		return mc;
	}
	
	public Connection getConnection(){
		if(conn==null){
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버 로딩실패");
			} catch (SQLException e) {
				System.out.println("db 연결 실패");
				e.getStackTrace();
			}			
		}
		return conn;
	}
	
}
