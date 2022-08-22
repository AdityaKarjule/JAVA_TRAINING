
public class Inheritance {

	public static void main(String[] args) {
		

		Senior srObj = new Senior('F',"XYZ", 21);


	srObj.printSenior();
		System.out.println("-----------");
		
		
		Junior jr = new Junior('M', "Aditya", 18, "Mt.Mary", "Science", 'A');
		
		jr.printJunior();

		
		System.out.println("-----------");
		KG kgObj = new KG('M', "Rahul",40,"PCCOE","BE",'A',"Rohan",45,"Rose" );
		kgObj.printKG();
		
	}

}

class Senior
{
	char gender;
	String name;
	int age;
	
	public Senior(char gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}

	void printSenior() {
		System.out.println("GENDER : "+gender);
		System.out.println("AGE    : "+age);
		System.out.println("NAME   : "+name);
		
	}
	
}

class Junior  extends Senior
{

	String college;
	String qualification;
	char grade;
	

	public Junior(char gender, String name, int age, String college, String qualification, char grade) {
		super(gender, name, age);
		this.college = college;
		this.qualification = qualification;
		this.grade = grade;
	}


	void printJunior() {
		super.printSenior();
		System.out.println("COLLEGE: "+college);
		System.out.println("QUAL   : "+qualification);
		System.out.println("GRADE  : "+grade);

	}
	
}

class KG extends Junior
{
	String Name;
	int age;
	String group;




	public KG(char gender, String name, int age, String college, String qualification, char grade, String name2,
			int age2, String group) {
		super(gender, name, age, college, qualification, grade);
		Name = name2;
		age = age2;
		this.group = group;
	}







	void printKG () {
		super.printJunior();
		System.out.println("COMPANY: "+name);
		System.out.println("JOB    : "+age);
		System.out.println("SALARY : "+group);
	}
	}
