<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- html 주석 -->
	<%-- jsp 주석 --%>
	<%
		// 스트립트렛(Scriptlet)
		for(int i=0;i<5;i++)
			out.println("<h3>Helo Jsp World</h3>");
	/* 
		멀티라인 주석
	*/
	%>
</body>
</html>