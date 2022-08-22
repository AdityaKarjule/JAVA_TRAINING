package comp.DS;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
* Servlet implementation class InsertNewCountry
*/
@WebServlet("/InsertNewCountry")
public class InsertNewCountry extends GenericServlet {
    private static final long serialVersionUID = 1L;
    Connection conn; 
    /**
     * @see GenericServlet#GenericServlet()
     */
    public InsertNewCountry() {
    super();
        System.out.println("add country()");
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Database Driver loaded....");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_training","root","Aditya@9909");
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
        // TODO Auto-generated method stub
    }

    /**
    * @see Servlet#destroy()
    */
    public void destroy() {
        // TODO Auto-generated method stub
    }

    /**
    * @see Servlet#service(ServletRequest request, ServletResponse response)
    */
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        System.out.println("\t\tservice()");
            response.setContentType("text/html");
            String country1 = request.getParameter("COUNTRYNAME");
            String capital = request.getParameter("CAPITAL");
            String primeMinister = request.getParameter("PRIMEMINISTER");
            String population = request.getParameter("POPULATION");
            String currency = request.getParameter("CURRENCY");
            PrintWriter pw = response.getWriter();
           
            try {
                Statement st = conn.createStatement();
                System.out.println("statement created.."+st);
                PreparedStatement pst = conn.prepareStatement("INSERT INTO MYCOUNTRIES VALUES(?,?,?,?,?);");
                System.out.println("Query fired...got the result...");
                
                
                pst.setString(1, country1);
                pst.setString(2, capital);
                pst.setString(3, primeMinister);
                pst.setString(4,population);
                pst.setString(5, currency);
                
                int rows = pst.executeUpdate();
                pst.close();
                st.close();
                
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

