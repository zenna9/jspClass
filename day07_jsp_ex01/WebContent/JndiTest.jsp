<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% 
	Context initContext = new InitialContext();
	Context envContext  = (Context)initContext.lookup("java:/comp/env");
	DataSource ds = (DataSource)envContext.lookup("jdbc/h2DB");
	Connection conn = ds.getConnection();
	
	out.println(conn);
	conn.close();
	//etc.
	%>
</body>
</html>