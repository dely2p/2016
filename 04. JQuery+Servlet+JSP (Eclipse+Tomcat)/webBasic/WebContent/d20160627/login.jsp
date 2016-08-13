<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
$(function(){
	$("input[type='button']").on("click",function(){
		console.log("푸하하");
		location.href = "./register.jsp"
		
	});	
});
	
</script>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
<%
		Object obj = session.getAttribute("id");
	 	if(obj == null){
	 		

	 %>
	<form action="logOk.jsp" method="post">
		<div>
			<table>
				<tr>
					<td>ID</td>
					<td>
						<input type="text" name="id"/>
					</td>
				</tr>
				<tr>
					<td>PW</td>
					<td>
						<input type="password" name="pw"/>
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="로그인"> 
					</td>
					<td>
						<input type="button" value="회원가입"> 
					</td>
				</tr>			
			</table>		
		</div>		
	</form>
	<%
	} else{
		String id = (String)obj;
		String name = (String)session.getAttribute("name");
	
	%>
	<div>
		<a href="logout.jsp"><%=name %>님 로그아웃</a>
	</div>
	<img alt="한잔콜?" src="../images/bo1.gif"/>
	<%
	 	}
	%>
</body>
</html>