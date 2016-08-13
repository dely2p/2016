<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	/* db에 가서 해당 아이디가 존재하는지 여부를 판단해서 flag로 출력 */
	String id = request.getParameter("name");
	if(id==null || id.equals("")){
		out.println("id를 입력하세요");
	}else{
		MemberDAO dao = new MemberDAO();
		boolean flag = dao.isExist(id);
		out.println(flag);
		
		dao.close();  
	}
	
%>