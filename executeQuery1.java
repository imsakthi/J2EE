package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class executeQuery1 {

	public static void main(String[] args) {
		String movie_name="dd";
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/movie_db","root","sakthi");
//			Statement s=c.createStatement();
			 PreparedStatement ps=c.prepareStatement("select movie_name,director,collection from movie where movie_name=?");
//			ResultSet rs=s.executeQuery("select * from movie");
			 ps.setString(1, movie_name);
			 ResultSet rs=ps.executeQuery();
//			while(rs.next()) {
//				System.out.println("Movie_name="+rs.getString(1));
//				System.out.println("hero_name="+rs.getString(2));
//				System.out.println("heroine_name="+rs.getString(3));
//				System.out.println("dir_name="+rs.getString(4));
//				System.out.println("villan_name="+rs.getString(5));
//				System.out.println("collection="+rs.getDouble("collection"));
//				System.out.println("Rating="+rs.getDouble("rating"));
//				System.out.println("----------------------------------");
				if(rs.next()) {
				System.out.println("Movie_name="+rs.getString(1));
				System.out.println("Movie_name="+rs.getString(2));
				System.out.println("Collection="+rs.getDouble(3));
			}
				else {
					System.out.println("not found");
				}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
