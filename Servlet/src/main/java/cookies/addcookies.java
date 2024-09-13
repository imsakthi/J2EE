package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addCookies")
public class addcookies extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		Cookie c1 = new Cookie("email","joker@gmail.com");
		Cookie c2 = new Cookie("password","123");
		
		res.addCookie(c1);
		c1.setMaxAge(60);
		
		res.getWriter().print("<h1>cookies Added</h1>");
	}
	

}

