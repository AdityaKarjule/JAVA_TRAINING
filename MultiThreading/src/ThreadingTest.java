
public class ThreadingTest {
	public static void main(String[] args) {
		
		MyCycle c1 = new MyCycle("Alex is riding in left lane");

		MyCycle c2 = new MyCycle("\tMax is riding in right lane"); 
	
		MyCycle c3 = new MyCycle("\t\tSam is riding in middle lane"); 
	
		MyCycle c4 = new MyCycle("\t\t\tLeo is riding in right lane"); 
		System.out.println("--------------------------------------------------------");

	System.out.println("current thread? : "+Thread.currentThread().getName());
		
		System.out.println("m1 : "+c1.getName());
		System.out.println("m2 : "+c2.getName());
		System.out.println("m3 : "+c3.getName());
		System.out.println("m4 : "+c4.getName());
		
		c1.setName("Alex Thread");
		c2.setName("Max Thread");
		c3.setName("Sam Thread");
		c4.setName("Leo Thread");
		
		System.out.println("m1 : "+c1.getName());
		System.out.println("m2 : "+c2.getName());
		System.out.println("m3 : "+c3.getName());
		System.out.println("m4 : "+c4.getName());
		
		c1.start();
		System.out.println("--------------------------------------------------------");
		c2.start();
		System.out.println("--------------------------------------------------------");
		c3.start();
		System.out.println("--------------------------------------------------------");
		c4.start();
		System.out.println("--------------------------------------------------------");
		
		System.out.println("is thread1 alive : "+c1.isAlive());
		System.out.println("is thread2 alive : "+c2.isAlive());
		System.out.println("is thread3 alive : "+c3.isAlive());
		System.out.println("is thread4 alive : "+c4.isAlive());
		try {
			c1.join(); //await for m1 to die
			c2.join(); //await for m2 to die
			c3.join(); // await for m3 to die
			c4.join(); // await for m4 to die
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("======> END OF MAIN <====== ");
		

		
	}
}

class MyCycle extends Thread 
{
	String msg;
	
	MyCycle (String c) {
		msg = c;
	}
	
	public void run() { 
		for (int i = 1; i < 5; i++) {
			System.out.println(msg+ " "+i);
		}
	}
}

