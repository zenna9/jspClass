<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.comstudy21.myweb.util.JdbcUtil"%>
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
	//�����Ͱ� ���̺� �Էµǵ��� �ϴ� ����...
	String name="Test";
	String phone="010-0000-0004";
	String email = "cheiieiei@naver.com";
	
	Connection conn=JdbcUtil.getConnection();
	
	String sql = "insert into saram(name, phone, email) values (?, ?, ?)" ;
	//���ο� ���� �� �κ��� ?�� ��
	//preparedstatement�� statement�� ��ӹ��� ����, 
	PreparedStatement pstmt = conn.prepareStatement(sql);//������ ������ ����ϱ� ������ ������ ���� ���¸� ����� �ذ�����
	//������ �����ҿ���
	pstmt.setString(1, name); //���° ����ǥ��, �� ��������
	pstmt.setString(2, phone);
	pstmt.setString(3, email);

	//pstmt ����
	int cnt_result = pstmt.executeUpdate() ;//���ϰ��� ó�� ������ int�� ����
	if(cnt_result>0){
		System.out.println("�Է¼��� : "+cnt_result);
	}else {
		System.out.println("z: insert failed");
	}
	JdbcUtil.close(conn, pstmt,null); //���͵��� �ݾ���
	response.sendRedirect("TestJdbcUtil.jsp");
	
	%>
</body>
</html>