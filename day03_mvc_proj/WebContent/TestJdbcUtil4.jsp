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
	//keonhee �߰�
	dao.update(7, "Keonhee", "010-01", "kk@na.xo")	;
	
	
	//saram ���̺��� name�� test�� �� ����

	String whatdelete = "Test";
	dao.delete(whatdelete);
	response.sendRedirect("TestJdbcUtil.jsp");
	%>
</body>
</html>