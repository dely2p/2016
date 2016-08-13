<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	/* AJAX (Asynchronous Javascript and XML)
		브라우저 <==================> 웹서버
				비동기방식으로 통신
				XMLHttpRequest
	
	*/
	var xhr = null;
	// 크로스 브라우징
	function getXMLHttpRequest(){
		// MS 브라우저라면
		if(window.ActiveXObject){ // 버젼에 따라 다르므로 나눠서 적용
			try{
				return new ActiveObject("MsXML2.XMLHTTP");
			}catch (e) {
				try{
					return new ActiveXObject("Microsoft.XMLHTTP");
				}catch (e) {
					return null;
				}
			}
			// 그 외의 브라우저라면
		}else if(window.XMLHttpRequest){
			return new XMLHttpRequest();
		}else{
			return null;
		}
	}// getXMLHttpRequest() end
	
	function load(){
		// 1. XMLHttpRequest 객체 얻어오기
		xhr = getXMLHttpRequest();
		console.dir(xhr);
		
		// 2. callback 함수 정의(대기하고 있다가 응답이 오면 자동으로 호출되는 함수)
		xhr.onreadystatechange = callback;
		
		// 3. open("방식", 접근주소, 비동기화 여부)
		xhr.open("GET","test.jsp",true); // background로 통신객체가 가서 통신
		
		// 4. send();
		xhr.send(null);
	}
	
	function callback(){
		// 요청이 성공적으로 수행되었다면 응답 텍스트가 전달
		// 4번 호출됨
		// xhr 응답상태 : 0~4 
		// 완료 : 4
		// 정상페이지 호출 status : 200
		if(xhr.readyState==4 && xhr.status==200){
			//console.log(xhr.responseText);
			var div = document.getElementById("div");
			div.innerHTML = "<h2>"+xhr.responseText+"</h2>";
		}
	}
</script>
</head>
<body>
	<input type="button" value="데이터 가져오기" onclick="load()"/>
	<div id="div">
		<textarea name="aaa" rows="10" cols="30"></textarea>
		<a href="test.jsp">데이터 보러가기</a>
	</div>
</body>
</html>