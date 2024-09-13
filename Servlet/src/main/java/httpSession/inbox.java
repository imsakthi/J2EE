package httpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/inbox")
public class inbox extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	
	   HttpSession session=req.getSession(false);
	
	   if(session != null) {
		   PrintWriter out = res.getWriter();
		   out.print("<h1>Inbox page for particular user session login</h1>");
	   }
	   else {
		   PrintWriter out = res.getWriter();
		   out.print("<h1>signin again</h1>");
	   }
	
	
	
	
	}
}
