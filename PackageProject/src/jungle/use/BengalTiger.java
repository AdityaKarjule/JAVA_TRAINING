package jungle.use;

import jungle.cave.Tiger;

public class BengalTiger extends Tiger {
	
	public void printBengalTiger() {
		
		System.out.println("privateA   : "+privateA);
		System.out.println("protectedB : "+protectedB);
		System.out.println("publicC    : "+publicC);
		System.out.println("defaultD   : "+defaultD);
		
	}
	
	public void tigerRefWay() {
		Tiger t; //= ?
		System.out.println("privateA   : "+t.privateA);
		System.out.println("protectedB : "+t.protectedB);
		System.out.println("publicC    : "+t.publicC);
		System.out.println("defaultD   : "+t.defaultD);
		
	}

}
