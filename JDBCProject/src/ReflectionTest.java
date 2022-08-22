import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
//introspecting/ crawling / spider  of the object 
public class ReflectionTest {
	public static void main(String[] args) {
		
		Flight theFlightObj = new Flight(101);
		
		Class theClass = theFlightObj.getClass();
		
		
		System.out.println("This is an instance of "+theClass.getName());
		
		
		Method methodsArray[] = theClass.getMethods();
		
		for (Method method : methodsArray) {
			System.out.println("Method name is : "+method.getName());
		}
		System.out.println("-------");
		
		Constructor ctorArray[] = theClass.getConstructors();
		
		for (Constructor constructor : ctorArray) {
			System.out.println("Constructor with "+ constructor.getParameterCount()+" arguments");
			Parameter paraArray[] = constructor.getParameters();
			for (Parameter theParameter : paraArray) {
				System.out.println("Parameter is : "+theParameter.getType());
			}
			System.out.println("---------");
		}
	}


}
class Flight {
	private int flightNo;
	private String flightName;
	private  int ticketCost;
	private String source;
	private String destination;
	
	public Flight(int flightNo, String flightName, int ticketCost, String source, String destination) {
		super();
		this.flightNo = flightNo;
		this.flightName = flightName;
		this.ticketCost = ticketCost;
		this.source = source;
		this.destination = destination;

	
	
	}

	public Flight(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
		
		
	}

	public Flight(int flightNo) {
		super();
		this.flightNo = flightNo;
	}
	
	
}
/*
 



original image ---> Mirror
		<-- reflection
 
 	Every instance on an "Object class" got a method
 	called as getClass() that returns an instance
 	of class Class
 	
 	
 	Object
 	| Class getClass()
 	|
 	Flight flightObj = new Flight();
 	
 
 */