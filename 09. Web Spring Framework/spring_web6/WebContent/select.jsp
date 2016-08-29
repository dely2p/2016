<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>	
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<!-- 사용자로부터 취미를 선택한 후에 이 값을 selectHobby.do로  -->
	<!-- <form action="selectHobby.do"> -->
	<form action="lunch.do">
		<h1>취미 선택</h1>
		
		<input type="checkbox" name="hobby" value="코딩하기">코딩하기
		<input type="checkbox" name="hobby" value="사이클">사이클
		<input type="checkbox" name="hobby" value="친구따라강남">친구따라강남
		<input type="checkbox" name="hobby" value="독서">독서
		<input type="checkbox" name="hobby" value="사이버낚시">사이버낚시
		<input type="submit" value="전송">
	</form>
</body>
</html>