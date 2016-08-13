<%@page import="vo.DeptVO"%>
<%@page import="dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>deptOne.jsp</title>
</head>
<body>
<%
	/* no parameter의 값을 출력 */
	String n = request.getParameter("no");
	if(n==null){
%>
<form action="">
	<h3>부서정보 검색</h3>
	<input type="text" name="no" id=""/>
	<input type="submit" value="검색하기">
</form>
<%
	}else{
		int no = Integer.parseInt(n);
		DeptDAO dao = new DeptDAO();
		DeptVO vo = dao.selectOne(no);
%>		 
		<!-- 표로 출력 -->
		<table>
			<tr>
				<th>DEPTNO</th>
				<th>DNAME</th>
				<th>LOC</th>
			</tr>
			<tr>
				<td><%=vo.getDeptno()%></td>
				<td><%=vo.getDname()%></td>
				<td><%=vo.getLoc()%></td>
			</tr>
		</table>
<%
	}
%>
</body>
</html>