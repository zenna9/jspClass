package org.comstudy21.myweb.dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.tools.Server;

public class JdbcUtil {
//================h2���� ���ο� ���� �ڵ� ����===========================
	private static Server server = null;
	static {
		try {
			if (server == null) {
				// start the TCP Server
				server = Server.createTcpServer(null).start();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//================================================================		
	public static Connection getConnection() {
		String url = " jdbc:h2:tcp://localhost/~/test".trim();
		String user = "sa";
		String password = "12345";
		Connection conn = null;
		// ����̹�
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���� ����!");
			e.printStackTrace();
		}
		return conn;
	}
	public static Connection getConnection(String url, String user, String password) {
		Connection conn = null;
		// ����̹�
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���� ����!");
			e.printStackTrace();
		}
		return conn;
	}

	public static int close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
				return 1;
			} catch (SQLException e) {
				e.printStackTrace();
				return -1;
			}
		}
		return 0;
	}

	public static void close(Statement conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// ������ ���� close �ѹ��� �ݾ��ִ� �Լ�
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		close(conn);
		close(stmt);
		close(rs);
	}
}