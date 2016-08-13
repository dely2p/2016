<%@page import="java.util.ArrayList"%>
<%@page import="dao.EmpDAO"%>
<%@page import="vo.EmpVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

	table,tr,td,th {
		border: 1px solid black;
		border-collapse: collapse;
	}
	td {
		padding: 10px;
	}
</style>
</head>
<body>
<%
	EmpDAO dao = new EmpDAO();
	ArrayList<EmpVO> list = dao.selectAll();
%>

<h1>사원정보</h1>
<table>
	<tr>
		<th>사원번호</th>
		<th>사원명</th>
		<th>급여</th>
		<th>업무</th>
		<th>부서번호</th>
	</tr>
	<%
		for(EmpVO vo : list){
		
	%>
	<tr>
		<td><%=vo.getEmpno()%></td>
		<td><%=vo.getEname()%></td>
		<td><%=vo.getSal()%></td>
		<td><%=vo.getJob()%></td>
		<td><%=vo.getDeptno()%></td>
		<%
		}
		%>
	</tr>
</table>
</body>
</html>