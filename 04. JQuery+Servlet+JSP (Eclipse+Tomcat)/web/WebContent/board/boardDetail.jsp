<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../se2/js/HuskyEZCreator.js" cahrset="utf-8"></script>
<style type="text/css">
table, th,td{
	border: 1px solid black;
	border-collapse: collapse;
}
table{
	width: 1000px;
	margin: 0 auto;
	text-align: center;
}
img{
	width: 50px;
	height: 50px;
}
tr{
	height: 50px;
}
th{
	background: #eeeeee;
}
#col1{
	width: 25%;
}
#col2{
	width: 25%;
}
#col3{
	width: 25%;
}
#col4{
	width: 25%;
}
cation{
	font-weight: bold;
	font-size: 30px;
}
</style>
</head>
<body>
<%
	String n = request.getParameter("bno");
	if(n==null || n.equals("")){
		response.sendRedirect("boardList.jsp");
	}else{		
		int bno = Integer.parseInt(n);
		System.out.println(bno);
		BoardDAO dao = new BoardDAO();
		dao.raiseHits(bno);
		BoardVO vo = dao.selectOne(bno);
		dao.close();
	
%>
   <table>
   <caption>상세보기</caption>
      <tr>
         <th id="col1">작성일시</th>
         <td id="col2"><%=vo.getRegdate() %></td>
         <th id="col3">조회수</th>
         <td id="col4"><%=vo.getHits() %></td>
      </tr>
      <tr>
         <th>작성자</th>
         <td colspan = "3"><%=vo.getWriter() %></td>
         
      </tr>
      <tr>
         <th>제목</th>
         <td colspan = "3"><%=vo.getTitle() %></td>
      </tr>
      <tr>
         <th>내용</th>
         <td colspan = "3"><textarea name="ir1" id="ir1" cols="100" rows="20"><%=vo.getContents() %></textarea></td>
         
      </tr>
      <tr>
         <td colspan = "4">
         <a href="modifyForm.jsp?bno=<%=vo.getBno()%>"><img src="../images/update.png" alt="수정" /></a>
         <a href="deleteOk.jsp?bno=<%=vo.getBno()%>"><img src="../images/delete.png" alt="삭제" /></a>
         <a href="boardList.jsp"><img src="../images/docu.png" alt="목록" /></a>
         
         </td>
      </tr>
   </table>
   <%
	}
   %>
   	<script type="text/javascript">
var oEditors = [];

// 추가 글꼴 목록
//var aAdditionalFontSet = [["MS UI Gothic", "MS UI Gothic"], ["Comic Sans MS", "Comic Sans MS"],["TEST","TEST"]];

nhn.husky.EZCreator.createInIFrame({
	oAppRef: oEditors,
	elPlaceHolder: "ir1",
	sSkinURI: "../se2/SmartEditor2Skin.html",	
	htParams : {
		bUseToolbar : true,				// 툴바 사용 여부 (true:사용/ false:사용하지 않음)
		bUseVerticalResizer : true,		// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
		bUseModeChanger : true,			// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
		//aAdditionalFontList : aAdditionalFontSet,		// 추가 글꼴 목록
		fOnBeforeUnload : function(){
			//alert("완료!");
		}
	}, //boolean
	fOnAppLoad : function(){
		//예제 코드
		//oEditors.getById["ir1"].exec("PASTE_HTML", ["로딩이 완료된 후에 본문에 삽입되는 text입니다."]);
	},
	fCreator: "createSEditor2"
});

function pasteHTML() {
	var sHTML = "<span style='color:#FF0000;'>이미지도 같은 방식으로 삽입합니다.<\/span>";
	oEditors.getById["ir1"].exec("PASTE_HTML", [sHTML]);
}

function showHTML() {
	var sHTML = oEditors.getById["ir1"].getIR();
	alert(sHTML);
}
	
function submitContents(elClickedObj) {
	oEditors.getById["ir1"].exec("UPDATE_CONTENTS_FIELD", []);	// 에디터의 내용이 textarea에 적용됩니다.
	
	// 에디터의 내용에 대한 값 검증은 이곳에서 document.getElementById("ir1").value를 이용해서 처리하면 됩니다.
	
	try {
		elClickedObj.form.submit();
	} catch(e) {}
}

function setDefaultFont() {
	var sDefaultFont = '궁서';
	var nFontSize = 24;
	oEditors.getById["ir1"].setDefaultFont(sDefaultFont, nFontSize);
}
</script>
</body>
</html>