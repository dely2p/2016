<%@page import="vo.DeptVO"%>
<%@page import="dao.DeptDAO"%>
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
		String dno = request.getParameter("dno");
		//System.out.println("====dno :" + dno);
		if (dno == null || dno.equals("")) {
	%>
	<h3>비정상적인 경로의 접근입니다.</h3>
	<a href="deptList2.jsp">목록가기</a>
	<%
		} else {
			String dname = request.getParameter("dname");
			String loc = request.getParameter("loc");
			int deptno = Integer.parseInt(dno);

			DeptDAO dao = new DeptDAO();
			DeptVO vo = new DeptVO(deptno, dname, loc);
			dao.updateOne(vo);
			response.sendRedirect("deptList2.jsp");
			dao.close();
		}
	%>
</body>
</html>