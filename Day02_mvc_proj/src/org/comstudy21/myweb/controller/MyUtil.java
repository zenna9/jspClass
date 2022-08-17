package org.comstudy21.myweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyUtil {
	public static PathVO initPathAttr(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		String reqUri = req.getRequestURI();
		String ctxPath = req.getContextPath();
		int beginIndex = ctxPath.length();
		int endIndex = reqUri.lastIndexOf(".");
		String path = reqUri.substring(beginIndex, endIndex);
		
		//System.out.println("ctxPath = " + ctxPath);
		//System.out.println("path = " + path);
		req.setAttribute("path", path);
		String prefix = "/WEB-INF/views/";
		String suffix = ".jsp";
		req.setAttribute("suffix", prefix);
		req.setAttribute("prefix", suffix);
		
		// ���ϸ��� Ȯ���� �տ� �ִ�.
		// ���ϸ��� ������ /���� .�տ� ����
		beginIndex = reqUri.lastIndexOf("/");
		endIndex = reqUri.lastIndexOf(".");
		String fileName = reqUri.substring(beginIndex, endIndex);
		String dirName = path.substring(0, path.lastIndexOf(fileName));
		
		//System.out.println("fileName = " + fileName);
		//System.out.println("dirName = " + dirName);
		req.setAttribute("dirName", dirName);
		req.setAttribute("fileName", fileName);
		
		PathVO pathVO = new PathVO(path, fileName, dirName, suffix, prefix);
		req.setAttribute("pathVO", pathVO);
		
		return pathVO;
	}
}
