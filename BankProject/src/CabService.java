
public class CabService
{public static void main(String[] args)
{
	// TODO Auto-generated method stub
	System.out.println("Cabs are ready for the service:");

	Cab cbObj =new Cab();
	cbObj.journey(10);
	cbObj.waitingCharges(20.6f);
	cbObj.pickuppoint(40);
	cbObj.droplocation(20);
}
}
class  Cab
{

void journey(int x)
{
	System.out.println("Your journey is starting:");
}
void waitingCharges(float distance)
{
	System.out.println("Your waiting charges are applied as:"+distance);
}
void pickuppoint(int x)
{
	System.out.println("Your pick up point:"+x);
}
void droplocation(int y)
{
	System.out.println("Your pick up point:"+y);
}
}

	

