package cookies;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteCookies")
public class deletecookies extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServerException{
		Cookie arr[] = req.getCookies();
		
		PrintWriter out = res.getWriter();
		
		for(Cookie c : arr) {
			c.setMaxAge(0);
			
			res.addCookie(c);
			out.print("<h1>cookies Deleted</h1>");
		}
	}

}

