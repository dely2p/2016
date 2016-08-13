<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function onlyUpper() {
		if((event.keyCode >= 97) && (event.keyCode <= 122)){
			document.getElementById("myText1").val = event.keyCode-32;
		}
		//console.log("호출");
	}
</script>
</head>
<body>
	<input type="text" name="myTest1" id="" onkeypress="onlyUpper();">
	<input type="text" name="myTest2" id="">
</body>
</html>