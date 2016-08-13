<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/main.css"/>
</head>
<body>
	<div id="container">
	<%
		String fname = request.getParameter("fname");
	%>
	<%@ include file="header.jsp" %>
	<%@ include file="nav.jsp" %>
	<%-- <%@ include file="leftContents.jsp" %> --%>

	
	<%
		if(fname==null || fname.equals("")){
	%>
			<%@ include file="leftContents.jsp" %>
	<%
		}
		else{
			fname +=".jsp";
	%>
		<!-- 1. include directive : 소스 copy&paste(정적페이지) -->
		<!-- 2. jsp Action tag : 동적페이지  -->
		<jsp:include page="<%=fname %>"/>
	<%
		}
	%>
		<%@ include file="sideBar.jsp" %>
	<%@ include file="footer.jsp" %>
	</div>
</body>
</html>