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
<style type="text/css">
	table, th, td {
		border: 1px solide black;
		border-collapse: collapse;
	}
	table {
		width: 500px;
		margin: 0 auto;
		text-align: center;
	}
</style>
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
		<th>삭제버튼</th>
		<th>수정버튼</th>
		
	</tr>
	<%
		for(DeptVO vo : list){
			//out.println("hello");
	%>
	<tr>
		<td><a href="deleteDept.jsp?dno=<%=vo.getDeptno() %>"><%=vo.getDeptno() %></a></td>
		<td><%=vo.getDname() %></td>
		<td><%=vo.getLoc() %></td>
		<td>
		<a href="deleteDept.jsp?dno=<%=vo.getDeptno() %>">
		<input type="button" value="삭제"/>
		</a></td>
		<td>
		<a href="modifyDept.jsp?dno=<%=vo.getDeptno() %>">
		<input type="button" value="수정"/>
		</a></td>
	</tr>
	<%
		}
		dao.close();
	%>
</table>
</body>
</html>