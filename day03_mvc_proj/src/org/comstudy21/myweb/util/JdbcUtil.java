package org.comstudy21.myweb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	/////참고용 백업파일
	public static Connection getConnection() {
		String url="jdbc:h2:tcp://localhost/~/test"; //공백 없도록 주의
		String user="sa";
		String password ="12345";
		Connection conn=null;
//		-------드라이버커넥션--------
		try {
			Class.forName("org.h2.Driver");
			//드라이버를 찾음과 동시에 객체화해주는 구문
			//복사한 경로를 붙여줬지만 확장자는 빼줌
//			System.out.println("드라이버 검색 성공");
			
			//DB검색시 .... DriverManager를 사용해 커넥션을 가져오고
			// 메서드들을 이용해 추가 sql을 이용하게 됨
			conn = DriverManager.getConnection(url, user, password);
//			System.out.println("conn : "+conn);
		} catch (ClassNotFoundException e) {
			System.out.println("driver search failed.....>>");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("z: connection failed with 28 lines");
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(Connection conn) { // conn을 끊어주는 구문
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void close(ResultSet conn) { // conn을 끊어주는 구문
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void close(Statement conn) { // conn을 끊어주는 구문
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		close(conn);
		close(stmt);
		close(rs);
		
	}
}
