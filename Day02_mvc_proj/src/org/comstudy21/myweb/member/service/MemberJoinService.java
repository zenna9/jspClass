package org.comstudy21.myweb.member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.member.MemberDTO;
import static org.comstudy21.myweb.controller.MyController.memberDAO;

public class MemberJoinService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		if("POST".equals(req.getMethod())) {
			// ������ �����ϰ� ���ΰ�ħ
			String name = req.getParameter("name");
			String phone = req.getParameter("phone");
			MemberDTO dto = new MemberDTO(0, name, phone);
			memberDAO.insert(dto);
			return "redirect:list.do";
		} else {
			return "member/join";
		}
	}
}
