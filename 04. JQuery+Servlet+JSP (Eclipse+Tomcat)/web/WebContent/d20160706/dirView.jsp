<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	img {
		width: 200px;
		height: 200px;
	}
</style>
</head>
<body>
<%
	String path = request.getRealPath("/upload");

	File f= new File(path);
	
	if(f.isDirectory()){
		String[] fList = f.list(); // 파일명을 배열형태로 가져옴
		for(String x: fList){
			
		
	
%>
	
	<img alt="<%=x %>" src="../upload/<%=x %>">
<%
			out.print("<h3>"+x +"</h3>");
		}
	}
%>
</body>
</html>