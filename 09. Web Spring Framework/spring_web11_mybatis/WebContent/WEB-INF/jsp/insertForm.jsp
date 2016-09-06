<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<h1>insertForm.jsp 페이지</h1>
	<form action="add.do" method=post>
	<table>
		<tr>
			<th>부서번호</th>
			<td><input type="text" name="deptno" id="" /></td>
		</tr>
		<tr>
			<th>부서명</th>
			<td><input type="text" name="dname" id="" /></td>
		</tr>
		<tr>
			<th>부서위치</th>
			<td><input type="text" name="loc" id="" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="입력"></td>
			<td><input type="button" value="되돌아가기"></td>
		</tr>
	</table>
	</form>

</body>
</html>