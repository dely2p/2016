package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.MemberVO;
import vo.ProductVO;

public class ProductDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private StringBuffer sb = new StringBuffer();

	public ProductDAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("db 연결실패");
		}
	}

	public ArrayList<ProductVO> selectAll() {
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		sb.setLength(0);
		sb.append("SELECT * FROM product ");
		
		
		/*sb.append("SELECT * ");
		sb.append("FROM (SELECT * FROM PRODUCT ");
		sb.append("ORDER BY PNO DESC ) ");
		sb.append("WHERE ROWNUM <= 20");*/

		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int pno = rs.getInt("pno");
				String pname = rs.getString("pname");
				int price = rs.getInt("price");
				int quantity = rs.getInt("quantity");
				String imgfile = rs.getString("imgfile");
				String pdesc = rs.getString("pdesc");

				ProductVO vo = new ProductVO(pno, pname, price, quantity, imgfile, pdesc);
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	
	public ProductVO selectOne(int pno){
		sb.setLength(0);
		sb.append("SELECT * FROM product ");
		sb.append("WHERE pno = ? ");
		ProductVO vo = null;
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, pno);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				String pname = rs.getString("pname");
				int price = rs.getInt("price");
				int quantity = rs.getInt("quantity");
				String imgfile = rs.getString("imgfile");
				String pdesc = rs.getString("pdesc");
				
				vo = new ProductVO(pno, pname, price, quantity, imgfile, pdesc);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
}
