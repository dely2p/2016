<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<!-- <script type="text/javascript" src="resources/js/main.js"></script>
 -->
 	<spring:url var="mainCss" value="/resources/css/main.css"></spring:url>
	<spring:url var="mainJs" value="/resources/js/main.js"></spring:url>
	<link rel="stylesheet" href='${mainCss}' />
	<script type="text/javascript" src='${mainJs}'></script>
	

</head>
<body>

	<table>
		<tr>
			<th>부서번호</th>
			<th>부서명</th>
			<th>부서위치</th>
		</tr>
	<c:forEach var="vo" items="${list }">
	
			<tr>
				<td>${vo.deptno }</td>
				<td>${vo.dname }</td>
				<td>${vo.loc }</td>
			</tr>
		
	</c:forEach>
	<tr>
		<td colspan="3">
			<!-- 버튼 누르면 add.do 호출해서 insertForm.jsp 찾아가게 자바스크립트 작성 -->
			<!-- <a href="add.do"> -->
				<input type="button" value="부서추가">
			<!-- </a> -->
		</td>
	</tr>
	</table>

</body>
</html>