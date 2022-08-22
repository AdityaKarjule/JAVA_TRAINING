package comp.ds.bank.serialize;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import comp.ds.bank.BankAccount;

public class ObjectDeSerializationTest {

		public static void main(String[] args) {
			
			BankAccount ba1 = null;
			BankAccount ba2 = null;
			System.out.println("Object is null...");
			
			try {
				FileInputStream fin  = new FileInputStream("C:\\Users\\AKE40\\Desktop\\BankAccount.dat");
				System.out.println("File is ready..for reading.....");
				
				ObjectInputStream ois = new ObjectInputStream(fin);
				System.out.println("Object stream is ready...for reading object.");
				
				System.out.println("Trying to retrieve the object...");
				ba1 = (BankAccount) ois.readObject();
				ba2 = (BankAccount) ois.readObject();
				System.out.println("Object retrieved....");
				
				System.out.println("ba is : "+ba1);
				System.out.println("ba is : "+ba2);
				
				ois.close();
				fin.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
			
		}
	
	/*	public static void main(String[] args) throws IOException {
		
		
		BankAccount ba = new BankAccount(101,"Julie",50000,1234,"Savings");
		
		System.out.println("ba "+ba.balance);
		
		FileWriter fout  = new FileWriter("/Users/apple/bank.txt");
		PrintWriter pw = new PrintWriter(fout);
		
		pw.println(ba.accountNumber);
		pw.println(ba.accountHolder);
		pw.println(ba.balance);
		
		pw.close();
		fout.close();
		
	}
	*/
}