package comp.ds1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeaderServlet
 */
@WebServlet("/HeaderServlet")
public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeaderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	Enumeration enumerations = request.getHeaderNames();
	
	response.setContentType("text/html");
	pw.println("<h2>Showing Request Headers</h2>");
	pw.println("<TABLE border=5 cellspacing=5 cellpadding=5>");
while (enumerations.hasMoreElements()) {
	String headerKey=(String)enumerations.nextElement();
	String headerValue = request.getHeader(headerKey);
	pw.println("<TR>");
	pw.println("<TD style ='color:red'>");
	pw.println(headerKey);
	pw.println("</TD>");
	pw.println("<TD>");
	pw.println(headerValue);
	pw.println("</TD>");
	pw.println("</TR>");

}
pw.print("<TABLE>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
