package d20160623;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GuGuDan.html")
public class GuGuDan extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter pw = resp.getWriter();
		//int dan = 5;
		
		String d = req.getParameter("dan");
		int dan = Integer.parseInt(d);
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>구구단</title>");
		pw.println("</head>");
		pw.println("<body>");		
		pw.println("<h1>"+dan+"단 출력</h1>");
		for(int i=1;i<10;i++){
			pw.println("<h2>"+dan+" * "+i+" = "+dan*i+"</h2>");
		}		
		pw.println("</body>");
		
		pw.println("<html>");
	}
}
