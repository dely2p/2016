<%@page import="java.util.Date"%>
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
/* 	[2016년 6월 24일 20시 50분 50초 형식] */
		Date d = new Date();
		out.println(d.getYear()+1900+"년 ");
		out.println(d.getMonth()+"월 ");
		out.println(d.getDay()+"일 ");
		out.println(d.getHours()+"시");
		out.println(d.getMinutes()+"분");
		out.println(d.getSeconds()+"초");
	%>
</body>
</html>