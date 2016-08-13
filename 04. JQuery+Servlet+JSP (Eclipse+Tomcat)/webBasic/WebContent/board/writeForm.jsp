<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	table,th,td{
		border: 1px solid black;
		border-collapse: collapse;
	}
	table{
		width: 800px;
		margin: 0 auto;
		text-align: center;
	}
	tr{
		height: 50px;
	}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="writeOk.jsp">
		<!-- table>caption>(tr>th+td)*4 -->
		<table>
			<caption>글쓰기 </caption>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="writer"/></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" size="50"/></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea name="contents" id="" cols="90" rows="20"></textarea></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="글쓰기" >
						<input type="button" value="되돌아가기" >
					</td>
				</tr>
			
		</table>
	</form>
</body>
</html>