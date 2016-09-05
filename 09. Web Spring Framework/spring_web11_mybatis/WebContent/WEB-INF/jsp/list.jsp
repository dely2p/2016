<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>

	<table>
		<tr>
			<th>부서번호</th>
			<th>부서명</th>
			<th>부서위치</th>
		</tr>
	<c:forEach var="vo" items="${list }">
		<table>
			<tr>
				<td>${vo.deptno }</td>
				<td>${vo.dname }</td>
				<td>${vo.loc }</td>
			</tr>
		</table>
	</c:forEach>
	</table>

</body>
</html>