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

<h1 style="background-color:blue"> ä���� JSP ������ </h1>
<hr/>
<p>message income : <strong>${message}</strong></p>
</hr>
<p> where you can go : <strong>${items.get("ȸ�����")}</strong></p>
<ul>

<% Map items = (Map)request.getAttribute("items"); %>
	<li><a href="member/list.do">ȸ�����(member/list.do)</a></li>
	<li><a href="bbs/list.do">�Խ���(bbs/list.do)</a></li>
	<li><a href="shop/list.do">���θ�(shop/list.do)</a></li>
	
	<a href="/Day02_mvc_proj/">index.html�� ���ư���</a>
</ul>
</body>
</html>