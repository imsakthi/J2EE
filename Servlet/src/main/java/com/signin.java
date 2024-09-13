package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class signin extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 String name=req.getParameter("name");
		 String phone=req.getParameter("phone");		
		 String email=req.getParameter("email");
		 String pass=req.getParameter("pass");
		
		   PrintWriter out=res.getWriter();
			String html="<html>"+"<body>"+"<h1>"+"email:"+email+"password:"+pass+"<h1>"+"</body>"+"</html>";
			out.print(html);
			System.out.println(name);
			System.out.println(phone);
			System.out.println(email);
			System.out.println(pass);
		
	}

}
