import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import java.io.FileInputStream;

public class FileHandling {
 public static void main(String args[]) {

try {
	System.out.println("Trying to open a file1----:");
	FileInputStream fin = new FileInputStream("C:\\Users\\AKE40\\Desktop\\File.txt");
	System.out.println("File1 is open:");
	
	System.out.println("Trying to open a file2----:");
	FileInputStream fin1 = new FileInputStream("C:\\Users\\AKE40\\Desktop\\File2.txt");
	System.out.println("File2 is open:");
	
	System.out.println("Trying to open a file3----:");
	FileInputStream fin3 = new FileInputStream("C:\\Users\\AKE40\\Desktop\\File3.txt");
	System.out.println("File3 is open:");
	
	byte b = (byte) fin.read();
	 while(b!=-1) {
 System.out.print((char) b);
 b = (byte) fin.read();

	 Thread.sleep(10);
}
System.out.println("\t-----trying to close a file-------------:");
fin.close();
System.out.println("\t-----------File closed-----------");
}
catch(FileNotFoundException e) {
	System.out.println("Problem 1"+e);

}catch(IOException e) {
	System.out.println("Problem 2"+e);}
	catch(InterruptedException  e)
	{
		System.out.println("Problem 3 "+e);
 }


}}