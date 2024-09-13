package jdbc;

import java.sql.*;

import java.util.Scanner;


public class jdbcproject {
                
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter movie name:");
		String movieName=sc.next();
		System.out.println("Enter hero name:");
		String hero=sc.next();
		System.out.println("Enter heroine name:");
		String heroine=sc.next();
		System.out.println("Enter director name:");
		String dir=sc.next();
		System.out.println("Enter villan name:");
		String villan=sc.next();
		System.out.println("Enter collection:");
		double collection=sc.nextDouble();
		System.out.println("Enter rating:");
		double rating=sc.nextDouble();
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/movie_db","root","sakthi");
//			Statement s=c.createStatement();
			PreparedStatement ps=c.prepareStatement("insert into movie values(?,?,?,?,?,?,?)");
//			s.executeUpdate("delete from movie where movie_name='kalki'");
			ps.setString(1, movieName);
			ps.setString(2, hero);
			ps.setString(3, heroine);
			ps.setString(4, dir);
			ps.setString(5, villan);
			ps.setDouble(6, collection);
			ps.setDouble(7,rating);
			ps.executeUpdate();
//			("update movie set collection=3.0 where movie_name='kalk'");
//			s.executeUpdate("insert into movie values('chichore','SR','sk','nel)");
//		    System.out.println("data inserted");
			System.out.println("movie updated");
			c.close();
		}
		catch(ClassNotFoundException  |SQLException e){
		                e.printStackTrace();
		}
	}
}
