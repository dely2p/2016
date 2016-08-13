<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("img[src='../images/save.jpg']").on("click",function(){
			console.log("저장이미지 누름");
				
			$("form").submit(); 
		
		});
	});

</script>
<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
table {
	width: 1000px;
	margin: 0 auto;
	text-align: center;
}
img {
	width: 50px;
	height: 50px;
}
tr {
	height: 50px;
}
th {
	background: #eeeeee;
}
#col1,#col2,#col3,#col4 {
	width: 25%;
}
img {
	cursor: pointer;
}
cation {
	font-weight: bold;
	font-size: 30px;
}
</style>
</head>
<body>
	<%
		String n = request.getParameter("bno");
		//	if(n==null || n.equals("")){
		//		response.sendRedirect("boardList.jsp");
		//	}else{
		int bno = Integer.parseInt(n);
		System.out.println(bno);
		BoardDAO dao = new BoardDAO();
		BoardVO vo = dao.selectOne(bno);
	%>
	<form action="modifyOk.jsp">
	<table>
		<caption>상세보기</caption>
		<tr>
			<th id="col1">작성일시</th>
			<td id="col2"><%=vo.getRegdate()%><input type="hidden" name="bno" value="<%=vo.getBno() %>"/></td>			
			<th id="col3">조회수</th>
			<td id="col4"><%=vo.getHits()%></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td colspan="3"><input type="text" name="writer"
				value="<%=vo.getWriter()%>" /></td>

		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3"><input type="text" name="title"
				value="<%=vo.getTitle()%>" /></td>
		</tr>
		<tr>
			<th>내용</th>
			<td colspan="3"><textarea name="contents" id="" cols="100" rows="20"><%=vo.getContents()%></textarea></td>

		</tr>
		<tr>
			<td colspan="4">
				<a><img src="../images/save.jpg" alt="수정완료" /></a>		
				<a href="boardList.jsp"><img src="../images/docu.png" alt="목록" /></a>
			</td>
		</tr>
	</table>
	</form>

</body>
</html>