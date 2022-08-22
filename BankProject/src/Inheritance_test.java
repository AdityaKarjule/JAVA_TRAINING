import java.time.LocalDate;

public class Inheritance_test {

	public static void main(String[] args) {
		

		AadharCard aadharCard1 = new AadharCard();
		AadharCard aadharCard2 = new AadharCard();
		AadharCard aadharCard3 = new AadharCard();
		
		aadharCard1.setAdhaarCard("1234 1234 1234", "Aditya Karjule","Govt Of India", "Mumbai", LocalDate.of(2002, 12, 25), "8876345678");
		aadharCard2.setAdhaarCard("9909 9909 9909", "Rahul Sharma","Govt Of India", "Pune", LocalDate.of(2003, 11, 20), "7776342618");
		aadharCard3.setAdhaarCard("9099 9099 9099", "Dev Ops","Govt Of India", "Nasik", LocalDate.of(2004, 10, 21), "66876345178");
		
		PANcard pc1= new PANcard();
		PANcard pc2= new PANcard();
		PANcard pc3= new PANcard();
		
		pc1.setPANcard("H654654", "Aditya Karjule","Govt Of India", "Mumbai", LocalDate.of(2002, 12, 25), "8876345678");
		pc2.setPANcard("B568457", "Rahul Sharma ","Govt Of India", "Pune", LocalDate.of(2003, 11, 20), "7776342618");
		pc3.setPANcard("G684464", "Dev Ops","Govt Of India", "Nasik", LocalDate.of(2004, 10, 21), "66876345178");
		
		
		Person thePersonObj = new Person('M',"Aditya", 21, aadharCard1,pc1);


		thePersonObj.printPerson();
		System.out.println("-----------");
		
		
		Student theStudentObj = new Student('M', "Rahul Sharma", 24, aadharCard2,pc2,"Bits Pilani", "MBA", 'A');
		
		theStudentObj.printStudent();

		
		System.out.println("-----------");
		
		Employee empObj = new Employee('F', "Julie", 22, aadharCard3,pc3, "IIT", "Mtech", 'A', "Google", "Analyst", 25000);
		empObj.printEmployee();
		
		
	}

}

class AadharCard
{
	String aadharNumber;
	String nameOnAdhaar;
	String issuedBy;
	String address;
	LocalDate birthdate;
	String phoneNumber;
	
	public void setAdhaarCard(String aadharNumber, String name, String issuedBy, String address, LocalDate birthdate, String phoneNumber) {
		
		this.aadharNumber = aadharNumber;
		this.nameOnAdhaar = name;
		this.issuedBy = issuedBy;
		this.address = address;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
	}
	
	void printAdhaarCard() 
	{
		System.out.println("Aadhar Card : "+aadharNumber);
		System.out.println("Aadhar Name : "+nameOnAdhaar);
		System.out.println("Issued By   : "+issuedBy);
		System.out.println("Address     : "+address);
		System.out.println("Birthdate   : "+birthdate);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("-------");
	}
	
}
class PANcard{
	String panNumber;
	public void setPANcard(String panNumber, String nameOnAdhaar, String issuedBy, String address, LocalDate birthdate,
			String phoneNumber) {
	
		this.panNumber = panNumber;
		this.nameOnAdhaar = nameOnAdhaar;
		this.issuedBy = issuedBy;
		this.address = address;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
	}

	String nameOnAdhaar;
	String issuedBy;
	String address;
	LocalDate birthdate;
	String phoneNumber;
	
	void printPANCard() 
	{
		System.out.println("PAN number : "+panNumber);
		System.out.println("PAN Name : "+nameOnAdhaar);
		System.out.println("Issued By   : "+issuedBy);
		System.out.println("Address     : "+address);
		System.out.println("Birthdate   : "+birthdate);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("-------");
	}
}
class Person

{
	char gender; 
	String name;
	int age;    
	AadharCard aadharCard; 
    PANcard pancard;

	
	public Person(char gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	

	public Person(char gender, String name, int age, AadharCard aadharCard) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.aadharCard = aadharCard;
	}


	public Person(char gender, String name, int age, AadharCard aadharCard, PANcard pancard) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.aadharCard = aadharCard;
		this.pancard = pancard;
	}


	void printPerson() {
		System.out.println("GENDER : "+gender);
		System.out.println("AGE    : "+age);
		System.out.println("NAME   : "+name);
		if(aadharCard!=null) {
			aadharCard.printAdhaarCard();
		}
		else {
			System.out.println("No Aadhar Card Info");
		}
		if(pancard!=null) {
			pancard.printPANCard();
		}
		else {
			System.out.println("No PAN Card Info");
		}
	}
	
	
}

class Student extends Person 
{

	String college; 
	String qualification; 
	char grade; 
	
	public Student(char gender, String name, int age, String college, String qualification, char grade) {
		super(gender, name, age);
		this.college = college;
		this.qualification = qualification;
		this.grade = grade;
	}
	
	

	public Student(char gender, String name, int age, AadharCard aadharCard, String college, String qualification,
			char grade) {
		super(gender, name, age, aadharCard);
		this.college = college;
		this.qualification = qualification;
		this.grade = grade;
	}



	public Student(char gender, String name, int age, AadharCard aadharCard, PANcard pancard, String college,
			String qualification, char grade) {
		super(gender, name, age, aadharCard, pancard);
		this.college = college;
		this.qualification = qualification;
		this.grade = grade;
	}



	void printStudent() {
		super.printPerson();
		System.out.println("COLLEGE: "+college);
		System.out.println("QUAL   : "+qualification);
		System.out.println("GRADE  : "+grade);

	}
	
}

class Employee extends Student 
{
	String company; 
	String job; 
	double salary; 
	
	public Employee(char gender, String name, int age, String college, String qualification, char grade, String company,
			String job, double salary) {
		super(gender, name, age, college, qualification, grade);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}
	
	

	public Employee(char gender, String name, int age, AadharCard aadharCard, String college, String qualification,
			char grade, String company, String job, double salary) {
		super(gender, name, age, aadharCard, college, qualification, grade);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}



	public Employee(char gender, String name, int age, AadharCard aadharCard, PANcard pancard, String college,
			String qualification, char grade, String company, String job, double salary) {
		super(gender, name, age, aadharCard, pancard, college, qualification, grade);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}



	void printEmployee() {
		super.printStudent();
		System.out.println("COMPANY: "+company);
		System.out.println("JOB    : "+job);
		System.out.println("SALARY : "+salary);
	}
}