package jungle.cave;

public class Tiger {

	private   int privateA=10;
	protected int protectedB=20;
	public    int publicC=30;
	          int defaultD=40;
	
	public Tiger() { //explicit no-arg ctor
		System.out.println("Tiger() ctor....");
	}
	
	public void roar() {
		System.out.println("Tiger is roaring....");
	}
	public void print() {
		System.out.println("privateA   : "+privateA);
		System.out.println("protectedB : "+protectedB);
		System.out.println("publicC    : "+publicC);
		System.out.println("defaultD   : "+defaultD);
	}
}

class Test
{
	void tester() {
		Tiger t = new Tiger();
		t.roar();
	}
}