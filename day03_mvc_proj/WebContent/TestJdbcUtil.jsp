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
		//saram테이블의 내용을 읽어오기
		Statement stmt = conn.createStatement();// 커넥션을 이용해 가져옴
		ResultSet rs = stmt.executeQuery("select * from saram"); 
		//^ stmt를 이용해 sql문을 사용함
		//결과값은 resultSet에 저장되어 옴
		//실제 데이터가 오는게 아니라 데이터를 읽을 수 있는 커서가 오는 것
		//커서를 반복해서 돌리기 위한 while
		while(rs.next()){ //next는 레코드 한row를 읽어오고, 
			//null이면 false가 되며 더 안읽음
			int id = rs.getInt(1); //컬럼 순서대로 1을 해줘도 되고, 이름 "id"를 써도됨
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String email = rs.getString("email");
			SaramDTO dto = new SaramDTO(id, name, phone, email);
			
			out.println(dto+"<br>"); //여기선 sysout이 안되고, 화면에 out 해야함
			
			//처리가 끝났으면 연결을 끊어줘야함
		}
		JdbcUtil.close(conn, stmt, rs); //생성된것의 역순으로 꺼주면 됨
		
		//입력되는것 테스트 start
		
	%>
	
</body>
</html>