<%@page import="java.util.ArrayList"%>
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
	<h1>취미</h1>
	<ul>
		<li>${hobby[0]}</li>
		<li>${hobby[1]}</li>
		<li>${hobby[2]}</li>
		<li>${hobby[3]}</li>
		<li>${hobby[4]}</li>
	</ul>
	
  <c:forEach var="item" items="${hobby}">	  
	  	<li>${item}</li>
  </c:forEach>
  
</body>
</html>