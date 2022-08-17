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
	HandlerMapping handlerMapping = new HandlerMapping();
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PathVO pathVO = initPathAttr(req, resp);
		
		System.out.println(req.getMethod() + " >>> DispatcherServlet ...");
		System.out.println(pathVO.getDirName());
		
		System.out.println("dirName => " + pathVO.getDirName());
		ctrl = handlerMapping.getController(pathVO.getDirName());
		
		// home.jsp 페이지로 forward 시키기
		// 컨텍스트/home.do
		String viewName = "";
		if(ctrl != null) {
			viewName = ctrl.handleRequest(req, resp);
		}
		
		viewName = pathVO.getPrefix() + viewName + pathVO.getSuffix();
		System.out.println("viewName => " + viewName);
		RequestDispatcher dispatcher = req.getRequestDispatcher(viewName);
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
