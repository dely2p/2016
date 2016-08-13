<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="writeOk.jsp">
	<table>
		<tr>
			<th>작성자</th>
			<td><input type="text" name="writer"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea name="contents" id="" cols="90" rows="20"></textarea></td>
		</tr>
	
		<tr>
			<td colspan="2">
				<a href="writeOk.jsp"><input type="submit" value="저장"/></a>
				<a href="guestList.jsp"><input type="button" value="목록" /></a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>