
public class Company {
public static void main(String[] args) {
	

	DeptID d1=new DeptID();
	d1.setDeptID(10);
	
	System.out.println("The Department ID of your department is:"+d1.getDeptID());
	System.out.println("--------------------------------------------------------------");
	
	DeptName dn=new DeptName();
	dn.setDeptName("IT");
	
	System.out.println("The Department ID of your department is:"+d1.getDeptID());
	System.out.println("--------------------------------------------------------------");
	DeptLocation dl1= new DeptLocation();
	dl1.setDeptLocation();
	
	System.out.println("Your Department Location is :"+dl1.getDeptLocation());
	System.out.println("--------------------------------------------------------------");
	
	noOfEmployee ne =new  noOfEmployee();
	ne.setnumberOfEmployee();
	System.out.println("Number of employees are:"+ne.getnumberOfEmployee());
	
	
}
}


class CompanyName
{
	private String name;
	private int ID;
	private String Location;
	
	public String getname()
	{
		return this.name;
	}
	public void SetDeptName() {
		this.name=name;
	}
    
}

class DeptID
{int iD;

	public int getDeptID() {
		return iD;
	}

    public void setDeptID(int iD) {
    	this.iD=iD;
    }
    
}


class DeptName
{
	String name;
	
	public String getname() {
		return name;
	}

    public void setDeptName(String name) {
    	this.name=name;
    }
    
}
class DeptLocation
{ String location;

	public String getDeptLocation() {
		return location;
	}

    public void setDeptLocation() {
    	this.location=location;
    }
    
}


class noOfEmployee
{
	private int numberOfEmployee;
	public int getnumberOfEmployee() {
		return numberOfEmployee;
	}

    public void setnumberOfEmployee() {
    	this.numberOfEmployee=numberOfEmployee;
    }
    
}
