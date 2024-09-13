package PassingObjectfromoneclassintoanother;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/passobject")
public class GetAttribute extends HttpServlet{

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {

		student s=new student(1,"Sujitha",75000);
		ServletContext context=getServletContext();
		context.setAttribute("std", s);
		res.getWriter().print("<h1>Added</h1>");
}
}
