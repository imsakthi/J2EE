package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class execute {

	public static void main(String[] args) {
		Connection c=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 c=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/movie_db","root","sakthi");
			 Statement s=c.createStatement();
			 boolean b=s.execute("select * from movie");
			 System.out.println(b);
			 if(b) {
				 ResultSet rs=s.getResultSet();
				 while(rs.next()) {
					 System.out.println("Movie_name="+rs.getString(1));
						System.out.println("hero_name="+rs.getString(2));
						System.out.println("heroine_name="+rs.getString(3));
						System.out.println("dir_name="+rs.getString(4));
						System.out.println("villan_name="+rs.getString(5));
						System.out.println("collection="+rs.getDouble("collection"));
						System.out.println("Rating="+rs.getDouble("rating"));
						System.out.println("----------------------------------");
				 }
			 }
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
