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
	String ename = request.getParameter("name");
	String job = request.getParameter("job");
	String s = request.getParameter("sal");
	String d = request.getParameter("deptno");
	
	
	if(ename==null){

%>
<form action="">
	<table>
		<tr>
			<th>ENAME</th>
			<td>
				<input type="text" name="name" id=""/>
			</td>
		</tr>
		<tr>
			<th>JOB</th>
			<td>
				<input type="text" name="job" id=""/>
			</td>
		</tr>
		<tr>
			<th>SAL</th>
			<td>
				<input type="text" name="sal" id=""/>
			</td>
		</tr>
		<tr>
			<th>DEPTNO</th>
			<td>
				<input type="text" name="deptno" id=""/>
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="입력"/>
			</td>
		</tr>
	</table>
</form>
<%
	}else{
		
		int sal = Integer.parseInt(s);
		
		int deptno = Integer.parseInt(d);
		System.out.println("sal : "+sal);
		System.out.println("deptno : "+deptno);
		EmpDAO dao = new EmpDAO();
		EmpVO vo = new EmpVO();
		vo.setEname(ename);
		vo.setJob(job);
		vo.setSal(sal);
		vo.setDeptno(deptno);
		dao.insert(vo);		
	}
%>
</body>
</html>