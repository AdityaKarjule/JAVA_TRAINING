import javax.swing.JFrame;
import javax.swing.JTextField;

public class Threadingtest2 {
	public static void main(String[] args) {
		
		BikeFrame bf1 = new BikeFrame("BikeFrame1",200,100,150,100);
		BikeFrame bf2 = new BikeFrame("BikeFrame2",200,100,350,100);
		BikeFrame bf3 = new BikeFrame("BikeFrame3",200,100,550,100);
		
		bf1.setVisible(true);
		bf2.setVisible(true);
		bf3.setVisible(true);
		
		Thread t1 = new Thread(bf1); 
		
		Thread t2 = new Thread(bf2);
		Thread t3 = new Thread(bf3);
		
		t1.start(); 
		t2.start();
		t3.start();
		
		
	}
}



class BikeFrame extends JFrame implements Runnable
{
	JTextField t = new JTextField(20);
	
	BikeFrame(String title, int h, int w, int x, int y) {
		setSize(h,w); 
		setLocation(x,y);
		setTitle(title);
		add(t);
		
	}
	public void run() { 
		long start= System.currentTimeMillis();	

		for (int i = 0; i <1000000; i++) {
			t.setText(i+"");
		}
		long end= System.currentTimeMillis();	
		System.out.println(((end-start)/1000.f)+"Seconds");
	} 
}