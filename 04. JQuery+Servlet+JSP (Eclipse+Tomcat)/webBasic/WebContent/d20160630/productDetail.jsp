<%@page import="dao.ProductDAO"%>
<%@page import="vo.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	img {
		padding: 10px;
		float: left;
	}
	table {
		padding: 10px;
		
	}

	.dc {
		text-decoration: line-through;
		color: red;
	}
	#desc {
		width: 900px;
		margin: auto;
		padding-top: 50px;
	}
	#pro {
		width: 900px;
		margin: auto;
		border: 1px solid hotpink;
	}
	#pro:after{display: block; clear: both; content: "";}
</style>
</head>
<body>
<%
	String n = request.getParameter("pno");
	int pno = Integer.parseInt(n);
	ProductDAO dao = new ProductDAO();
	ProductVO vo = dao.selectOne(pno);
%>
<div id="pro">
	<img alt="<%=vo.getPname()%>" src=<%=vo.getImgfile()%>>

	<table>
		<tr>
			<td>상품명</td>
			<td><%=vo.getPname()%></td>
		</tr>
		<tr>
			<td>가격</td>
			<td class="dc"><%=vo.getPrice()%></td>
		</tr>
		<tr>
			<td>할인가격</td>
			<td><%=vo.getPrice()*0.9%></td>
		</tr>
		<tr>
			<td>적립금</td>
			<td><%=vo.getPrice()*0.01%></td>
		</tr>
		<tr>
			<td>수량</td>
			<td><%=vo.getQuantity()%></td>
		</tr>
		<tr>
			<td><a><input type="button" value="BUY NOW"/></a></td>
			<td><a><input type="button" value="SHOP CART"/></a></td>
			<td><a><input type="button" value="WISH LIST"/></a></td>
		</tr>
	</table>
</div>
<div id="desc">
	<tr>
		<td><%=vo.getPdesc()%></td>
	</tr>
</div>
</body>
</html>