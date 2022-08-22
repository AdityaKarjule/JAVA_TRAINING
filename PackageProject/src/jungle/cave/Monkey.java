package jungle.cave;

public class Monkey {

	void jump() {
		Tiger t = new Tiger();
		t.roar();
		t.print();
		
		System.out.println("privateA   : "+t.privateA);
		System.out.println("protectedB : "+t.protectedB);
		System.out.println("publicC    : "+t.publicC);
		System.out.println("defaultD   : "+t.defaultD);
	}
}
