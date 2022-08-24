<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="myshop.ProductDTO"%>
<%@page import="myshop.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//Control for cartlist
if(session.getAttribute("cartList") == null) {
   session.setAttribute("cartList", new ArrayList<ProductDTO>());
}
List<ProductDTO> cartList = (List<ProductDTO>)session.getAttribute("cartList");
int pno = Integer.parseInt(request.getParameter("pno"));
switch(request.getParameter("cmd")){
	case "add":
		int ea = Integer.parseInt (request.getParameter("ea") );
		//만약 같은 pno가 있으면 수량만 변경하도록 설정

		ProductDAO dao = new ProductDAO();
		ProductDTO product = dao.selectOne(new ProductDTO(pno,"","",0,0));
		product.setEa(ea);
		// session's cartList
		cartList.add(product);
	
		response.sendRedirect("cart_list.jsp");
		break;
	case "remove":
		cartList.remove(new ProductDTO(pno));
		response.sendRedirect("cart_list.jsp");
		break;
}
%>