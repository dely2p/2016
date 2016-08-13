<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
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
	String b = request.getParameter("bno");

	if(b==null || b.equals("")){
		response.sendRedirect("boardList.jsp");
	}else{
		int bno = Integer.parseInt(b);
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String contents = request.getParameter("ir1");
		System.out.println(title);
		
		// db 연결객체 생성
		BoardDAO dao = new BoardDAO();
		// vo 객체
		BoardVO vo = new BoardVO();
		vo.setBno(bno);
		vo.setWriter(writer);
		vo.setTitle(title);
		vo.setContents(contents);
		
		dao.updateOne(vo);
		// db에 updateOne() 호출
		response.sendRedirect("boardList.jsp");
		
		dao.close();
	}
%>
</body>
</html>