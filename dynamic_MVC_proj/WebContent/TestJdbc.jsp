<%@page import="org.comstudy21.myweb.dbcp.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>TestJdbc</title>
</head>
<body>
	<%
		Connection conn = JdbcUtil.getConnection();
	out.println(conn);
	%>
</body>
</html>