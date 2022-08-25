<%@page import="myshop.ProductDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>장바구니 목록</h1>
<c:forEach var="car" items="${cartList}">
<p><c:out value="${car} }"></c:out>
	<button onclick="location.href='cart_process.jsp?cmd=remove&pno=${car.pno}'">제거</button>
	결제 금액 : <strong class="mini-sum">${car.price*car.ea}</strong>
</p>
</c:forEach>
<hr/>
<h1 class="final-sum">결제 총액 : 0원</h1>
</body>
<script>
	let finalsum = 0;
	let sumlist = document.querySelectorAll(".mini-sum");
	for(let i of sumlist){
		finalsum += (i.innerHTML)*1;
	}
	let hsum = finalsum.toLocaleString();
	document.querySelector(".final-sum").innerHTML="결제 총액 : "+hsum+"원";
	
	</script>
</html>