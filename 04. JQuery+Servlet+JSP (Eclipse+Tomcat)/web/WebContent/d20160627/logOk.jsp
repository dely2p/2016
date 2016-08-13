<%@page import="vo.MemberVO"%>
<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	/* jsp 파일이 서블릿으로 변환될 때 scriptlet 안쪽에 코드는 _jspService() 안쪽으로 들어가게 된다.
	이때 _jspService()안에 미리 선언되어있는 변수가 있는데 이런 변수를 내장 객체라고 한다. */
	
	/* _jspService(HttpServletRequest request, HttpServletResponse response) */	

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	/* out.println("id : "+id);
	out.println("pw : "+pw); */

%>
	<h2>입력하신 값은 <%=id %> : <%=pw %>입니다.</h2>
	<%--
		id가 aaa pw가 bbb이면 로그인처리하려고 한다.
		만약 다른 값이 들어오면 login.jsp로 이동시킨다.
	 --%>
	 
<% 
	MemberDAO dao = new MemberDAO();
	MemberVO vo = dao.selectOne(id, pw);

	if(vo != null){
		
		// 세션에 id를 name 속성에 담아놓고
		// 이 속성이 존재하면 로그인 되어 있는 상태
		session.setAttribute("id", vo.getId());
		session.setAttribute("name", vo.getName());
		%> 
		<h2><%=vo.getName() %>님 환영합니다.</h2>
		<a href="Login.jsp">메인화면가기</a>
		<%
		/* Thread.sleep(3000);
		response.sendRedirect("login.jsp");	 */
	}else{
		Thread.sleep(3000);
		response.sendRedirect("login.jsp");		
	}
%>
</body>
</html>