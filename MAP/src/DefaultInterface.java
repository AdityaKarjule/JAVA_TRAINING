
interface Restaurant
{
	default void print()
	{
		System.out.println("I'm vegetarian...");
	}
}

class Chef implements Restaurant
{

	Chef()
	{
		System.out.println("I'm a Chef...");
	}
}

public class DefaultInterface 
{
	public static void main(String[] args)
	{
		Chef r = new Chef();
		r.print();
	}
} 