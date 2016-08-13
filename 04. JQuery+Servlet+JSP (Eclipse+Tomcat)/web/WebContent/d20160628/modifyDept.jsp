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
	String d = request.getParameter("dno");
	if(d==null || d.equals("")){
		response.sendRedirect("deptList2.jsp");
	}else{
		DeptDAO dao = new DeptDAO();
		int dno = Integer.parseInt(d);
		DeptVO vo = dao.selectOne(dno);
	

%>
<form action="modifyOK.jsp">
	<h3>수정페이지</h3>

		<table>
			<tr>
				<th>DEPTNO</th>
				<th>DNAME</th>
				<th>LOC</th>
			</tr>
			<tr>
				<td>
					<a><input type="text" name="dno" value=<%=vo.getDeptno()%>></a>
				</td>
				<td>
					<a><input type="text" name="name" value=<%=vo.getDname()%>></a>				
				</td>
				<td>
					<a><input type="text" name="loc" value="<%=vo.getLoc()%>"></a>
				</td>
			</tr>
			<tr>
				<td>
					<a><input type="submit" value="수정완료"></a>
					<a><input type="submit" value="취소"></a>
				</td>
			</tr>
		</table>
</form>
<%
	}
%>
</body>
</html>