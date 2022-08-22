import java.time.LocalDate;

public class AssociationTest{
	public static void main(String[] args) {
		
		
		Customer cr= new Customer("Aditya", 11, LocalDate.of(2022, 05, 04));
		
		
		
		Restaurant rt = new Restaurant();
		rt.setRestaurant("Menu", 2300, 11);
		
		SwappingMachine sp = new SwappingMachine("Aditya",10,LocalDate.of(2022, 05, 04), "HDFC", 12, 1200);
		sp.setSwappingMachine("HDFC", 1234567, 2300);
	
		System.out.println(rt);
		sp.printSwappingMachine();
		
	}
}






class Restaurant
{
	String items;
	int cost;
	int tableID;
	public void setRestaurant(String items, int cost, int tableID) {
	
		this.items = items;
		this.cost = cost;
		this.tableID = tableID;
		
		
	}
	@Override
	public String toString() {
		return "Restaurant [items=" + items + ", cost=" + cost + ", tableID=" + tableID + "]";
	}

}


class Customer{
	
	
	String name;
    int tableID; 
	LocalDate dateOfEntry;
	
	public Customer(String name, int tableID, LocalDate dateOfEntry) {
		super();
		this.name = name;
		this.tableID = tableID;
		this.dateOfEntry = dateOfEntry;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", tableID=" + tableID + ", dateOfEntry=" + dateOfEntry + "]";
	}
	

	}

class SwappingMachine extends Customer{
	String bankName;
	int billNo;
	int amount;
	
		public SwappingMachine(String name, int tableID, LocalDate dateOfEntry, String bankName, int billNo, int amount) {
		super(name, tableID, dateOfEntry);
		this.bankName = bankName;
		this.billNo = billNo;
		this.amount = amount;
	}

		public void setSwappingMachine(String string, int i, int j) {
			// TODO Auto-generated method stub
			
		}

		void printSwappingMachine()
		{
			System.out.println("-----Reception Desk-----");
			System.out.println("Aditya:"+name);
			System.out.println("Your bill number is:  "+billNo);
			System.out.println("Charges for your selected food menu are : "+amount);
	}
}


class Receipt extends SwappingMachine
{
	public Receipt(String name, int tableID, LocalDate dateOfEntry, String bankName, int billNo, int amount) {
		super(name, tableID, dateOfEntry, bankName, billNo, amount);
		// TODO Auto-generated constructor stub
	}
	String customerName;
	int tableNo;
	int amount;
	int transactionID;
	public void setReceipt(int tableNo, int amount, int transactionID) {
		this.tableNo = tableNo;
		this.amount = amount;
		this.transactionID = transactionID;
		this.customerName=customerName;
		
		
	}
	void printReceipt() {
		System.out.println("-----Reception Desk-----");
		System.out.println("Aditya:"+customerName);
		System.out.println("Your bill number is:  "+billNo);
		System.out.println("Charges for your selected food menu are : "+amount);
}
	}
	
