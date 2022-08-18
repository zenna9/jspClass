package org.comstudy21.myweb.util;

public class JdbcUtil {
	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
			//드라이버를 찾음과 동시에 객체화해주는 구문
			//복사한 경로를 붙여줬지만 확장자는 빼줌
			System.out.println("드라이버 검색 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("driver search failed.....>>");
			e.printStackTrace();
		}
	}
}
