package org.comstudy21.myweb.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController {
	static Map<String, String> items = new HashMap();
	//static �ʱ�ȭ
	static {
		//Ÿ��Ʋ�� Ű�� ���� url�� value�� ������..
		items.put("ȸ�����","member/list.do");
		items.put("�Խ���","bbs/list.do");
		items.put("shoppingmall","shop/list.do");
	}
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("homecontroller...");
		req.setAttribute("message", "hello, from homecontroller");
		req.setAttribute("items", items);
		return "/WEB-INF/views/home.jsp";
	}
}
