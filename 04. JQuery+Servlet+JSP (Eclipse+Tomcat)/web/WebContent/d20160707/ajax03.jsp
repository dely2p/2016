<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"  src="../js/httpRequest.js"></script>
<script type="text/javascript">
	
	function helloToServer(){
		var name = document.getElementById("name").value;
		// hello.jsp?name=abc
				
		var params = "name="+name;
		// sendRequest(주소, 전달할 파라미터, 콜백함수명, GET)
		sendRequest("hello.jsp", params, callback, "GET");
				
	}
	
	function callback(){
		if(xhr.readyState==4 && xhr.status==200){
			var data = xhr.responseText;
			data = data.trim();
			var div = document.getElementById("div1");
			if(data=='true'){
				div.innerHTML="존재하는 아이디입니다";
			}else{
				div.innerHTML="사용가능한 아이디입니다";
			}
		}
	}


</script>
</head>
<body>
	<form action="" method="get" name="frm"></form>
	<input type="text" name="name" id="name" onkeyup="helloToServer()"/>	
	<input type="button" value="입력" id="btn" onclick="helloToServer()"/>
	<span id="div1">
	
	</span> <!-- 해당 컨텐츠를 감쌀만큼만 영역 차지 -->
	
	<!-- <div id="div1">하하하</div> 오른쪽까지 영역차지 -->
</body>
</html>