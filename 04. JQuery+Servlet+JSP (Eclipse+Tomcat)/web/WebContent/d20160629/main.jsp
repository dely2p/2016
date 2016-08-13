<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/main.css" />

</head>
<body>
<div id="container">
	<div id="header">
		<img alt="로고" src="../images/logo.PNG">
	</div>
	<div id="nav">
		<a href="news.jsp">뉴스</a>
		<a href="enter.jsp">연예</a>
		<a href="shopping.jsp">쇼핑</a>
		<a href="movie.jsp">영화</a>
		<a href="cook.jsp">요리</a>
	</div>
	<div id="leftContents">
		<ul>
			<li>팔찌 살려줘!</li>
			<li>재주토끼 사망!</li>
			<li>리눅스시험으로 대량 결석</li>
			<li>현장에 있는 이슬씨의 참담한 현실.</li>
		</ul>	
	</div>
	<div id="sideBar">
	<div id="loginForm">
		<form action="loginOk.jsp">
			<table>
				<caption>로그인</caption>
					<tr>
						<td>ID</td>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>
						<td>PW</td>
						<td><input type="password" name="pw"></td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="로그인"/>
							<input type="button" value="회원가입"/>
						</td>
					</tr>		
			</table>
		</form>
	</div>
	<div id="rightDown">
		<ul>
			<li>하단기사1</li>
			<li>하단기사2</li>
			<li>하단기사3</li>
			<li>하단기사4</li>
		</ul>
	</div>
	</div>
	<div id="footer">
	<hr color="blue">
		<span>아영쇼핑몰</span>
		없는 거 빼고 다 있음
		copyright &copy; <br/>
		1992~2016 all rights reserved.
	</div>
</div>
</body>
</html>