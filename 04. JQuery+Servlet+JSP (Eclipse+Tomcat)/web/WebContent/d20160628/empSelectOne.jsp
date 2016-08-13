<%@page import="dao.EmpDAO"%>
<%@page import="vo.EmpVO"%>
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
	String no = request.getParameter("no");
	if(no==null){
%>
<form action="">
	<input type="text" name="no">
	<input type="submit" value="검색하기">
</form>
<%
	}else{
		int n = Integer.parseInt(no);
		EmpDAO dao = new EmpDAO();
		EmpVO vo = dao.selectOne(n);		

%>

<table>
	<tr>
		<th>EMPNO</th>
		<th>ENAME</th>
		<th>JOB</th>
		<th>SAL</th>
		<th>DEPTNO</th>
	</tr>
	<tr>
		<td><%=vo.getEmpno()%></td>
		<td><%=vo.getEname()%></td>
		<td><%=vo.getJob()%></td>
		<td><%=vo.getSal()%></td>
		<td><%=vo.getDeptno()%></td>
	</tr>
</table>

<%
	
	}
%>
</body>
</html>