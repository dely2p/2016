<%@page import="dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String e = request.getParameter("empno");
	System.out.println(e);

	if(e!=null || e.equals("")){
		int eno = Integer.parseInt(e);
		EmpDAO dao = new EmpDAO();
		dao.deleteOne(eno);
		dao.close();
	}
	
	response.sendRedirect("empList.jsp");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>