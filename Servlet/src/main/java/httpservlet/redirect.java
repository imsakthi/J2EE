package httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/redirect")
public class redirect extends HttpServlet {
	
	 protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	    	res.sendRedirect("https://github.com/victorvijayprasad");
	    }

}
