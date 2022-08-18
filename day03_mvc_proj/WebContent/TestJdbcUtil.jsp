<%@page import="org.comstudy21.myweb.model.SaramDTO"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
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
		Connection conn = JdbcUtil.getConnection();
		//saram���̺��� ������ �о����
		Statement stmt = conn.createStatement();// Ŀ�ؼ��� �̿��� ������
		ResultSet rs = stmt.executeQuery("select * from saram"); 
		//^ stmt�� �̿��� sql���� �����
		//������� resultSet�� ����Ǿ� ��
		//���� �����Ͱ� ���°� �ƴ϶� �����͸� ���� �� �ִ� Ŀ���� ���� ��
		//Ŀ���� �ݺ��ؼ� ������ ���� while
		while(rs.next()){ //next�� ���ڵ� ��row�� �о����, 
			//null�̸� false�� �Ǹ� �� ������
			int id = rs.getInt(1); //�÷� ������� 1�� ���൵ �ǰ�, �̸� "id"�� �ᵵ��
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String email = rs.getString("email");
			SaramDTO dto = new SaramDTO(id, name, phone, email);
			
			out.println(dto+"<br>"); //���⼱ sysout�� �ȵǰ�, ȭ�鿡 out �ؾ���
			
			//ó���� �������� ������ ���������
		}
		JdbcUtil.close(conn, stmt, rs); //�����Ȱ��� �������� ���ָ� ��
		
		//�ԷµǴ°� �׽�Ʈ start
		
	%>
	
</body>
</html>