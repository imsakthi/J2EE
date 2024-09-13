package com;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class lifecycle extends GenericServlet {

	
	@Override
	public void init(){
		System.out.println("Initmethod");
	}
	@Override
	public void destroy(){
		System.out.println("Destroy method");
	}
	
	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Hi from service method");
		
	}



}
