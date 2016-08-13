<%@page import="vo.MemberVO"%>
<%@page import="dao.MemberDAO"%>
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
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String email = request.getParameter("email");	
	
	MemberDAO dao = new MemberDAO();
	MemberVO vo = new MemberVO();
	vo.setId(id);
	vo.setPw(pw);
	vo.setName(name);
	vo.setTel(tel);
	vo.setEmail(email);

	dao.insertData(vo);
	
	if(vo != null){
		%>
		<h2><%=vo.getName() %>님 가입되었습니다.</h2>
		<%
	}else{
		Thread.sleep(3000);
		response.sendRedirect("login.jsp");		
	}
%>
</body>
</html>