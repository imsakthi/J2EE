package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getCookies")
public class getcookies extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		Cookie arr[] = req.getCookies();
		
		PrintWriter out = res.getWriter();
		
		for (Cookie c: arr) {
			out.print("<h1> Name =  " + c.getName() + "Value =" + c.getValue() + "</h1>");
		}
	}

}

