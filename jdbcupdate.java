package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class jdbcupdate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter movie name:");
		String movieName=sc.next();
//		System.out.println("Enter collection:");
//		double collection=sc.nextDouble();
//		System.out.println("Enter rating:");
//		double rating=sc.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/movie_db","root","sakthi");
//			PreparedStatement ps=c.prepareStatement("update movie set collection=?,rating=? where movie_name=?");
			PreparedStatement ps=c.prepareStatement("delete from movie where movie_name=?");
//			ps.setDouble(1,collection);
//			ps.setDouble(2,rating);
			ps.setString(1,movieName);
			ps.executeUpdate();
//			System.out.println("query updated");
			System.out.println("query Deleted");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
