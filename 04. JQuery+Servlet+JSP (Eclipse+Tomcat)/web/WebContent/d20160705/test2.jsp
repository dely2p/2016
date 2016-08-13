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
	/* Test3.jsp 이동하기
	a태그
	forward
	sendRedirect */
	/* 현재에서 test3.jsp이동 */
	/* RequestDispatcher rd = request.getRequestDispatcher("test3.jsp");
	rd.forward(request, response); */
	//response.sendRedirect("test3.jsp");
%>
<jsp:forward page="test3.jsp"></jsp:forward>
</body>
</html>