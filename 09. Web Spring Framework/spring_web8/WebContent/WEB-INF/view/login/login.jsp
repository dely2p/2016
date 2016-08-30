<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("input:button").on("click",function(){
			//alert("버튼");
			location.href = "register/step1.do";
			
		})
	})

</script>
</head>
<body>
	<h1>login.jsp페이지 입니다.</h1>
	<form action="loginOk.do">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" id=""></td>
			</tr>
			<tr>
				<td>PW</td>
				<td><input type="text" name="pw" id=""></td>
			</tr>
			<tr>
				<td><input type="submit" value="로그인"></td>
				<td><input type="button" value="회원가입"></td>
			</tr>
		</table>
	</form>
</body>
</html>