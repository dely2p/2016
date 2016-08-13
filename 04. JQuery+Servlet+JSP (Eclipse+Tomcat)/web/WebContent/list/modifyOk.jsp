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
	String writer = request.getParameter("writer");
	String contents = request.getParameter("contents");
	
	if(g!=null){
		int gno = Integer.parseInt(g);
		ListDAO dao = new ListDAO();
		ListVO vo = new ListVO();
		vo.setGno(gno);
		vo.setWriter(writer);
		vo.setContents(contents);
		dao.updateOne(vo);
		
		response.sendRedirect("guestList.jsp");
	}
%>
</body>
</html>