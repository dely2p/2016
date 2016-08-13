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
	
	String gugu = request.getParameter("gugu");
	int dan = Integer.parseInt(gugu);
	out.println("<h1>구구단 "+gugu+"단</h1>");
	for(int i=1;i<10;i++)
		out.println("<h3>"+dan+" * "+i+" = "+dan*i+"</h3>");

%>
</body>
</html>