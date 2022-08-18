<%@page import="org.comstudy21.myweb.model.SaramDTO"%>
<%@page import="org.comstudy21.myweb.model.SaramDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="org.comstudy21.myweb.util.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
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
	//saram 테이블에서 name이 test인 행 삭제

	Connection conn = JdbcUtil.getConnection();
	String whatdelete = "Test";
	String sql ="Delete from saram where name=?";
	
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1,whatdelete);
	
	pstmt.executeUpdate();
	JdbcUtil.close(conn,pstmt, null);
	response.sendRedirect("TestJdbcUtil.jsp");
	%>
</body>
</html>