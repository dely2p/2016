<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<h2>회원가입</h2>
	<form action="registerOk.do">
		<table>
			<tr>
				<th>ID</th>
				<td><input type="text" name="id" id=""></td>
			</tr>
			<tr>
				<th>PW</th>
				<td><input type="text" name="pw" id=""></td>
			</tr>
			<tr>
				<th>confirm</th>
				<td><input type="text" name="confirm" id=""></td>
			</tr>
			<tr>
				<th>email</th>
				<td><input type="text" name="email" id=""></td>
			</tr>
			<tr>
				<td><input type="submit" value="가입"></td>
				<td><input type="button" value="돌아가기" name="back"></td>
			</tr>
			
		</table>	
	
	</form>
</body>
</html>