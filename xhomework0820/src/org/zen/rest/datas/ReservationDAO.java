package org.zen.rest.datas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ReservationDAO {
	private Connection conn = JdbcUtil.getConnection();
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private PeopleDTO pedto = new PeopleDTO();
	private ProductDTO prdto = new ProductDTO();
	
	public List<Object> reservationList() throws SQLException {
		List<Object> ret = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select name from people, product where people.rno =product.rno and product.rno =1008");
			while(rs.next()){

			}
		} catch (SQLException e) {
			System.out.println("z: problem with reservationDAO.reservationList");
			e.printStackTrace();
		}finally{
			conn.close();
		}
		return ret;
	}
}
