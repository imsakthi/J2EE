package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class gmaillogin extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		PrintWriter out = res.getWriter();
		String db_email = "tom@gmail.com";
		String db_password = "123";
		
		if(email.equals(db_email)) {
			if(password.equals(db_password)) {
				RequestDispatcher rd = req.getRequestDispatcher("home.html");
				rd.forward(req, res);
			} else {
				out.print("<h1 style='color : red'>Incorrect password</h1>");	
				RequestDispatcher rd = req.getRequestDispatcher("gmaillogin.html");
				rd.include(req, res);
			}
		} else {
			out.print("<h1 style='color : red'>Incorrect email</h1>");	
			RequestDispatcher rd = req.getRequestDispatcher("gmaillogin.html");
			rd.include(req, res);
		}
	}
}
