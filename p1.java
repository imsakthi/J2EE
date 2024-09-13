package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		boolean a= true;
		while(a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("product_id:");
		int p_id=sc.nextInt();
		System.out.println("brand:");
		String brand=sc.next();
		System.out.println("product name:");
		String pname=sc.next();
		System.out.println("price:");
		double price=sc.nextDouble();
     try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/product_db","root","sakthi");
			PreparedStatement ps=c.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1,p_id);
			ps.setString(2,brand);
			ps.setString(3,pname );
			ps.setDouble(4,price);
			ps.executeUpdate();
     }		
     catch(Exception e){
    	 e.printStackTrace();
     
     }

		}
	}

}
