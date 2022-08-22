package comp.ds1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ResponseHeaderServlet")
public class ResponseHeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ResponseHeaderServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   response.setContentType("application/vnd.ms-excel");

   PrintWriter pw = response.getWriter();
   pw.println("Apple\tOrange\tMango");
   pw.println("20\t36\t44");
   pw.println("48\t60\t80");
   pw.println("80\t96\t38");
pw.println("=sum(A2:A4)\t=sum(B2:B4)\t=sum(C2:C4)");
	
}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
