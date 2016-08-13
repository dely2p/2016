<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="registerOk.jsp">
<h1>회원가입</h1>
<table>
	<tr>
		<th>ID</th>
		<td><a><input type="text" name="id"/></a></td>
	</tr>
	<tr>
		<th>PW</th>
		<td><a><input type="text" name="pw"/></a></td>
	</tr>
	<tr>
		<th>NAME</th>
		<td><a><input type="text" name="name"/></a></td>
	</tr>
	<tr>
		<th>TEL</th>
		<td><a><input type="text" name="tel"/></a></td>
	</tr>
	<tr>
		<th>EMAIL</th>
		<td><a><input type="text" name="email"/></a></td>
	</tr>
	<tr>
		<td><a href="registerOk.jsp"><input type="submit" value="가입하기"/></a></td>
		<td><a href="login.jsp"><input type="button" value="취소"/></a></td>
	</tr>
</table>
</form>
</body>
</html>