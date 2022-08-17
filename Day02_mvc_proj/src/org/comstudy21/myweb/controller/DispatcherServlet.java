package org.comstudy21.myweb.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.comstudy21.myweb.controller.MyUtil.initPathAttr;

public class DispatcherServlet extends HttpServlet {
	MyController ctrl = new HomeController();
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println(">>디스패쳐서블릿...");
	
	PathVO pathVO = initPathAttr(req,resp);
	
//	System.out.println(req.getMethod()+" 방식으로 들어옴");
	
	String reqUri = req.getRequestURI();
	
	String path = reqUri.substring(req.getContextPath().length());
//	System.out.println("path : "+path);
	
	//home.jsp 페이지로 forward시키려함
//    RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/home.jsp");
    String viewname = ctrl.handleRequest(req,resp);
	RequestDispatcher dispatcher = req.getRequestDispatcher(viewname);
    //이제 포워드
    dispatcher.forward(req, resp);
	
	}
	
	   @Override
	   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      doProcess(req, resp);
	   }
	   
	   @Override
	   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      doProcess(req, resp);
	   }
}
