<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 0. 변수 선언
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@192.168.0.74:1521:orcl";
	String user = "scott";
	String password = "tiger";
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	StringBuffer sb = new StringBuffer();
	// 1. 드라이버 로딩
	Class.forName(driver);
	
	// 2. Coneection 객체 생성
	conn = DriverManager.getConnection(url, user, password);
	
	// 3. SQL문장
	sb.append("SELECT * FROM DEPT");
	
	// 4. 문장 객체 생성
	pstmt = conn.prepareStatement(sb.toString());
	
	// 5. 실행 (==> ResultSet)
	rs = pstmt.executeQuery();
	
	// 6. 레코드별 로직 처리
	while(rs.next()){
		int deptno = rs.getInt("deptno");
		String dname = rs.getString("dname");
		String loc = rs.getString("loc");
		out.print(deptno +" : "+ dname+" : "+loc);
	}
	// 7. 자원반납
	if(rs!=null) rs.close();
	if(pstmt!=null) pstmt.close();
	if(conn!=null) conn.close();

%>
</body>
</html>