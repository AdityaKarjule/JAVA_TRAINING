package com.ds;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Connection conn;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Database Driver loaded....");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Basketball21!06");
		    System.out.println("Connected to the DB : "+conn);	
			  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String emailid =  request.getParameter("email");
		  String upass =  request.getParameter("upass");
		   PrintWriter pw = response.getWriter();
		   
		    try {
				Statement st = conn.createStatement();
				System.out.println("statement created.."+st);
				ResultSet rs = st.executeQuery("SELECT * FROM UserMiniProject WHERE email='"+emailid+"' AND upass='"+upass+"'");
				System.out.println("Query fired...got the result...");
				if(rs.next()) {
					RequestDispatcher rd = request.getRequestDispatcher("/UserDashboardServlet");
					User uobj=new User(rs.getString(1),rs.getString(4),rs.getString(3),rs.getString(5));
					request.setAttribute("UserObj", uobj);
					rd.forward(request, response);
 
				}else {
					RequestDispatcher rd = request.getRequestDispatcher("login.html");
					pw.println("No record found...");
					rd.forward(request, response);
				}
				
				rs.close();
				st.close();
		    }
				catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		  
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
