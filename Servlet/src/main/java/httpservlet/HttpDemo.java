package httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/demo")
public class HttpDemo extends HttpServlet {
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
    	PrintWriter out=res.getWriter();
    	out.print("<h1> HI this is get Method</h1>");
    }
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
    	PrintWriter out=res.getWriter();
    	out.print("<h1> HI this is post Method</h1>");
    }
}
