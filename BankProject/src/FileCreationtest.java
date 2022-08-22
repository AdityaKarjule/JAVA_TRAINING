import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCreationtest {
	public static void main(String args[]) {

		try {
			System.out.println("Trying to open a file");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\AKE40\\Desktop\\File4.txt", true);
			System.out.println("------File  created--------");

			Scanner scan = new Scanner(System.in);
			System.out.println("--------Enter youe data--------------:");
			String str = scan.nextLine();

			System.out.println("-----Got the string data:-----");

			byte byteArray[] = str.getBytes();
			System.out.println("------Converted the string into the byte array-----");
			fout.write(byteArray);
			
			System.out.println("---------byte array is written to the file------");
			fout.close();
			System.out.println("----------File  closed-------");
			
		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}
