package org.comstudy21.myweb.bbs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;

public class BoardController implements MyController {

	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println(">>> BoardController ...");
		return "bbb/list";
	}

}
