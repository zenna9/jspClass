package org.comstudy21.myweb.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController {
	static Map<String, String> items = new HashMap();
	//static 초기화
	static {
		//타이틀을 키로 쓰고 url을 value로 쓰려구..
		items.put("회원목록","member/list.do");
		items.put("게시판","bbs/list.do");
		items.put("shoppingmall","shop/list.do");
	}
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("homecontroller...");
		req.setAttribute("message", "hello, from homecontroller");
		req.setAttribute("items", items);
		return "/WEB-INF/views/home.jsp";
	}
}
