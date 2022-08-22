import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


	public class MultipleFileHandling{
		public static void main(String argts[]) {
			String fileNames[]= {"File1.txt","File2.txt","File3.txt"};
			for(String fileName:fileNames)
			{
				MyFilereader mf = new MyFilereader(fileName);
			}
	}
	}
class MyFilereader
{
	FileInputStream fin;
	public MyFilereader(String fileName) {
		System.out.println("Trying to open a file--------");
	try {
		fin = new FileInputStream(fileName);
	}
	catch(FileNotFoundException e) {
		System.out.println("Problem 1"+e);
		
	}
	System.out.println("Filoe nis open:");

	}

	void readFileData() {
		byte b;
		try {
			b = (byte) fin.read();
			while(b!=-1) {
				 System.out.print((char) b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void closeFile() {
		try {
			fin.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}