<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test1</title>
</head>
<body>
	<h3>좋아하는 걸그룹?</h3>
	<form action="resultView.jsp" method="post">
		<input type="checkbox" name="girl" value="씨스타">씨스타
		<input type="checkbox" name="girl" value="소녀시대">소녀시대
		<input type="checkbox" name="girl" value="원더걸스">원더걸스
		<input type="checkbox" name="girl" value="샤크라">샤크라
		<input type="checkbox" name="girl" value="핑클">핑클
		<br><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>