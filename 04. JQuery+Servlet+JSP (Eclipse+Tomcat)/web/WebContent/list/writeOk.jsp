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

	String writer = request.getParameter("writer");
	String contents = request.getParameter("contents");  
	String regdate = request.getParameter("regdate");
	
	System.out.println(writer);
	System.out.println(contents);
	
	ListDAO dao = new ListDAO();
	ListVO vo = new ListVO();
	vo.setWriter(writer);
	vo.setContents(contents);
	vo.setRegdate(regdate);
	dao.insertOne(vo);	
	
 	response.sendRedirect("guestList.jsp");  
%>
</body>
</html>