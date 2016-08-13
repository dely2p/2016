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
	// pageContext : 현재 JSP 페이지의 컨텍스트를
	// 나타내는 객체로서
	// 내장객체를 얻어오거나, 페이지의흐름제어,
	// 에러 데이터를 얻어올 때 주로 사용하는 객체
	
	// 내장 객체의 속성갑 사용하기
	pageContext.setAttribute("id1", "aaa");
	request.setAttribute("id2", "bbb");
	session.setAttribute("id3", "ccc");
	application.setAttribute("id4", "ddd");
	
	// 내장객체의 속성값 가져오기
	out.println("pageContext : "+pageContext.getAttribute("id1"));
	out.println("request : "+request.getAttribute("id2"));
	out.println("session : "+session.getAttribute("id3"));
	out.println("application : "+application.getAttribute("id4"));
	
	RequestDispatcher rd = request.getRequestDispatcher("page2.jsp");
	rd.forward(request, response); // 요청객체가 살아서 넘어감(정보를 계속 물고 넘어감)
	
%>
<a href="page2.jsp">페이지2로 이동</a>
</body>
</html>