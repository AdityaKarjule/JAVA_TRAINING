import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAll {
	public static void main(String[] args) throws ClassNotFoundException {
		
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
			System.out.println("trying to make a statment");
			System.out.println("-----------------------------------------");
			Statement statement = conn.createStatement();
			System.out.println("Statement created : "+statement);
			System.out.println("-----------------------------------------");
	
			
			System.out.println("Trying to execute the statement....");
			System.out.println("-----------------------------------------");
			ResultSet rs = statement.executeQuery("SELECT * FROM EMP");
			System.out.println("Statement executed, got the result....");
			System.out.println("-----------------------------------------");
				
			while(rs.next()) {
				int empno = rs.getInt(1) ;
				String ename = rs.getString(2) ;
				String job = rs.getString(3);
				System.out.println("EMP NO   : "+empno);
				System.out.println("EMP NAME : "+ename);
				System.out.println("EMP SAL  : "+job);
				System.out.println("------------------------");
			}
			rs.close();	statement.close();	conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		    
	}
}











