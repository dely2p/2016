package d20160623;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/selectMenu.do")
public class SelectMenu extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		int m = Integer.parseInt(req.getParameter("smenu"));
		String[] menuname = new String[5];
		menuname[0] = "김밥";
		menuname[1] = "라면";
		menuname[2] = "라면+김밥";
		menuname[3] = "떡볶이";
		menuname[4] = "돈까스";
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>저녁메뉴</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>당신이 선택한 메뉴는 [ "+menuname[m-1]+" ]입니다.<br>맛있게 드세요~~</h1>");
		pw.println("</body>");
		pw.println("</html>");
		
	}
	
}
