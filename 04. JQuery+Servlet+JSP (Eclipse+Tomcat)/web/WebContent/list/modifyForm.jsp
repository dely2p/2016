<%@page import="vo.ListVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ListDAO"%>
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
	String g = request.getParameter("gno");
	
	if(g==null || g.equals("")){
		response.sendRedirect("guestList.jsp");		
	}else{		
		int gno = Integer.parseInt(g);
		ListDAO dao = new ListDAO();
		ListVO vo = dao.selectOne(gno);	  
	
%>
<form action="writeOk.jsp">
	<table>
		<tr>
			<th>작성자</th>
			<td>
			<input type="text" name="writer" value="<%=vo.getWriter()%>"> <!-- 안보여 -->
			<input type="hidden" name="gno" value="<%=vo.getGno() %>" />
			</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea name="contents" id="" cols="90" rows="20"><%=vo.getContents()%></textarea></td>
		</tr>
	
		<tr>
			<td colspan="2">
				<a href="modifyOk.jsp"><input type="submit" value="저장"/></a>
				<a href="guestList.jsp"><input type="button" value="목록" /></a>
			</td>
		</tr>
	</table>
</form>
<%
	}
%>

</body>
</html>