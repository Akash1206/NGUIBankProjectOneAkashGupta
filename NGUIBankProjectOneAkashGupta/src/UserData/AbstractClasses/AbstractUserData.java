package UserData.AbstractClasses;

public abstract class AbstractUserData {
	public String name;
	public long phoneNumber;
	public int employeeID;
	public String[] address;
	
	public AbstractUserData(String name2, long phoneNumber2, int employeeID2, String[] address2) {
		// TODO Auto-generated constructor stub
		this.name=name2;
		this.phoneNumber=phoneNumber2;
		this.employeeID=employeeID2;
		this.address=address2;
	}
	
}
