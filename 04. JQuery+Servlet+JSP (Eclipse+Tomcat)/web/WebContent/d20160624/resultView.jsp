<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, td {
		border: 1px solid black;
		border-collapse: collapse;
	}
	table {
		width: 300px;
		height: 100px;
	}
	#tr1 {
		background-color: #a3c3c3
	}
</style>
</head>
<body>
	
	<table>
		<tr id="tr1">
			<td colspan="1">당신이 선택한 걸그룹은?</td>
		</tr>
		<%
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			String[] str = 
				request.getParameterValues("girl");
			for(String x : str){
		%>
		<tr>
			<td><%=x %></td>
		</tr>	
		<%
			}
		%>
		</table>
</body>
</html>