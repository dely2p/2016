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
	//no, loc가 없으면, 혹은 ""
	String name = request.getParameter("name");
	String loc = request.getParameter("loc");
	
	if(name==null || name.equals("")){
%>
<form action="">
	<table>
		<tr>
			<th>부서명</th>
			<td>
				<input type="text" name="name" id=""/>
			</td>
		</tr>
		<tr>
			<th>부서위치</th>
			<td>
				<input type="text" name="loc" id=""/>
			</td>
		</tr>
		<tr>
			<th colspan="2">
				<input type="submit" value="입력"/>
			</th>
			<td></td>
		</tr>
	</table>
</form>
<%
	}else{
		DeptDAO dao = new DeptDAO();
		DeptVO vo = new DeptVO();
		vo.setDname(name);
		vo.setLoc(loc);
		dao.insertOne(vo);
	}


%>

</body>
</html>