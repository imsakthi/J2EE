package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
	          Scanner sc=new Scanner(System.in);
	          System.out.println("Enter the director name:");
              String director=sc.next();
              try {
            	  Class.forName("com.mysql.cj.jdbc.Driver");
            	  Connection c=DriverManager.getConnection
      					("jdbc:mysql://localhost:3306/movie_db","root","sakthi");
            	  PreparedStatement ps=c.prepareStatement
            			  ("select * from movie where director=?");
            	 ps.setString(1,director);
            	 ResultSet rs=ps.executeQuery();
            	 while(rs.next()) {
            		 System.out.println("Movie_name:"+rs.getString(1));
            		 System.out.println("Hero_name:"+rs.getString(2));
            		 System.out.println("Heroine_name:"+rs.getString(3));
            		 System.out.println("Director_name:"+rs.getString(4));
            		 System.out.println("Villan_name:"+rs.getString(5));
            		 System.out.println("Collection:"+rs.getDouble(6));
            		 System.out.println("Rating:"+rs.getDouble(7));
            		 
            	 }
              }
              catch(Exception e) {
            	                e.printStackTrace();
              }
	}

}
