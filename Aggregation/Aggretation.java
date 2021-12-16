package Aggregation;

class Bank{
	int accountno;
	String userName;
	//Parameterized Constructor to initialize the values for variables
	public Bank(int accountno, String userName) {
		super();
		this.accountno = accountno;
		this.userName = userName;
	}
}

class College{
	String College;
	int id;
	//Parameterized constructor to initialize the values for variables.
	public College(String college, int id) {
		super();
		College = college;
		this.id = id;
	}

}
public class Aggretation {

	public static void main(String[] args) {
		//we need to create an object for the classes.
		//Object create for Bank class
		Bank Object = new Bank(102928333,"Kamal");
		//Object created for College class
		College obj = new College("ABN University",25);
		System.out.println("Account number: "+Object.accountno);
		System.out.println("User name : "+Object.userName);
		System.out.println("Collge name :"+obj.College);
		System.out.println("ID Number : "+obj.id);
		}
}