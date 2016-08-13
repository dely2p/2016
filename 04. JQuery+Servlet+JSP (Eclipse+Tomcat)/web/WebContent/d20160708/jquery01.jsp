<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<style type="text/css">
	#box1{
		background-color: yellow;
	}
	.myStyle{
		width: 500px;
		height: 500px;
	}
</style>
<script type="text/javascript">
$(function(){
	$("#btn1").on("click",function(){
		console.log("눌림");
		/* $("#box1").css("background-color","green")
		.css("width","200px")
		.css("height","200px"); */
		$("#box1").css({
			"background-color":"green",
			"width":"200px",
			"height":"200px"
		});
	});
	$("#btn2").on("click",function(){
		console.log("눌림");
		var color = prompt("무슨색으로할래?");
		$("#box1").css({
			"background-color":color,
		});
	});
	$("#btn3").on("click",function(){
		console.log("눌림");
		var width = $("#box1").width();
		/*너비구하는 또다른 방법 : $("#box1").css("width"); */
		prompt("너비 : "+width);
		
	});
	$("#btn4").on("click",function(){
		console.log("눌림");
		$("#box1").addClass("myStyle");
	});
	$("#btn5").on("click",function(){
		console.log("눌림");
		$("#box1").removeClass("myStyle");
	});
	
	
	// 이미지에 마우스를 올려놓으면 빨간색 테두리 테두리추가하기
	$("#img").on("mouseenter",function(){
		//console.dir(box1);
		$("#img").css("border","solid red");
	});
	
	// 이미지에서 마우스가 나오면 빨간색 테두리 제거하기
	$("#img").on("mouseout",function(){
		console.log("눌림");
		$("#img").css("border","none");
	});
	
	
	
})
</script>
</head>
<body>


 	<input type="button" value="btn1" id="btn1">
 	<!-- box1의 배경 : 그린  너비 200px 높이 200px;
		1. 메서드 체인
		2. JSON
 -->
	<input type="button" value="btn2" id="btn2">
	<!-- 버튼 클릭시 어떤색으로 변경할 것인지 물어보고 box1의 배경색으로 변경
	prompt("무슨색으로 할래?"); -->
	<input type="button" value="btn3" id="btn3">
	<!-- box1의 너비를 구해서 경고창으로 띄우기 -->
	<input type="button" value="btn4" id="btn4">
	<!-- 버튼을 누르면 myStyle클래스를 추가 myStyle은 CSS로 정의 -->
	<input type="button" value="btn5" id="btn5">
	<!-- 버튼을 누르면 myStyle 클래스를 제거 -->
	
	<div id="box1">
	BOX1
	</div>
	
	<img src="../images/bo1.gif" alt="boyoung" id="img"/>

</body>
</html>