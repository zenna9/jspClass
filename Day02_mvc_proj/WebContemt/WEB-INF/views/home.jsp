<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
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
<% Map items = (Map)request.getAttribute("items");
	Set keys = items.keySet();
	Iterator iterator = keys.iterator();
	//이제 이터레이터를 반복할 수 있음
	while(iterator.hasNext()){
		String key = (String)iterator.next();
%>
<li><a href="<%=items.get(key)%>"><%=key %></li>
<!-- 
	<li><a href="member/list.do">회원목록ss(member/list.do)</a></li>
	<li><a href="bbs/list.do">게시판ss(bbs/list.do)</a></li>
	<li><a href="shop/list.do">쇼핑몰ss(shop/list.do)</a></li>
 -->
<%} %>	
<a href="member/list.ldd">dfdfdf</a><br>
	<a href="/Day02_mvc_proj/">index.html로 돌아가기</a>
</ul>
</body>
</html>