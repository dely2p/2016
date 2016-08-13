<%@page import="dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/* dno라는 파라미터의 값을 숫자로 가져오기 */
	
	String d = request.getParameter("dno");
	

	if(d!=null || d.equals("")){
		int dno = Integer.parseInt(d);
		DeptDAO dao = new DeptDAO();
		dao.deleteOne(dno);
		dao.close();
		
		// 포워드 방식
		/*RequestDispatcher rd = request.getRequestDispatcher("deptList2.jsp");
		rd.forward(request, response); */
		
		// 리다이렉트 방식
		response.sendRedirect("deptList2.jsp");
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
	
</body>
</html>