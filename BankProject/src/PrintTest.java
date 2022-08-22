import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintTest {
public static void main(String args[]) {
	FileOutputStream fout;
	try {
		fout = new FileOutputStream("C:\\Users\\AKE40\\Desktop\\File4.txt");
		
	System.out.println("File is Ready====");

	PrintStream ps = new PrintStream(fout);
	System.out.println("Print Stream is ready--------");



	ps.println("hello File 1");
	ps.println("hello File 2");
	ps.println("hello File 3");
	ps.println("hello File 4");

	ps.close();
	fout.close();
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}




