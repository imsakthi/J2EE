package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class fetchid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("product_id");
		 int p_id=sc.nextInt();
		 try {
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/product_db","root","sakthi");
				 PreparedStatement ps=c.prepareStatement
						 ("select * from product where p_id=?");
	                    ps.setInt(1,p_id);
	                    
	                    ResultSet rs=ps.executeQuery();
	                    System.out.println("Query Executed");
	                    while(rs.next()) {
	        				System.out.println("p_Id="+rs.getInt(1));
	        				System.out.println("brand="+rs.getString(2));
	        				System.out.println("productname="+rs.getString(3));
	        				System.out.println("price="+rs.getDouble(4));
	        				System.out.println("--------------------------");
	        				
	        			}
		 }catch(Exception e){
	    	 e.printStackTrace();
	         
	     }

}



	}


