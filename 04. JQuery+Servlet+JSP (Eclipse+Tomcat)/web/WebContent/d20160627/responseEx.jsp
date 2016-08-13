<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>responseEx.jsp</title>
</head>
<body>
<%
	// 현재 페이지의 상태를 번호
	int status = response.getStatus();
	// 404 : 페이지를 찾을 수 없다.
	// 500 : 서버 오류
	// 405 : 지원하지 않는 방식일 때(get or post)
	// 200 : 정상
	
	out.println("<h1>정상 : "+status+"</h1>");
	
	/* 다른 페이지로 이동 */
	//response.sendRedirect("test1.jsp");
	
	
	/* RequestDispatcher rd = request.getRequestDispatcher("test1.jsp");
	rd.forward(request, response); */
	
%>
</body>
</html>