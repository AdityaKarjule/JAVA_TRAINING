package jungle.use;

import jungle.cave.Tiger;

public class Testing {
	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		t.roar();
		t.print();
		
		System.out.println("privateA   : "+t.privateA);
		System.out.println("protectedB : "+t.protectedB);
		System.out.println("publicC    : "+t.publicC);
		System.out.println("defaultD   : "+t.defaultD);
	}
}

