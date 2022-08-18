package org.comstudy21.myweb.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.comstudy21.myweb.util.JdbcUtil;

public class SaramDAO {
	public static final String SELECT = "select * from saram";
	public static final String INSERT = "INSERT INTO SARAM(name, phone, email) values(?,?,?)"; 
	public static final String UPDATE = "Update saram set name=?, phone=?, email=?, where id=?";
	public static final String SELECT_ONE = "SELECT * from saram where id=?";
	public static final String SELECT_NAME2 = "SELECT * FROM saram where name like '%?%'";
	public static final String SELECT_NAME = "SELECT * FROM saram where name=?";
	public static final String DELETE = "DELETE from saram where id=?";
	
	private Connection conn = JdbcUtil.getConnection();
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private SaramDTO dto = new SaramDTO();
	
   public List<SaramDTO> selectAll() {
	   return null;
   }
   
   public SaramDTO selectOne(SaramDTO dto) {

	   return null;
   }
   
   public SaramDTO findByName(SaramDTO dto) {
      return null;
   }
   
   public void update(int id, String name, String phone, String email) {
	   String sql = this.UPDATE;
	   try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, phone);
		pstmt.setString(4, email);
		pstmt.executeUpdate();
		JdbcUtil.close(conn,pstmt,null);
	   } catch (SQLException e) {
		e.printStackTrace();
	   }
   }
   
   public void delete(String whatdelete) {
      try {
    	  Connection conn = JdbcUtil.getConnection();
    	  System.out.println("ddddddd : "+conn);
//    	  Connection conn = this.conn;
    	  String sql = this.DELETE;
    	  pstmt = conn.prepareStatement(sql);
    	  pstmt.setString(1, whatdelete);
//    	  pstmt.setInt(1, whatdelete);
    	  System.out.println("dddddddsq : "+pstmt.toString());
    	  
    	  int resul = pstmt.executeUpdate();
    	  if (resul>0) System.out.println("z: delete sentence is done");
    	  JdbcUtil.close(conn,pstmt,null);
      } catch (SQLException e) {
    	  System.out.println("z: error in 50 line");
      }
   }
   
   public void insert(String name, String phone, String email) {
      try {
    	  String sql = this.INSERT;
    	  pstmt = conn.prepareStatement(sql);
	      pstmt.setString(1, name); //몇번째 물음표에, 뭘 넣을건지
		  pstmt.setString(2, phone);
		  pstmt.setString(3, email);
    	  System.out.println("dddddddsq : "+pstmt.toString());
    	  
    	  int resul = pstmt.executeUpdate();
    	  if (resul>0) System.out.println("z: insert sentence is done");
    	  JdbcUtil.close(conn,pstmt,null);
      } catch (SQLException e) {
    	  System.out.println("z: error in 50 line");
      }
   }

}
