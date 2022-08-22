
public class Televisionset {
	public static void main(String[] args) {

		System.out.println("----------T.V ON-------------");
		Television tl = new Television();
		tl.switchOn();
		try {
			tl.selectChannel();
		} catch (TelevisionSupplyNotOnException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-------------");
	}
}

class TelevisionSupplyNotOnException1 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	TelevisionSupplyNotOnException1(String msg) {
		super(msg);
	}
}

class Television {
	boolean current;

	Television() {
		System.out.println("Television is  ready to be binged....but is it ready with power supply ? ?");
	}

	void switchOn() {
		if(current==false) {
			current = true;
		}
		System.out.println("T.V is switched on....");
	}
		
	void selectChannel() throws TelevisionSupplyNotOnException
	{
		if(current == false ) {
		TelevisionSupplyNotOnException tlSwitchNotOnEx = new TelevisionSupplyNotOnException("The T.V. is not connected with an external supply.");
			throw tlSwitchNotOnEx;
		}

		System.out.println("Channel binged....");
		binge();
		System.out.println("-------------");
		System.out.println("Channel changed...");
	}
	
	

	void binge() {
		for (int i = 1; i <= 0; i++) {
			System.out.println("\tWatching a channel." + i);
		}
		double num =Math.random()%100;
		if(num>0.5) {
			PowerFailure pf = new PowerFailure("Power is cut!!");
			throw pf;	
			
		}
		change();
	}
    
	void change() {
		for (int i = 1; i <= 0; i++) {
			System.out.println("\tChannel is being changed." + i);
		}
	}

	void switchOff() {
		if (current == true) {
			current = false;
		}
		System.out.println("T.V. is switched off.");
	}
}