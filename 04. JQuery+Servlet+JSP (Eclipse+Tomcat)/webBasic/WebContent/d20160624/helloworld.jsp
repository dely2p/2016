<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		/* 구구단 출력 */
		
		for(int i=1;i<10;i++){
			for(int j=2;j<10;j++){
				out.println(" [ "+j+" * "+i+" = "+i*j+" ] ");
			}
			out.println("<br>");
		}
	--%>
	
	
	<hr>
	<%
		int c = a+b;
	out.println("합계는 "+c);
	%>
	<%!
		int a = 20;
		int b = 10;
		
	%>
</body>
</html>