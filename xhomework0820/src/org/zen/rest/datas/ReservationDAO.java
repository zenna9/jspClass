package org.zen.rest.datas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReservationDAO {
	private Connection conn = JdbcUtil.getConnection();
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private PeopleDTO pedto = new PeopleDTO();
	private ProductDTO prdto = new ProductDTO();
	
	public String reservationList() {
		String ret = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select name from people , product where people.rno =product.rno and product.rno =1008");
			ret = rs.toString();
		} catch (SQLException e) {
			System.out.println("z: problem with reservationDAO.reservationList");
			e.printStackTrace();
		}
		return ret;
	}
}
