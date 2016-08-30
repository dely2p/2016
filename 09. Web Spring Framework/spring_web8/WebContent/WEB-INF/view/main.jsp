<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<p>첫 화면입니다.</p>
<%-- 	<%
		Object obj = session.getAttribute("id");
		if(obj!=null){
			String id = (String)obj;
	%>
	<h3><%=id %>님 환영합니다.</h3>
	<%
		}
	%> --%>

	<c:choose>
		<c:when test="${!empty id}">
		<h3>${id}님 환영합니다.</h3>
		</c:when>
		<c:otherwise>
	       <a href="login.do">로그인하러가기</a>
	    </c:otherwise>
	</c:choose>
</body>
</html>