import java.time.LocalDate;
import java.util.ArrayList;

public class InnovativeNested {
	public static void main(String[] args) {
		Restaurant r = new Restaurant("TEXAS TOWER", "PUNE", 946465321);
		r.printRestaurant();
		
		Restaurant.BillDesk bill1 = new Restaurant.BillDesk(1045,21,"Aditya Karjule",LocalDate.now(),"UPI");
		System.out.println(bill1);
		

		Restaurant.BillDesk bill2 = new Restaurant.BillDesk(1045,21,"SAM",LocalDate.now(),"Debit-card");
		System.out.println(bill2);
	}
}

class Restaurant
{
	private String restaurantName;
	private String restaurantAddress;
	private int contact;
	
	ArrayList<Banquet> halls = new ArrayList<Banquet>();
	private class Banquet{
		private int hallCapacity;
		private float hallArea;
		private int maxPersonsCanEat;
		
		
		
		public Banquet(int hallCapacity, float hallArea, int maxPersonsCanEat) {
			super();
			this.hallCapacity = hallCapacity;
			this.hallArea = hallArea;
			this.maxPersonsCanEat = maxPersonsCanEat;
		}
		public float getHallCapacity() {
			return hallCapacity;
		}
		public void setHallCapacity(int hallCapacity) {
			this.hallCapacity = hallCapacity;
		}
		public float getHallArea() {
			return hallArea;
		}
		public void setHallArea(float hallArea) {
			this.hallArea = hallArea;
		}
		public int getMaxPersonsCanEat() {
			return maxPersonsCanEat;
		}
		public void setMaxPersonsCanEat(int maxPersonsCanEat) {
			this.maxPersonsCanEat = maxPersonsCanEat;
		}
		@Override
		public String toString() {
			return "Banquet [hallCapacity=" + hallCapacity + ", hallArea=" + hallArea + ", maxPersonsCanEat="
					+ maxPersonsCanEat + "]";
		}	
	}

	public void printRestaurant() {
		System.out.println("----------------------------");
		System.out.println("Restaurant Name: " + restaurantName);
		
		System.out.println("Restaurant Address: " + restaurantAddress);
		System.out.println("Restaurant contact: " + contact);
		
		for(Banquet hall: halls) {
			System.out.println("-------------------------------------");
			System.out.println(hall);
		}
		System.out.println("-------------------------------------");
		
	}
	
	
	public Restaurant(String restaurantName, String restaurantAddress, int contact) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantAddress = restaurantAddress;
		this.contact = contact;
		Banquet b1 = new Banquet(50, 500, 20);
		Banquet b2 = new Banquet(200, 1500, 150);
		this.halls.add(b1);
		this.halls.add(b2);
	}
	
	public static class BillDesk
	{
		int billId;
		int tableno;
		private String Cutomername;
		LocalDate transactionDate;
		String transactionType;

		public BillDesk(int billId, int tableno, String cutomername, LocalDate transactionDate,
				String transactionType) {
			super();
			this.billId = billId;
			this.tableno = tableno;
			Cutomername = cutomername;
			this.transactionDate = transactionDate;
			this.transactionType = transactionType;
		}

		public int getBillId() {
			return billId;
		}

		public void setBillId(int billId) {
			this.billId = billId;
		}

		public int getTableno() {
			return tableno;
		}

		public void setTableno(int tableno) {
			this.tableno = tableno;
		}

		public String getCutomername() {
			return Cutomername;
		}

		public void setCutomername(String cutomername) {
			Cutomername = cutomername;
		}

		public LocalDate getTransactionDate() {
			return transactionDate;
		}

		public void setTransactionDate(LocalDate transactionDate) {
			this.transactionDate = transactionDate;
		}

		public String getTransactionType() {
			return transactionType;
		}

		public void setTransactionType(String transactionType) {
			this.transactionType = transactionType;
		}

		@Override
		public String toString() {
			return "BillDesk [billId=" + billId + ", tableno=" + tableno + ", Cutomername=" + Cutomername
					+ ", transactionDate=" + transactionDate + ", transactionType=" + transactionType + "]";
		}
		
		

		
	}


	

}

