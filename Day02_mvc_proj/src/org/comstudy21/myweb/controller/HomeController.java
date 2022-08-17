package org.comstudy21.myweb.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController {
	static Map<String, String> items = null;
	static public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("homecontroller...");
		
		//����ο��� �����̸� ��ø�Ǵ°� �ذ��ϱ�����
		String ctxPath = req.getContextPath();
      if(items == null){
          items = new HashMap();
          items.put("ȸ�����", ctxPath + "/member/list.do");
          items.put("�Խ���", ctxPath + "/bbs/list.do");
          items.put("���θ�", ctxPath + "/shop/list.do");
       }

		req.setAttribute("message", "hello, from homecontroller");
		req.setAttribute("items", items);
		return "/WEB-INF/views/home.jsp";
	}
}
