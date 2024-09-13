package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class getparameter extends GenericServlet {

	@Override
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id=  req.getParameter("id");
		String name=req.getParameter("name");
		PrintWriter out=res.getWriter();
		String html="<html>"+"<body>"+"id:"+id+"name:"+name+"<h1>"+"</body>"+"</html>";
		out.print(html);
		
	}

}
