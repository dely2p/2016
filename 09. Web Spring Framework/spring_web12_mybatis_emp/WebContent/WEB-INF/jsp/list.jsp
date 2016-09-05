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
			<th>사원번호</th>
			<th>사원명</th>
			<th>Job</th>
			<th>상사</th>
			<th>입사일</th>
			<th>월급</th>
			<th>보너스</th>
			<th>부서번호</th>
		</tr>
	<c:forEach var="vo" items="${list }">
		<table>
			<tr>
				<td>${vo.empno }</td>
				<td>${vo.ename }</td>
				<td>${vo.job }</td>
				<td>${vo.mgr }</td>
				<td>${vo.hiredate }</td>
				<td>${vo.sal }</td>
				<td>${vo.comm }</td>
				<td>${vo.deptno }</td>
			</tr>
		</table>
	</c:forEach>
	</table>
</body>
</html>