<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1 style="background-color:blue"> 채은쓰 JSP 페이지 </h1>
<hr/>
<p>message income : <strong>${message}</strong></p>
</hr>
<p> where you can go : <strong>${items.get("회원목록")}</strong></p>
<ul>

<% Map items = (Map)request.getAttribute("items"); %>
	<li><a href="member/list.do">회원목록(member/list.do)</a></li>
	<li><a href="bbs/list.do">게시판(bbs/list.do)</a></li>
	<li><a href="shop/list.do">쇼핑몰(shop/list.do)</a></li>
	
	<a href="/Day02_mvc_proj/">index.html로 돌아가기</a>
</ul>
</body>
</html>