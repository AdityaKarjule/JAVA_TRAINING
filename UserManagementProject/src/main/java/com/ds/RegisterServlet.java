package com.ds;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String upass = request.getParameter("upass");
		String email = request.getParameter("email");
		String mobno = request.getParameter("umno");
		String city = request.getParameter("city");
	    PrintWriter pw = response.getWriter();
	   
	    try {
			Statement st = conn.createStatement();
			System.out.println("statement created.."+st);
			PreparedStatement pst = conn.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?);");
			System.out.println("Query fired...got the result...");
			
			
			pst.setString(1, name);
			pst.setString(2, upass);
			pst.setString(3, email);
			pst.setString(4, city);
			pst.setString(5, mobno);

			
			int rows = pst.executeUpdate();
			pst.close();
			st.close();
			
		} catch (SQLException e) {
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
