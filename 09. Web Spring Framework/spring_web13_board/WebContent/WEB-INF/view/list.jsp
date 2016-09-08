<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!doctype html>
<html lang="en">
<head>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<table class="table">
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>조회수</th>
			<th>작성일시</th>
		</tr>
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.no}</td>
				<td>${dto.writer}</td>
				<td>${dto.title}</td>
				<td>${dto.hits}</td>
				<td>${dto.wdate}</td>
			</tr>
			
		</c:forEach>
		<tr>
			<td colspan="5">
				<a href="writeForm" class="tn btn-default">글쓰기</a>
			</td>
		</tr>
	</table>
</body>
</html>