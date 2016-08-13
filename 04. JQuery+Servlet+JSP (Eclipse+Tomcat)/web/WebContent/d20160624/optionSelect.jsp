<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(function(){		
		$("select").on("change",function(){
			
			$("form").attr("action","printGuGuDan.jsp"); // 값을 가지고 다음 페이지로 전달
			//$("form").attrmethod="get";
			$("form").submit();
			
			/* console.log($("option").val());
			location.href = "http://localhost:8080/webBasic/d20160624/printGuGuDan.jsp?gugu=$(this).val"; */

		}); 
	});
</script>
</head>
<body>
<form action="">
	<h1>구구단을 선택하세요~~!</h1>
	<select name="gugu">
		<option value="1">1단</option>
		<option value="2">2단</option>
		<option value="3">3단</option>
		<option value="4">4단</option>
		<option value="5">5단</option>
		<option value="6">6단</option>
		<option value="7">7단</option>
		<option value="8">8단</option>
		<option value="9">9단</option>
	</select>
</form>
</body>
</html>