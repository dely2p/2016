<%@page import="java.util.ArrayList"%>
<%@page import="vo.ListVO"%>
<%@page import="dao.ListDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table,th,td{
		border: 1px solid black;
	}
</style>
</head>
<body>
<%
	ListDAO dao = new ListDAO();
	ArrayList<ListVO> list = dao.selectAll();
	
	
%>
<table>
	<tr>
		<th>게시물번호</th>
		<th>작성자</th>
		<th>내용</th>
		<th>작성일시</th>

	</tr>
	<%
		for(ListVO vo : list){
	%>
	<tr>
		<td><%=vo.getGno()%></td>
		<td><%=vo.getWriter()%></td>
		<td><%=vo.getContents()%></td>
		<td><%=vo.getRegdate()%></td>
		<td><a href="deleteOk.jsp?gno=<%=vo.getGno()%>"><input type="button" value="삭제"></a></td>
		<td><a href="modifyForm.jsp?gno=<%=vo.getGno()%>"><input type="button" value="수정"></a></td>
	</tr>
	<%
		}
	%>
	<tr>
		<td colspan="4">
		<a href="writeForm.jsp"><input type="button" value="쓰기"></a>
		</td>

	</tr>
</table>
</body>
</html>