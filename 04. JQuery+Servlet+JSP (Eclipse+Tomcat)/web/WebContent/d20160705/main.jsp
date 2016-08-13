<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		<%
		/* jsp가 먼저실행 */
		Cookie[] clist = request.getCookies();
		boolean isShow = true;  // 팝업창을 띄울지 여부

		if(clist != null){
			for(Cookie c : clist){
				// 쿠키이름
				String name = c.getName();
				String value = c.getValue();
				if(name.equals("popup")&&value.equals("no")){
					isShow = false;
					break; // for문 탈출
				}// if end
			}// for end			
		}
		if(isShow){
		%>
			window.open("popup.jsp", 'popup', 'width=400 height=400');
		<%
			}
		%>
	}
</script>
</head>
<body>
	<!-- 쿠키 목록 가져오기 -->
	<p>메인 페이지 입니다.</p>
	<p>공지사항을 보세요</p>

</body>
</html>