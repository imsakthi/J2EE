package com;

import java.sql.*;
import java.util.*;

public class DBmethod {
	static String driver="com.mysql.cj.jdbc.Driver";
	static String dburl="jdbc:mysql://localhost:3306/user_db";
	static String user="root";
	static String password="root";
	
	public void save(User u)throws Exception{
		Class.forName(driver);
		Connection c=DriverManager.getConnection(dburl,user,password);
		PreparedStatement ps=c.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
		ps.setInt(1,u.getId());
		ps.setString(2, u.getFname());
		ps.setString(3, u.getLname());
		ps.setString(4,u.getEmail());
		ps.setString(5, u.getPassword());
		ps.setString(6, u.getDob());
		ps.setLong(7, u.getPhone());
		ps.executeUpdate();	
		System.out.println("Data Saved");
	}
	
	public User findById(int Id) throws Exception{
		Class.forName(driver);
		Connection c=DriverManager.getConnection(dburl,user,password);
		PreparedStatement ps=c.prepareStatement("select * from user where id=?");
		ps.setInt(1,Id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			int id1=rs.getInt("id");
			String fname=rs.getString("fname");
			String lname=rs.getString("lname");
			String email=rs.getString("email");
			String password=rs.getString("password");
			String dob=rs.getString("dob");
			Long phone=rs.getLong("phone");
			
			User u = new User();
			
			u.setId(id1);
			u.setFname(fname);
			u.setLname(lname);
			u.setEmail(email);
			u.setPassword(password);
			u.setDob(dob);
			u.setPhone(phone);
			
			return u;
			
		}else {
			return null;
		}
		
		
	}
	
	public ArrayList<User> findByAll() throws Exception{
		ArrayList<User> al=new ArrayList<User>();
		Class.forName(driver);
		Connection c=DriverManager.getConnection(dburl,user,password);
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("Select * from user");
		while(rs.next()) {
			int id1=rs.getInt("id");
			String fname=rs.getString("fname");
			String lname=rs.getString("lname");
			String email=rs.getString("email");
			String password=rs.getString("password");
			String dob=rs.getString("dob");
			Long phone=rs.getLong("phone");
			
			User u = new User();
			
			u.setId(id1);
			u.setFname(fname);
			u.setLname(lname);
			u.setEmail(email);
			u.setPassword(password);
			u.setDob(dob);
			u.setPhone(phone);
			al.add(u);
			
		}
		
		return al;
		
		
		
	}
}
