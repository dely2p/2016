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
	System.out.println("=== e :" +e);
	if(e==null || e.equals("")){
		response.sendRedirect("empList.jsp");
	}else {
		int empno = Integer.parseInt(e);
		EmpDAO dao = new EmpDAO();
		EmpVO vo = dao.selectOne(empno);	
%>
	<form action="empmodifyOk.jsp">
		<table>
			<th>사원번호</th>
			<th>사원명</th>
			<th>급여</th>
			<th>업무</th>
			<th>부서번호</th>
			<tr>
				<td><a><input type="text" name="empno" value=<%=vo.getEmpno()%>></a></td>
				<td><a><input type="text" name="ename" value=<%=vo.getEname()%>></a></td>
				<td><a><input type="text" name="sal" value=<%=vo.getSal()%>></a></td>
				<td><a><input type="text" name="job" value=<%=vo.getJob()%>></a></td>
				<td><a><input type="text" name="deptno" value=<%=vo.getDeptno()%>></a></td>
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