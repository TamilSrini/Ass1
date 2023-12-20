package Banking;

public class User {
	String name;
	int accounno;
	int balanc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccounno() {
		return accounno;
	}
	public void setAccounno(int accounno) {
		this.accounno = accounno;
	}
	public int getBalanc() {
		return balanc;
	}
	public void setBalanc(int balanc) {
		this.balanc = balanc;
	}
	public void deposit(int amount)
	{
		balanc=balanc+amount;
	}
	public void withdrawal(int amount)
	{
		if(amount> balanc)
		{
			System.out.println("Sorry,You are not having requested amount");
		}
		balanc=balanc-amount;
	}
	public void printdetails()
	{
		   System.out.println("Customer Information ");
		   System.out.println("-------------------------- ");
		   System.out.println("---------------------------- ");
		   System.out.println("Name :"+name);
		   System.out.println("Account_No :"+accounno);
		   System.out.println("Current Balance :"+balanc);
		   System.out.println("-------------------------- ");
		   System.out.println("---------------------------- ");
	}
	

    }

