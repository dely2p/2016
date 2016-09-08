<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<script type="text/javascript" src="./nse_files/js/HuskyEZCreator.js" charset="utf-8"></script>
	
</head>
<body>
<form action="add.do" method=post>
	<table>	
		<tr>
			<th>번호</th>
			<td><input type="text" name="no" id="" /></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input type="text" name="writer" id="" /></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="title" id="" /></td>
		</tr>
		<tr>
			<th>내용</th>
			<td>
				<textarea rows="10" cols="100"></textarea>			
				<script type="text/javascript">
					var oEditors = [];
					<nhn class="husky EZCreator createIn"></nhn>IFrame({
					oAppRef: oEditors,
					elPlaceHolder: "ir1",
					sSkinURI: "../nse_files/SmartEditor2Skin.html",
					fCreator: "createSEditor2"
					});
					function submitContents(elClickedObj) {
					oEditors.getById["ir1"].exec("UPDATE_CONTENTS_FIELD", []);	// 에디터의 내용이 textarea에 적용됩니다. 
					// 에디터의 내용에 대한 값 검증은 이곳에서 document.getElementById("ir1").value를 이용해서 처리하면 됩니다.
					
					try {
					elClickedObj.form.submit();
					} catch(e) {}
					}
				</script>
			</td>
		</tr>

		<tr>
			<th>조회수</th>
			<td><input type="text" name="hits" id="" /></td>
		</tr>
		<tr>
			<th>날짜</th>
			<td><input type="text" name="wdate" id="" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="입력" onclick="submitContents(this)"></td>
			<td><input type="button" value="되돌아가기"></td>
		</tr>
	</table>
	</form>	
</body>
</html>