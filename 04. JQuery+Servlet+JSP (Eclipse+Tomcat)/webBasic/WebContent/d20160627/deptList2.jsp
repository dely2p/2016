<%@page import="vo.DeptVO"%>
<%@page import="java.util.ArrayList"%>
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
	DeptDAO dao = new DeptDAO();
	ArrayList<DeptVO> list = dao.selectAll();

%>
<h1>부서정보</h1>

<table>
	<tr>
		<th>부서번호</th>
		<th>부서명</th>
		<th>위치</th>
	</tr>
	<%
		for(DeptVO vo : list){
			//out.println("hello");
	%>
	<tr>
		<td><%=vo.getDeptno() %></td>
		<td><%=vo.getDname() %></td>
		<td><%=vo.getLoc() %></td>
	</tr>
	<%
		}
	%>
</table>
</body>
</html>