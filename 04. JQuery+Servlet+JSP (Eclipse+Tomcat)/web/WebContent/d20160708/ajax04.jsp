<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
 #img{
	width: 250px;
	height: 250px;
	position: absolute;
 	top:450px;
 	left: 100px;
 	
}
 #div1{
 	width: 100px;
 	height: 100px;
 	background-color: red;
 	position: absolute;
 	top:250px;
 	left: 100px;
 }
 #div2{
	width: 100px;
 	height: 100px;
 	background-color: blue;
 	position: absolute;
 	top:250px;
 	left: 260px;
 }
 
</style>
<script type="text/javascript" src="../js/httpRequest.js"></script>
<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">

	$(function(){
		$("#btn").on("click",function(){		
			var data = $("#txt").val();
			var params = "name="+data;
			console.log(params);
			sendRequest("datasearch.jsp", params, showImg, "GET");
		});
		$("#div1").on("mouseenter",function(){
			console.log("마우스엔터");
			var data = $("#txt").val();
	 		/* var params = "name="+data;
			console.log(params);  */
			sendRequest("datasearch.jsp", "name=iron", showImg, "GET");
		})
		$("#div2").on("mouseover",function(){
			console.log("마우스오버");
			var data = $("#txt").val();
	 		/* var params = "name="+data;
			console.log(params);  */
			sendRequest("datasearch.jsp", "name=PARK", showImg, "GET");
		})
	})
	function showImg(){
		if(xhr.readyState==4 && xhr.status==200){
			var data =  xhr.responseText;
			data = data.trim();
			$("img").attr("src",data);
			
		}
	}
	


</script>
</head>
<body>
<h2>사진검색</h2>
	<input type="text" name="keyword" id="txt">
	<input type="button" value="검색" id="btn">
	<div id="img">
		<img alt="" src="">
	</div>
	<div id="div1"></div>
	<div id="div2"></div>
</body>
</html>