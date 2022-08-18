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
	//데이터가 테이블에 입력되도록 하는 구문...
	String name="Test";
	String phone="010-0000-0004";
	String email = "cheiieiei@naver.com";
	
	Connection conn=JdbcUtil.getConnection();
	
	String sql = "insert into saram(name, phone, email) values (?, ?, ?)" ;
	//새로운 값이 들어갈 부분은 ?로 함
	//preparedstatement는 statement를 상속받은 관계, 
	PreparedStatement pstmt = conn.prepareStatement(sql);//변수가 많으면 사용하기 복잡한 문제를 포맷 형태를 사용해 해결해줌
	//변수를 대입할예정
	pstmt.setString(1, name); //몇번째 물음표에, 뭘 넣을건지
	pstmt.setString(2, phone);
	pstmt.setString(3, email);

	//pstmt 실행
	int cnt_result = pstmt.executeUpdate() ;//리턴값은 처리 개수가 int로 나옴
	if(cnt_result>0){
		System.out.println("입력성공 : "+cnt_result);
	}else {
		System.out.println("z: insert failed");
	}
	JdbcUtil.close(conn, pstmt,null); //연것들을 닫아줌
	response.sendRedirect("TestJdbcUtil.jsp");
	
	%>
</body>
</html>