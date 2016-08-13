<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
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
		String b = request.getParameter("bno");

		if (!(b == null || b.equals(""))) {
		
			int bno = Integer.parseInt(b);
			BoardDAO dao = new BoardDAO();
			dao.deleteOne(bno);
			
		}
		response.sendRedirect("boardList.jsp");
	%>
</body>
</html>