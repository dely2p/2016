<%@page import="vo.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table,tr,td {
		border: 1px solid black;
		border-collapse: collapse;		
	}
	img{
		width: 50px;
		height: 50px;
		float: right;
	}
</style>
</head>
<body>
<%
			
	int pageNo = 0;
	String p = request.getParameter("page");
	if(p == null || p.equals("")){
		pageNo = 1;
	}else{
		pageNo = Integer.parseInt(p);
	}
	int startNo = (pageNo-1)*10+1;
	int endNo = (pageNo*10);
	int startPage, endPage;
	out.println("pageNo : "+pageNo);
	out.println("startNo : "+startNo);
	out.println("endNo : "+endNo);
	BoardDAO dao = new BoardDAO();	

	// 총 페이지 번호?
	int cnt = dao.getTotalCount();
	out.println("TotalCnt : "+cnt);
	// 총 게시물은 몇건?
	int totalPage = (cnt%10==0)?(cnt/10):(cnt/10+1);
	out.println("totalPage : "+totalPage);
	// 시작 페이지번호
	startPage = pageNo-4;
	endPage = pageNo+5;
	if(startPage<=0){
		startPage = 1;	
		if(endPage <=totalPage-10){
			endPage = 10;
		}
	}
	else if(endPage > totalPage){
		endPage = totalPage;
	}
	boolean beforeFlag = false;
	boolean afterFlag = false;
	
	if(pageNo-5>=0) beforeFlag = true;
	if(endPage+5<=totalPage) afterFlag = true;
	out.println("startPage : "+startPage);
	out.println("endPage : "+endPage);
	
	ArrayList<BoardVO> list = dao.selectAll(startNo,endNo); 
	dao.close();

%>
<table>
	<tr>
		<th>게시물번호</th>
		<th>작성자</th>
		<th>제목</th>
		<th>작성일시</th>
		<th>조회수</th>
	</tr>
	<%
		for(BoardVO vo : list){
	%>
	<tr>
		<td><%=vo.getBno()%></td>
		<td><%=vo.getWriter() %></td>
		<td><a href="boardDetail.jsp?bno=<%=vo.getBno()%>"><%=vo.getTitle()%></a></td>
		<td><%=vo.getRegdate()%></td>
		<td><%=vo.getHits()%></td>
	</tr>
	<%
		}
	%>
	<tr>
		<td colspan="5">
		<%
			if(beforeFlag){
		%>
		<a href="boardList.jsp?page=<%=pageNo-5%>">
		<input type="button" value="[이전]" /></a>
		<%
			}
			for(int i=startPage;i<=endPage;i++){		
		%>
			<a href="boardList.jsp?page=<%=i%>">[<%=i %>]</a>
		<%
			}
			if(afterFlag){
		%>	
		<a href="boardList.jsp?page=<%=pageNo+5%>">
		<input type="button" value="[다음]" /></a>		
		<%
			}
		%>
		</td>
	</tr>
	<tr>
		<td colspan="5">
			<a href="writeForm.jsp"><img alt="글쓰기" src="../images/pencil.png"></a>
		</td>
	</tr>
</table>

</body>
</html>