package d20160624;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/lifeCycle.do")
public class ServletLifeCycle extends GenericServlet{

	
	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출중 ");
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		System.out.println("서비스 호출중...");
		out.println("서비스 호출중...");
		
	}
	@Override
	public void destroy() {
		System.out.println("서블릿 제거중..."); // 메모리가 꽉차면 안쓰던 것부터 제거됨(톰캣을 종료할 때도 )
	}

}
