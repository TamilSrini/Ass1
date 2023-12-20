package Banking;

public class Main {

	public static void main(String[] args)
	{
	int accNo=0;
	String name="";
	int balance=0;
	User u1=new User();
	u1.accounno=101;
	u1.name="Tamil";
	u1.balanc=20000;
	User u2=new User();
	u2.accounno=102;
	u2.name="Bharathi";
	u2.balanc=40000;
	u1.deposit(2000);
	u2.deposit(1000);
	u1.withdrawal(200);
	u2.withdrawal(100);
	u1.printdetails();
	u2.printdetails();
	
	
	
	}
	
}
