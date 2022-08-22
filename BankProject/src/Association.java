import java.time.LocalDate;

public class Association {
public static void main (String args[])
{
	
	
	 Customer cr =new Customer();
	 
	 cr.setCustomer('M', "Harsh", 23,LocalDate.of(2002, 5,4));
	 Restaurants rt = new Restaurants();
     rt.printRestaurant("2 Starters+2 main course+2 deserts",11,201);
     Reception rc =new Reception();
     rc.setReception("XYZ",45,25.6f);
     
  
  Banquet bq= new Banquet();
   bq.printBanquet();

  
}
}

class Customer{
	
	char gender; 
	String name;
	int age; 
	LocalDate dateOfEntry;
	public void setCustomer(char gender, String name, int age, LocalDate i) {
	
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.dateOfEntry = i;
	}
	
	}

class Reception
{
	String customerName;
	int roomNo;
	float cost;
	
	
	public void setReception(String customerName, int roomNo, float cost) 
	{
		this.customerName = customerName;
		this.roomNo = roomNo;
		this.cost = cost;
	}




	void printReception(){
		System.out.println("-----Reception Desk-----");
		System.out.println("Aditya:"+customerName);
		System.out.println("Your Room number is:  "+roomNo);
		System.out.println("Charges for your room service are : "+cost);
	}
}
class Banquet extends Reception
{ 
	String customerName;
  public void setBanquet(String customerName, LocalDate todayDate, float cost)
  {
	this.customerName = customerName;
	this.todayDate = todayDate;
	this.cost = cost;
}
LocalDate todayDate;
  float cost;
 
void printBanquet() {
	System.out.println("-----Banquet Hall-----");
	System.out.println("Rahul"+customerName);
	System.out.println("Date of booking the banquet hall"+todayDate);
	System.out.println("Charges for the hall are : "+cost);
}
}

class Restaurants
{ String menu;
 int tableNo;
 int billId;
public void setRestaurant(String menu, int tableNo, int billId) {
	
	this.menu = menu;
	this.tableNo = tableNo;
	this.billId = billId;
}
 
	

void printRestaurant(String a,int b,int c)
{
	System.out.println("-----Restaurant-----");
	System.out.println("The menu opted++ for the Buffet service/Alakat for the Banquet hall is:  " +a);
    System.out.println("The follwoing table :"+b+" has this much bill " + c);	
}
}




