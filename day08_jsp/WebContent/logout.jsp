<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그아웃 페이지</h1>
<%
session.invalidate();
application.removeAttribute("appId");
application.removeAttribute("appName");

response.sendRedirect("home.jsp");
%>
</body>
</html>