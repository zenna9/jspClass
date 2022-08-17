package org.comstudy21.myweb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements MyController {
	static Map<String, String> items = null;

	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		String ctxPath = req.getContextPath();
		if(items == null){
			items = new HashMap();
			items.put("ȸ�����", ctxPath + "/member/list.do");
			items.put("�Խ���", ctxPath + "/bbs/list.do");
			items.put("���θ�", ctxPath + "/shop/list.do");
		}
		
		//System.out.println(">>> HomeController ... ");
		
		req.setAttribute("message", "Hello World!");
		req.setAttribute("items", items);
		
		return "home";
	}

}
