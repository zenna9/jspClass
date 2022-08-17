package org.comstudy21.myweb.shop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;

public class ShopController implements MyController {

	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println(">>> ShopController ...");
		return "shop/list";
	}

}
