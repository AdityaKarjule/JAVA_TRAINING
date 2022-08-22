package comp.DS;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletA
 */
@WebServlet("/A")
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter pw =response.getWriter();
Country cntObj1=new Country("India","New Delhi","Mr.Narendra Modi","136.46 Crores","Rs");
request.setAttribute("indObj", cntObj1);

pw.println("<h1>Servlet A is invoked"+cntObj1.hashCode()+"</h1>");
pw.println("<h1>Servlet A is invoked"+cntObj1.name+"</h1>");

RequestDispatcher rd= (RequestDispatcher) request.getRequestDispatcher("/B");
rd.include(request,response);
pw.println("<h1>Servlet A is BACk</h1>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
