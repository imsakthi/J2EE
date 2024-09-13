package httpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/loginSession")
public class LoginCheck extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");
		PrintWriter out = res.getWriter();
		if (email.equals("tom@gmail.com")) {
			if (password.equals("123")) {
				HttpSession session = req.getSession();
				RequestDispatcher rd = req.getRequestDispatcher("inbox");
				rd.forward(req, res);
			} else {
				out.print("<h1>INCORRECT PASSWORD</h1>");
				RequestDispatcher rd = req.getRequestDispatcher("HttpSessionlogin.html");
				rd.include(req, res);
			}
		} else {
			out.print("<h1>INCORRECT Email</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("HttpSessionlogin.html");
			rd.include(req, res);
		}

	}
}
