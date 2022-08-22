public class InterThreadCommunication {
public static void main(String[] args) {
		
		FoodItem food = new FoodItem("Pizza"); 
		
		Eater e = new Eater(food);
		Server s = new Server(food); 
		
		s.start();
		e.start(); 
	}
}
interface Eating
{
	void eat();
}
interface Serving
{
	void serve();
}

class FoodItem implements Eating, Serving
{
	String name;
	boolean itemServed; 
	
	FoodItem(String item) {
		name = item;
	}
	
	
	public synchronized void eat() { 
		if(itemServed==false) {
			System.out.println("eat() : Waiting for the food item to be served...");
			try {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("eat() : Food is eaten..."+name);
	}
	
	
	public synchronized void serve() { 
		if(itemServed==false) {
			System.out.println("serve() :  Food is being served....");
			itemServed=true;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notify(); 
		}
	}
}

class Eater extends Thread 
{	
	FoodItem foodRef;
	
	Eater(FoodItem fi) {
		foodRef = fi;
	}
	
	public void run() {
		foodRef.eat();
	}
}
class Server extends Thread
{
	FoodItem foodRef;
	
	Server(FoodItem fi) {
		foodRef = fi;
	}
	public void run() {
		foodRef.serve();
	}
}