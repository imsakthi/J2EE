package PassingObjectfromoneclassintoanother;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getobject")
public class setAttribute extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		ServletContext context=getServletContext();
		student s=(student) context.getAttribute("std");
		resp.getWriter().print("<h1>"+s+"</h1>");
	}

}
