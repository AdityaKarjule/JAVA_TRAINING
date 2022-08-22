import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Class details ..");
		Class s1 = new Class(01, "Aditya",92);
		Class s2 = new Class(02, "Vishal",100);
		Class s3 = new Class(03, "Rahul",45);
		Class s9 = new Class(04, "Aman",75);
		Class s4 = new Class(05, "Raju",43);
		Class s5 = new Class(06, "Shyam",82);
		Class s6 = new Class(07, "Raghav",72);
		Class s7 = new Class(8, "Ranjan",95);
		Class s8 = new Class(9, "Kartik",93);
		
		TreeSet<Class> students = new TreeSet<Class>();
		
		System.out.println("Adding 1st student.");
		students.add(s1);
	
		System.out.println("Adding 2nd student.");
		students.add(s2);
		
		System.out.println("Adding 3rd student.");
		students.add(s3);
		
		System.out.println("Adding 4th student.");
		students.add(s4);
		
		System.out.println("Adding 5th student.");
		students.add(s5);
		
		System.out.println("Adding 6th student.");
		students.add(s6);
		
		System.out.println("Adding 7th student.");
		students.add(s7);
		
		System.out.println("Adding 8th student.");
		students.add(s8);
		
		System.out.println("Adding 9th student.");
		students.add(s9);
		
		System.out.println("Elements are added..");
		
		System.out.println("Sorting the Class in increasing order of the total marks of students");
		Iterator<Class> setIterator = students.iterator();
	
		while(setIterator.hasNext())
		{
			Class theClass = setIterator.next();
			System.out.println("The Element: "+theClass);
			System.out.println("-------------------");
		}
		System.out.println("============");
		
	/*	for (Class theClass : students) {
			System.out.println("The Element : "+theClass);
			System.out.println("-------------------");
		}*/
	}
}
class Class implements Comparable<Class>
{
	int rollNumber;
	String name;
	int totalMarks;
	public Class(int rollNumber, String name, int totalMarks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.totalMarks = totalMarks;
	}
	@Override
	public String toString() {
		return "Class [rollNumber=" + rollNumber + ", name=" + name + ", totalMarks=" + totalMarks + "]";
	}
	public int compareTo(Class o){
		System.out.println("Comparing "+totalMarks + " with "+o.totalMarks);
		return Integer.compare(totalMarks, o.totalMarks);
	}
	
}