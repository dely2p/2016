<%@page import="vo.PhotoBoardVO"%>
<%@page import="dao.PhotoBoardDAO"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
	// upload 디렉토리의 실제 경로 얻어오기
	String saveDir = request.getRealPath("/upload");
	//out.println(saveDir);
	
	// 첨부파일의 최대 크기
	int maxFileSize = 1024*1024*100; // 100MB저장
	// MultipartRequest(요청객체, 저장디렉토리, 최대파일크기, 인코딩타입, 동명파일처리규정객체)
	MultipartRequest mr = new MultipartRequest(request, saveDir,maxFileSize,"UTF-8", new DefaultFileRenamePolicy());
	
	
	String title = mr.getParameter("title");
	String contents = mr.getParameter("contents");
	String writer = mr.getParameter("writer");
	String filename = mr.getParameter("filename");
	//String regdate = mr.getParameter("regdate");
	
	String f = mr.getOriginalFileName("filename");
	
	PhotoBoardDAO dao = new PhotoBoardDAO();
	PhotoBoardVO vo = new PhotoBoardVO();
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setContents(contents);
	vo.setFilename("../upload/"+f);
	
	dao.insertOne(vo);
	
	
	/* String title = mr.getParameter("title");
	String writer = mr */
%>
	제목 : <%=title %>
	작성자 : <%=writer %>
	내용 : <%=contents %>
	파일명 : <%=f %>
	<!-- db에서 가져온 파일들의 목록 -->
	
	<a href="view.jsp">목록보기</a>
	<a href="dirView.jsp">파일저장 디렉토리</a>
</body>
</html>