<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome! Please log-in</h1><hr/>
<div style="margin:30vh 30wh">
	<lable name="id">로그인</lable>
	<input name="id" type="text" value="KIM"/>
	<lable name="password">비밀번호</lable>
	<input name="password" type="password" value="kim"/>
	<br/>
	<br/>
	<input type="submit" value="제출하기"/>
	<button onclick="location.href='/hr/join'">회원가입하기</button>
</div>
</body>
</html>