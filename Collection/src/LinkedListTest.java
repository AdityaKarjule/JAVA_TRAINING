import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		System.out.println("Creating the content....");
		PhoneContact contact1 = new PhoneContact("Aditya","Pune","9820443464","adityakarjule@gmail.com");
		PhoneContact contact2 = new PhoneContact("Aniket","Akurdi","4465165855","aniket@gmail.com");
		PhoneContact contact3 = new PhoneContact("Mansi","PCMC","7885696255","mansi@gmail.com");
		PhoneContact contact4 = new PhoneContact("Aditi","Pune","7858545852","aditi@gmail.com");
		PhoneContact contact5 = new PhoneContact("Divya","Pune","14685526385","divya@gmail.com");
		
		System.out.println("Content is creaeted....");
		
		System.out.println("Creating container....");
		LinkedList<PhoneContact> phoneBook = new LinkedList<PhoneContact>();
		System.out.println("Container is ready....");
		
		System.out.println("Adding the 1 element....");
		phoneBook.add(contact1);
		
		System.out.println("Adding the 2 element....");
		phoneBook.add(contact2);
			
		System.out.println("Adding the 3 element....");
		phoneBook.add(contact3);
		
		System.out.println("Adding the 4 element....");
		phoneBook.add(contact4);
		
		System.out.println("Adding the 5 element....");
		phoneBook.add(contact5);
		
		System.out.println("---> Now iterating over the container <---");
		
		Iterator<PhoneContact> iterator =  phoneBook.iterator();
		
		while(iterator.hasNext()) {
			PhoneContact theContact = iterator.next();
			System.out.println("The Contact : "+theContact);
		}
	}
}
class Contact
{
	String contactName;
	String contactAddress;
	public Contact(String contactName, String contactAddress) {
		super();
		this.contactName = contactName;
		this.contactAddress = contactAddress;
	}
	@Override
	public String toString() {
		return "Contact [contactName=" + contactName + ", contactAddress=" + contactAddress + "]";
	}
	
	
}

class PhoneContact extends Contact
{
	String contactNumber;
	String emailAddress;
	public PhoneContact(String contactName, String contactAddress, String contactNumber, String emailAddress) {
		super(contactName, contactAddress);
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "PhoneContact [toString()=" + super.toString() + ", contactNumber=" + contactNumber + ", emailAddress="
				+ emailAddress + "]";
	}
	
	
		
}