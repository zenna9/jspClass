package org.comstudy21.myweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MyController {

	String handleRequest(HttpServletRequest req, HttpServletResponse resp);

}