<%@page import="vo.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table,tr,td {
		border: 1px solid black;
		border-collapse: collapse;		
	}
	img{
		width: 50px;
		height: 50px;
		float: right;
	}
</style>
</head>
<body>
<%
	BoardDAO dao = new BoardDAO();	
	ArrayList<BoardVO> list = dao.selectAll(); 
	dao.close();

%>
<table>
	<tr>
		<th>게시물번호</th>
		<th>작성자</th>
		<th>제목</th>
		<th>작성일시</th>
		<th>조회수</th>
	</tr>
	<%
		for(BoardVO vo : list){
	%>
	<tr>
		<td><%=vo.getBno()%></td>
		<td><%=vo.getWriter() %></td>
		<td><a href="boardDetail.jsp?bno=<%=vo.getBno()%>"><%=vo.getTitle()%></a></td>
		<td><%=vo.getRegdate()%></td>
		<td><%=vo.getHits()%></td>
	</tr>
	<%
		}
	%>
	<tr>
		<td colspan="5">
			<a href="writeForm.jsp"><img alt="글쓰기" src="../images/pencil.png"></a>
		</td>
	</tr>
</table>

</body>
</html>