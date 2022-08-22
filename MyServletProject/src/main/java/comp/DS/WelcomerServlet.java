package comp.DS;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class WelcomerServlet
 */
@WebServlet(name = "/welcome", urlPatterns = { "/welcome" })
public class WelcomerServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    
    public WelcomerServlet() {
System.out.println("Welcome to the servlet()....ctor");        
    }


	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init()...");
	}

	
	public void destroy() {
		System.out.println("Destroy()...");
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Service()...");
		response.setContentType("text/html");
		String hostAddr = request.getRemoteAddr();
		int hostPort = request.getRemotePort();
		PrintWriter pw= response.getWriter();
		pw.println("<!DOCTYPE html>\n"
		 		+ "<html>\n"+ "<head>\n"
		 		+ "<meta charset=\"UTF-8\">\n"
		 		+ "<title>Insert title here</title>\n"+ "</head>\n"
		 		+ "<body>\n");
		 for(int i=1;i<=6;i++) {
			 pw.println("<h"+i+"> Welcome to the World of Java Servlets </h"+i+">\n");
		 }
		 pw.println("<a href='http://localhost:8080/MyServletProject'>Back</a>");
		 pw.println("</body>\n</html>");


	}

}
