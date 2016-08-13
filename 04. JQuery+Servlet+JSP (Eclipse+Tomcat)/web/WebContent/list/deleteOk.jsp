<%@page import="vo.ListVO"%>
<%@page import="dao.ListDAO"%>
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
	String g = request.getParameter("gno");
	System.out.println("gno : "+g);
	
	if(!(g == null || g.equals(""))){
		int gno = Integer.parseInt(g);
		ListDAO dao = new ListDAO();
		dao.deleteOne(gno);
	 
	}
	response.sendRedirect("guestList.jsp");
%>
</body>
</html>