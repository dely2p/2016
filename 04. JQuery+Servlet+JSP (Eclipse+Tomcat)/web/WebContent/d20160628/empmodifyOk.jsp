<%@page import="vo.EmpVO"%>
<%@page import="dao.EmpDAO"%>
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
	String e = request.getParameter("empno");
	System.out.println("String e : "+e);
	if(e == null || e.equals("")){
		out.println("비정상적인 접근입니다.");
	}else{
		int empno = Integer.parseInt(e);
		String ename = request.getParameter("ename");
		String s = request.getParameter("sal");
		String job = request.getParameter("job");
		String dno = request.getParameter("deptno");
		int sal = Integer.parseInt(s);
		int deptno = Integer.parseInt(dno);
		
		EmpDAO dao = new EmpDAO();
		EmpVO vo = new EmpVO(empno, ename, sal, job, deptno);
		dao.updateOne(vo);
		response.sendRedirect("empList.jsp");
		dao.close();	
	//
	}
%>
</body>
</html>