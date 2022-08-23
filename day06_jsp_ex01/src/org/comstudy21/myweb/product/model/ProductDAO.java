package org.comstudy21.myweb.product.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myweb.DAO;
import org.comstudy21.myweb.dbcp.JdbcUtil;
import org.h2.util.JdbcUtils;


interface sqlInterface extends DAO {
   String SELECT_ALL = "select * from product order by rno desc";
   String SELECT_ONE = "select * from product where rno=?";
   String INSERT = "insert into product(rno, rtitle, rprice) values (nextval('seq_product'),?,?);";
   String UPDATE = "update product set rtitle=?, rprice=? where rno=?";
   String DELETE = "delete from product where rno=?";
}
public class ProductDAO implements sqlInterface {
	private ResultSet rs = null;
	private PreparedStatement stmt = null;
	private Connection conn = null;
	
	
	
	
   public static String mkSelectOneSql(String table, String field) {
      return String.format("SELECT * FROM %s WHERE %s=?", table, field);
   }

   @Override
   public List<Object> selectAll() {
	   List<Object> list = new ArrayList();
	   conn = JdbcUtil.getConnection();
	   try {
		stmt = conn.prepareStatement(SELECT_ALL);
		rs = stmt.executeQuery();
		while(rs.next()) {
			int rno = rs.getInt(1);
			String rtitle = rs.getString(2);
			int rprice = rs.getInt(3);
			list.add(new ProductDTO(rno, rtitle, rprice));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		JdbcUtil.close(conn, stmt, rs);
	}
      return null;
   }

   @Override
   public Object selectOne() {
      
      return null;
   }

   @Override
   public int insert(Object obj) {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public int update(Object obj) {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public int delete(Object obj) {
      // TODO Auto-generated method stub
      return 0;
   }
   
   public static void main(String[] args) {
      String sql = mkSelectOneSql("product", "rno");
      System.out.println(sql);
   }
   
}