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
	<%
	SaramDAO dao = new SaramDAO();
	//keonhee 추가
	dao.update(2, "deonhee", "010-01", "kk@na.xo")	;
	
	//saram 테이블에서 name이 test인 행 삭제

	String whatdelete = "Test";
	dao.delete(whatdelete);
	
	dao.insert("CHAE-LIN", "82-01", "leena@c.c");
	
	
	response.sendRedirect("TestJdbcUtil.jsp");
	
	
	%>
</body>
</html>