package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class form extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 String email=req.getParameter("email");
		 String pass=req.getParameter("pass");
		
		   PrintWriter out=res.getWriter();
			String html="<html>"+"<body>"+"<h1>"+"email:"+email+"password:"+pass+"<h1>"+"</body>"+"</html>";
			out.print(html);
	}
    
}
