import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
	public static void main(String[] args) throws EmployeeAlreadyExists, ClassNotFoundException
	{
		
		try {
			System.out.println("Registering driver...");   
			System.out.println("-----------------------------------------");
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver registered....");
			System.out.println("-----------------------------------------");
			
			System.out.println("Trying to connect to the DB");
			System.out.println("-----------------------------------------");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java_training", "root", "Aditya@9909");
			
			System.out.println("Connected to the DB : "+conn);
			System.out.println("-----------------------------------------");
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter employee number to delete  : ");
			int eno = scan1.nextInt();
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from emp where empno="+eno);
			
			if(rs.next()) {
				
				System.out.println("trying to make a Prepared statment");
				System.out.println("-----------------------------------------");
				PreparedStatement pst = conn.prepareStatement("DELETE FROM EMP WHERE EMPNO=?");
				System.out.println("Prepared Statement created : "+pst);
				System.out.println("-----------------------------------------");
				pst.setInt(1, eno);
				
				System.out.println("Trying to execute the prepared statement....");
				System.out.println("-----------------------------------------");
				int rows = pst.executeUpdate();
				
				System.out.println("Prepred Statement executed, deleted the records :..."+rows);
				System.out.println("-----------------------------------------");
				
				pst.close();	conn.close();
				
			}
			else {
				EmployeeNotFoundException empNotFndEx = new EmployeeNotFoundException("Employee NOT found exception : "+eno);
				throw empNotFndEx;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		    
	}
}






