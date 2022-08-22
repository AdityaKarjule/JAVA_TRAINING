package comp.ds1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


/**
 * Servlet implementation class FindCountryFromDatabaseServlet
 */
@WebServlet("/FindCountryFromDatabaseServlet")
public class  FindCountryFromDatabaseServlet extends GenericServlet {
	
      Connection conn; 
    /**
     * @see GenericServlet#GenericServlet()
     */
	public FindCountryFromDatabaseServlet() {
        super();
        System.out.println("FindCountryFromDatabaseServlet");
    	
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Database Driver loaded....");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_training","root","Aditya@9909");
		    System.out.println("Connected to the DB : "+conn);	
			  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * @see Servlet#init(ServletConfig)
	 */

	
	public void init(ServletConfig config) throws ServletException {
	     System.out.println("init");
	}


	public void destroy() {
	     System.out.println("destroy");
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	    System.out.println("\t\tservice()");
	    response.setContentType("text/html");
	    String country =  request.getParameter("countryName"); //read this HTML tag's value
	    PrintWriter pw = response.getWriter();
	    try {
			Statement st = conn.createStatement();
			System.out.println("statement created.."+st);
			ResultSet rs = st.executeQuery("SELECT * FROM MYCOUNTRIES");
			System.out.println("Query fired...got the result...");
			
			
			
			pw.println("<form action='countryJDBC'>");
			pw.println("<TABLE border=5 cellspacing=10 cellpadding=10>");
			
			pw.println("<TH>Country</TH>");
			pw.println("<TH>Capital</TH>");
			pw.println("<TH>Prime Minister</TH>");
			pw.println("<TH>Population</TH>");
			pw.println("<TH>Currency</TH>");
			
			pw.println("<TR>");
			pw.println("<TD><input type=text name='countryName'></TD>");
			pw.println("<TD><input type=text name='capitalName'></TD>");
			pw.println("<TD><input type=text name='pmName'></TD>");
			pw.println("<TD><input type=text name='population'></TD>");
			pw.println("<TD><input type=text name='currency'></TD>");
			pw.println("<TD><input type=submit name=submit style='font-size:16px; text-align:center; padding: 15px 32px; color:white; background-color:blue' value='Add'></TD>");
			pw.println("</TR>");
			
			

			while(rs.next()) {
				pw.println("<TR>");
				
				String foundCountryName = rs.getString(1);
				String foundCapitalName = rs.getString(2);
				String foundPrimeMinister = rs.getString(3);
				
				String foundPopulation = rs.getString(4);
				String foundCurrency = rs.getString(5);
				
				
				pw.println("<TD>"+foundCountryName+"</TD>");
				pw.println("<TD>"+foundCapitalName+"</TD>");
				pw.println("<TD><input type=text name='pmName' value='"+foundPrimeMinister+"'></TD>");
				pw.println("<TD>"+foundPopulation+"</TD>");
				pw.println("<TD>"+foundCurrency+"</TD>");
				
				pw.println("<TD><input type=submit name=submit style='font-size:16px; text-align:center; padding: 15px 32px; color:white; background-color:green' value='Edit'>   </TD>");
				pw.println("<TD><input type=submit name=submit style='font-size:16px; text-align:center; padding: 15px 32px; color:white; background-color:red' value='Delete'> </TD>");

				pw.println("</TR>");

			}
			pw.println("</TABLE>");
			pw.println("</form>");

			
			
			rs.close();
			st.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}