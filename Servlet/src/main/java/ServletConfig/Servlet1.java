package ServletConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		String email=config.getInitParameter("email");
		PrintWriter out=res.getWriter();
		out.print("<h1> EMAIL ="+email+"<h1>");
		
	}

}
