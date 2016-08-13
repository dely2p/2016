<%@page import="java.net.URLEncoder"%>
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
	/* 파라미터값 받아서 화면에 출력 */
	String txt = request.getParameter("txt");
	// 인코딩
	String data = URLEncoder.encode(txt);
	
	Cookie c = new Cookie("txt", data);
	// 쿠키 유통기한 주기
	c.setMaxAge(60*60*24); // 1분=60 / 하루=60*60*24 / 0이나 음수값은 쿠키 제거
	response.addCookie(c);
	
	System.out.println(txt);
%>
<a href="userCookieList.jsp">쿠키 목록 보기</a>
<%=txt %>
</body>
</html>