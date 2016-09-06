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
			<th>사원번호</th>
			<td><input type="text" name="empno" id="" /></td>
		</tr>
		<tr>
			<th>사원명</th>
			<td><input type="text" name="ename" id="" /></td>
		</tr>
		<tr>
			<th>직무</th>
			<td><input type="text" name="job" id="" /></td>
		</tr>
		<tr>
			<th>선임</th>
			<td><input type="text" name="mgr" id="" /></td>
		</tr>

		<tr>
			<th>월급</th>
			<td><input type="text" name="sal" id="" /></td>
		</tr>
		<tr>
			<th>보너스</th>
			<td><input type="text" name="comm" id="" /></td>
		</tr>

		<tr>
			<td><input type="submit" value="입력"></td>
			<td><input type="button" value="되돌아가기"></td>
		</tr>
	</table>
	</form>

</body>
</html>