package org.comstudy21.myweb.util;

public class JdbcUtil {
	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
			//����̹��� ã���� ���ÿ� ��üȭ���ִ� ����
			//������ ��θ� �ٿ������� Ȯ���ڴ� ����
			System.out.println("����̹� �˻� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("driver search failed.....>>");
			e.printStackTrace();
		}
	}
}
