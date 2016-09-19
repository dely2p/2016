<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("input[type='button']").on("click",function(){
			//console.log($("#email").val());
			var email = $("#email").val();
			var pattern = /^[a-zA-Z0-9_\-\.]+@[a-zA-Z0-9_\-]+\.[a-zA-Z0-9]{2,}/; // /패턴/g :globalian으로 여러개 찾아옴
			var result = email.match(pattern);
			if(!result){
				$("#warnEmail").attr("hidden",false);
				$("#email").val("").focus();				
			}else{
				$("#warnEmail").attr("hidden",true);
			}
			console.log("result : "+result);
		})
	})
</script>
</head>
<body>
	email : <input type="text" name="email" id="email"/><br/>
	<div id="warnEmail" hidden="true">
		<h3>잘못된 이메일 형식입니다.</h3>
	</div>
	<input type="button" value="확인">
</body>
</html>