

public class FunctionTypetest 
{

	public static void main(String[] args) {
	
		Calculator myCalci= new Calculator();
		myCalci.fun1();
		myCalci.fun2(4, 5.6f, 79.8);
		double output=myCalci.fun3('0', 4, 78);
		System.out.println("Output "+output );
		double DistanceBwEarthAndSun= myCalci.fun4();
		System.out.println("DistanceBwEarthAndSun "+DistanceBwEarthAndSun );
	}
	
}

class Calculator 
{
	//1
	void fun1()
	{
		System.out.println("fun1 is doing some activity");
		System.out.println("------------------");
	}
	//2
	void fun2(int x, float y, double z) 
	{
		System.out.println("fun2 is doing some activity");
		System.out.println("x  " +x);
		System.out.println("y  " +y);
		System.out.println("z  " +z);
		System.out.println("------------------");
	}
	//3
	double fun3(char x, int y, double z) {
		System.out.println("fun3 is doing some activity");
		System.out.println("x  " +x);
		System.out.println("y  " +y);
		System.out.println("z  " +z);
		System.out.println("------------------");
		return y+z+4;
	}
	//4
	double fun4() {
		System.out.println("fun4 is doing some activity");
		System.out.println("Caculating the distance between Earthand the Sun.");
		System.out.println("------------------");
		return 18600.519*480;
	}
	
	
}