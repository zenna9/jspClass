package org.comstudy21.myweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyUtil {
	public static PathVO initPathAttr(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>dispatcherServlet");
		String ctxPath = req.getContextPath();
		//URI를 reqUri에 넣음
		String reqUri=req.getRequestURI();
		int beginIndex = ctxPath.length(); // ctxPath를 제외하기위한 인덱스
		int endIndex = reqUri.lastIndexOf("."); //우리는 디스패쳐 서블릿이 .do로 끝나게 해뒀으니까.. 
		String path = reqUri.substring(beginIndex, endIndex);

		req.setAttribute("path", path);
		String prefix = "/WEB-INF/views/";
		String suffix = ".jsp";
		
		req.setAttribute("suffix", prefix);
		req.setAttribute("prefix", suffix);
		
		beginIndex = reqUri.lastIndexOf("/");
		endIndex = reqUri.lastIndexOf(".");
		String fileName = reqUri.substring(beginIndex, endIndex);
		String dirName = path.substring(0, path.lastIndexOf(fileName));
		
		req.setAttribute("dirName", dirName);
		req.setAttribute("fileName", fileName);
		
		PathVO pathVO = new PathVO(path, fileName, dirName, suffix, prefix);
		req.setAttribute("pathVO", pathVO);
		System.out.println("reqUri : "+reqUri);
		
		//앞부분은 ctxPath(프로젝트이름인부분..)
//		System.out.println("ctxpath : "+ctxPath);
//		System.out.println("path : "+path);
//		System.out.println("filename"+fileName);
//		System.out.println("dirName : "+dirName);
	    return pathVO;
	}
}
