<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>테스트 페이지 입니다.</h1>
	<%
		String msg = request.getParameter("msg");
	%>
	<h4>전달받은 값 : <%=msg %></h4>
</body>
</html>