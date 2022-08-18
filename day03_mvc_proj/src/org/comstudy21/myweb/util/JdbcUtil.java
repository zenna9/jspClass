package org.comstudy21.myweb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	/////����� �������
	public static Connection getConnection() {
		String url="jdbc:h2:tcp://localhost/~/test"; //���� ������ ����
		String user="sa";
		String password ="12345";
		Connection conn=null;
//		-------����̹�Ŀ�ؼ�--------
		try {
			Class.forName("org.h2.Driver");
			//����̹��� ã���� ���ÿ� ��üȭ���ִ� ����
			//������ ��θ� �ٿ������� Ȯ���ڴ� ����
//			System.out.println("����̹� �˻� ����");
			
			//DB�˻��� .... DriverManager�� ����� Ŀ�ؼ��� ��������
			// �޼������ �̿��� �߰� sql�� �̿��ϰ� ��
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
	public static void close(Connection conn) { // conn�� �����ִ� ����
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void close(ResultSet conn) { // conn�� �����ִ� ����
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void close(Statement conn) { // conn�� �����ִ� ����
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
