import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class array {

	public static void main(String[] args) {
		
		System.out.println("Creating the content....");
		PhoneLog1 log1 = new PhoneLog1("You missed a call", LocalDate.now(), "Missed", "Reeta");
		PhoneLog1 log2 = new PhoneLog1("You dialed a call", LocalDate.now(), "Dialed", "Anjali");
		PhoneLog1 log3 = new PhoneLog1("You recieved a call", LocalDate.now(), "Recieved", "Shivani");
		PhoneLog1 log4 = new PhoneLog1("You got a sms", LocalDate.now(), "Message In", "Sapna");
		PhoneLog1 log5 = new PhoneLog1("You missed a call", LocalDate.now(), "Missed", "Priya");
		System.out.println("Content is creaeted....");
		
		System.out.println("Creating container....");
		ArrayList<PhoneLog1> phoneLogList = new ArrayList<PhoneLog1>();
		System.out.println("Container is ready....");
		
		System.out.println("Adding the 1 element....");
		phoneLogList.add(log1);
		
		System.out.println("Adding the 2 element....");
		phoneLogList.add(log2);
		
		System.out.println("Adding the 3 element....");
		phoneLogList.add(log3);
		
		System.out.println("Adding the 4 element....");
		phoneLogList.add(log4);
		
		System.out.println("Adding the 5 element....");
		phoneLogList.add(log5);
		
		System.out.println("---> Now iterating over the container <---");
		
		Iterator<PhoneLog1> iterator = phoneLogList.iterator();
		
		while(iterator.hasNext()) {
			PhoneLog1 theLog = iterator.next();
			System.out.println("The Log : "+theLog);
		}
	}
}

class Log1
{
	String logMessage;
	LocalDate logTime;
	
	public Log1(String logMessage, LocalDate logTime) {
		super();
		this.logMessage = logMessage;
		this.logTime = logTime;
	}

	@Override
	public String toString() {
		return "Log [logMessage=" + logMessage + ", logTime=" + logTime + "]";
	}

	
}

class PhoneLog1 extends Log1
{
	String logType;
	String logBy;
	
	public PhoneLog1(String logMessage, LocalDate logTime, String logType, String logBy) {
		super(logMessage, logTime);
		this.logType = logType;
		this.logBy = logBy;
	}

	@Override
	public String toString() {
		return "PhoneLog [toString()=" + super.toString() + ", logType=" + logType + ", logBy=" + logBy + "]";
	}
	
	
}