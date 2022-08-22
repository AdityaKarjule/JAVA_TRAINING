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
 * Servlet implementation class ServletC
 */
@WebServlet("/C")
public class ServletC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		PrintWriter pw =response.getWriter();
		
		Country cntObj3 =(Country) request.getAttribute("indObj");
		cntObj3.name=cntObj3.name.toLowerCase();;
		pw.println("<h3>Servlet C is invoked"+cntObj3.hashCode()+"</h3>");
/*
		RequestDispatcher rd= (RequestDispatcher) request.getRequestDispatcher("/C");
		rd.include(request,response);
		pw.println("<h1>Servlet C is BACk</h1>");
*/
			}
			
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
