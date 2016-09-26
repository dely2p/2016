<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<h1>uploadFile.jsp</h1>
	${fileName}
	<!-- 파일 다운로드 기능 -->
	
	<form action="download.do" method="post">
		<input type="hidden" name="filename" value="${fileName}"/>
		<input type="submit" value="다운로드">
	</form>
</body>
</html>