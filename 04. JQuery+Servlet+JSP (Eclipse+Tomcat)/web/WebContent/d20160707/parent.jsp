<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
window.onload = function(){
	var btn1 = document.getElementById("btn1");
	btn1.onclick = function(){
		console.log("테스트 메세지");
		var popupwin = window.open("sub.jsp","child","width=300, height=300, left=300, top=300");
	}
}

/* $(function(){
	$(button).onclick(a>href,"sub.jsp");
});
 */	

</script>
</head>
<body>
	<input type="text" name="data1" id="txt1" size="5"/>-
	<input type="text" name="data2" id="txt2" size="5"/>
	<input type="button" value="popup" id="btn1"/>
</body>
</html>