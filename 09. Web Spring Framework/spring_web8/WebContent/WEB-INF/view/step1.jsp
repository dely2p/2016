<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<!-- <script type="text/javascript">
	$(function(){
		$("input:button").on("click",function(){
			//alert("버튼");
			if($("input:checkbox").prop("checked")){
				location.href = "step2.do";
			}else{
				alert("약관을 동의하시오!");
			}			
		})
	})

</script> -->
</head>
<body>
	<h2>회원가입</h2>
	
	<h3>약관동의</h3>
	<textarea rows="10" cols="30">
당신의 소중한 개인정보는 우리 회사의 이익을 위해서
마음대로 사용하겠습니다. 하하하^^
		
개인정보 냠냠 감사합니다.
	</textarea>
	<form action="step2.do">
		<input type="checkbox" name="ck" id="agree" value="true" />약관동의
		<input type="submit" id="btn" value="다음" />
	</form>

</body>
</html>