package d20160624;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.ImageView;


@WebServlet("/showMovie.do")
public class ShowMovie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String[] m= {"정글북", "특별수사", "컨저링2", "아가씨", "워크래프트"};
		
		PrintWriter out = resp.getWriter();
		String ip = req.getRemoteAddr(); // ip
		String moviename = req.getParameter("movie");
		out.println("<html>");
		out.println("<head>");
		out.println("<style>img{width:400px; height:400px;}</style>");
		out.println("</head>");
		out.println("<body>");
		for(int i=0; i<m.length;i++){
			if(m[i].equals(moviename)){
				out.println("<img src='./images/movie"+(i+1)+".jpg' alt='"+moviename+"'/>");
			}				
		}	
		out.println("</body>");
		out.println("</html>");
		out.println(moviename);
	}
}
