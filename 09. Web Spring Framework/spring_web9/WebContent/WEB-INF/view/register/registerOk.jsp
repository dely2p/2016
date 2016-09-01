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
		//주기적으로 특정함수 호출
		/* setTimeout(함수명, 시간) 1회 
		setInterval(함수명, 시간) 반복 */
		setTimeout(function(){
			location.href="../login.do";
		},3000)
	})
</script>
</head>
<body>
	<h1>가입 축하합니다.</h1>
	<h3>3초후에 로그인 페이지로 이동합니다.</h3>
</body>
</html>