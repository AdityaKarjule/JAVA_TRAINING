public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Banking started...");
		BankAccount myObj1 = new BankAccount();
		BankAccount myObj2 = new BankAccount();
		myObj1.setBankAccount(150, "Aditya", 50000);
		myObj1.printBankAccount();
		myObj2.setBankAccount(151, "Mansi", 100000);
		
		myObj2.printBankAccount();
		myObj1.withdraw(5000);
		myObj2.deposit(5000);
		myObj1.printBankAccount();
		myObj2.printBankAccount();
		
	}

}

class  BankAccount //business entity - primary key
{
	int accountNumber;
	String accountHolderName;
	double balance;
	
	
	void setBankAccount(int x, String y, double z)
	{
		System.out.println("setBankAccount(int, string, double)...");
		accountNumber=x;
		accountHolderName=y;
		balance=z;
	}
	double calculateSimpleInterest (float rateOfInterest, int period)
	{
		System.out.println("The Simple Interest is");
		return (balance*rateOfInterest*period)/100.0;
	}
	void withdraw(double amountToWithdraw)
	{
		System.out.println("Withdrawing...."+amountToWithdraw+"  from Kuldeep");
		balance= balance - amountToWithdraw;
	}
	void deposit(double amountToDeposit)
	{
		System.out.println("Depositing...."+amountToDeposit +"  to mayank");
		System.out.println("----------------");
		balance= balance + amountToDeposit;
	
	}
	double getBalance() {
		
		return balance;
	}
	void printBankAccount()
	{
		System.out.println("ACNO : "+accountNumber);
		System.out.println("ACNAME : "+accountHolderName);
		System.out.println("ACBAl : "+balance);
		System.out.println("----------------");
	}
}