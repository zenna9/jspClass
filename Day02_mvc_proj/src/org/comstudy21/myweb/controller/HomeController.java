package org.comstudy21.myweb.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController {
	static Map<String, String> items = null;
	static public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("homecontroller...");
		
		//상대경로에서 폴더이름 중첩되는것 해결하기위해
		String ctxPath = req.getContextPath();
      if(items == null){
          items = new HashMap();
          items.put("회원목록", ctxPath + "/member/list.do");
          items.put("게시판", ctxPath + "/bbs/list.do");
          items.put("쇼핑몰", ctxPath + "/shop/list.do");
       }

		req.setAttribute("message", "hello, from homecontroller");
		req.setAttribute("items", items);
		return "/WEB-INF/views/home.jsp";
	}
}
