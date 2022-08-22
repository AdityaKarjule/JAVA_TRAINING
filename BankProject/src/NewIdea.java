
public class NewIdea {
	public  static void main (String args[])
	{
		Food f =new Food();
		f.pizza();
		f.pasta(1,2.0f);
		f.burger(1,1.0f,'A');
		f.nachos(1,1.0f,1.00);
		
			
	}
}
	class Food
	{
		void pizza()
		{
		   System.out.println("Pizza is majorly eaten!:");
		   System.out.println("------------");
	    }



		void pasta(int x,float y)
		{
		   System.out.println("mostly "+y+" plates of pasta will be eaten by one person "+x);
		   System.out.println("x"+x);
		   System.out.println("y"+y);
		   System.out.println("------------");
	    }


		float burger(int x,float y,char c)
		{
		   System.out.println("Function 2 will be performing some act:");
		   System.out.println("x"+x);
		   System.out.println("y"+y);
		   System.out.println("c"+c);
		   System.out.println("------------");
		   return y+x;
		   
	}

		void nachos (int x,float y,double d)
		{
		   System.out.println("Function 2 will be performing some act:");
		   System.out.println("x"+x);
		   System.out.println("y"+y);
		   System.out.println("d"+d);
		   System.out.println("------------");
	}
}
