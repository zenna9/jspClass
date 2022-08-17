package org.comstudy21.myweb.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;
import org.comstudy21.myweb.controller.PathVO;
import org.comstudy21.myweb.member.service.MemberJoinService;
import org.comstudy21.myweb.member.service.MemberListService;

public class MemberController implements MyController {
	

	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		//System.out.println("---- MemberController ----");
		
		String fileName = (String)req.getAttribute("fileName");
		//System.out.println("fileName => " + fileName);
		String viewName = "member/list";
		if("/list".equals(fileName)) {
			viewName = new MemberListService().service(req, resp);
		} else if("/join".equals(fileName)) {
			viewName = new MemberJoinService().service(req, resp);
		}
		
		return viewName;
	}

}
