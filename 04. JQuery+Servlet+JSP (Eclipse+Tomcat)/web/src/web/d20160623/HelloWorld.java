package d20160623;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// servlet : 웹서버에서 동작하는 작은 자바 프로그램
// 1. HttpServlet 상속
// 2. doGet(req, resp) Override
// 3. was에 서블릿 등록
@WebServlet("/hello.html")
public class HelloWorld extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		
	/*	pw.println("<h1>Hello Servlet World!!!"+i+"</h1>");
		pw.println("Hello~~~");*/
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title> Hello Servlet </title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>My First Servlet </h1>");
		pw.println("<h2>안녕!!! 서블릿!! </h2>");
		pw.println("</body>");
		pw.println("</html>");
		
		
	}
}
