<%@page import="org.comstudy21.myweb.util.JdbcUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="org.comstudy21.myweb.model.SaramDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- ==  return Nothing!!!!! == -->
	<%
	// --------selectAll
	SaramDAO dao = new SaramDAO();
	ResultSet rs = dao.selectAll();
	while (rs.next()) {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		out.println(id+" : "+name+"<br>");
	} // selectAll에서 연결을 꺼버리면 안됨
	
	%>
</body>
</html>