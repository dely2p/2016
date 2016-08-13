<%@page import="java.net.URLDecoder"%>
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
	Cookie[] clist = request.getCookies(); // 브라우저 쿠키 목록 가져옴
	
	for(Cookie c : clist){
		String data = 
		URLDecoder.decode(c.getValue());
		out.println(c.getName()+" : "+data+"<br />");
	}
	
%>
</body>
</html>