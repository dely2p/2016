<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function closeWindow(){
		// 폼 전송하기
		document.frm.submit();
/* 		console.log("닫기버튼 누름");
		// 체크박스가 선택되었는지 여부를 콘솔에 출력?
		if(popupNo.checked){
			console.log("체크박스 체크됨");
		}
		//window.close();
 */		
	}
</script>
<style type="text/css">
img{
	width: 350px;
	height: 350px;
}
</style>
</head>
<body>
<%
	// 파라미터 값을 읽어오기
	String chk = request.getParameter("chk");
	String flag = request.getParameter("flag");
	
	System.out.println("flag : "+flag);
	
	if(chk!=null){
		// 팝업창을 띄우기를 원하지 않는다면
		// 쿠키를 생성해서 심어 놓는다.
		Cookie c = new Cookie("popup","no");
		// 1분짜리
		c.setMaxAge(60);
		response.addCookie(c);
	
%>
<script type="text/javascript">
	self.close();
</script>
<%
}//if end

%>
<script type="text/javascript">
	//self.close();
</script>
	<h3>팝업창입니다</h3>
	<img alt="아이폰" src="../images/iphone7.jpg">
<form action="popup.jsp" name="frm">
	<input type="checkbox" id="popupNo" name="chk">오늘은 다시안볼래요~~</input>
	<input type="hidden" name="flag" value="false"/>
	<a href="javascript:closeWindow()">닫기</a>
</form>
</body>
</html>