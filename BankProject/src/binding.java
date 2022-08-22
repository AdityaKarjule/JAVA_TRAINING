
public class binding {
public static void main(String args[]) {
	Doctor dt=new Doctor();
	dt.diagnose();
	Surgeon s=new Surgeon();
	s.diagnose();
	HeartSurgeon hs =new HeartSurgeon();
	hs.diagnose();

	if(dt instanceof Doctor) {
		System.out.println("Yes, dt is pointing to a Doctor");
		System.out.println("---------------------");
	}
	
	if(s instanceof Doctor) {
		System.out.println("Yes, s is pointing to a Doctor");
		System.out.println("---------------------");
	}
	
	if(hs instanceof Doctor) {
		System.out.println("Yes, hs is pointing to a Doctor");
		System.out.println("---------------------");
	}
	
	System.out.println("---------------------");
	
	
	Doctor ref = dt;
	
	ref.diagnose(); 
	
	ref = s;
	
	ref.diagnose(); 
	
	ref = hs;
	
	ref.diagnose(); 
	
	
		
	}
}

 class Doctor{
	void diagnose() {
		System.out.println("Doctor is checking:");
		System.out.println("---------------------");
	}
 }
 class Surgeon extends Doctor{
	 void diagnose() {
			System.out.println("Surgeon is operating:");
			System.out.println("---------------------");
		}
 }
 class HeartSurgeon extends Doctor{
	 void diagnose() {
			System.out.println("Heart Surgeon is operating:");
			System.out.println("---------------------");
		}
 }