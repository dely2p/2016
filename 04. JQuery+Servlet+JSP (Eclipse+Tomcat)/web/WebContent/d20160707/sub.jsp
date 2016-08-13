<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var btn = document.getElementById("btn2");
		btn.onclick = function(){
			var addrs1 = document.getElementById("txt1").value;
			var addrs2 = document.getElementById("txt2").value;
			
			opener.document.getElementById("txt1").value = addrs1; // 나를 열어준 부모 문서의 아이디가 txt1의 값으로 addrs1을 주겠다.
			opener.document.getElementById("txt2").value = addrs2;
			
			console.log(addrs1);
			console.log(addrs2);
		};
	}
</script>
</head>
<body>
<h2>우편번호 검색</h2>
	<input type="text" name="addrs1" id="txt1" size="5"/>-
	<input type="text" name="addrs2" id="txt2" size="5"/>
	<input type="button" value="완료" id="btn2"/>
</body>
</html>