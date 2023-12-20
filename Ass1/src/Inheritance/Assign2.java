package Inheritance;

class Employee
{
	String name;
	int Employee_id;
	double salary;
	
	public Employee(String name, int employee_id, double salary) {
	
		this.name = name;
		Employee_id = employee_id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}


	public int getEmployee_id() {
		return Employee_id;
	}


	public double getSalary() {
		return salary;
	}


	public double bonus()
	{
		return salary*0.05;
	}
	
	
}
class Manager extends Employee
{
	int teamsize;
	
	
	public Manager(String name, int employee_id, double salary,int teamsize) {
		super(name, employee_id, salary);
		this.teamsize=teamsize;
	}

     
	public int getTeamsize() {
		return teamsize;
	}




	public void reporting(){
		         System.out.println(getName()+"reporting time is 9.30" +"team size is"+getTeamsize());
	}
	public double bonus()
	{
		
		return salary*0.10;
	}
	
	
}

class Developer extends Employee
{
	
	String Programming_language;
	 public Developer(String name, int employee_id, double salary,String lang) {
		super(name, employee_id, salary);
		this.Programming_language=lang;
		
	}
	
	
	
	
     public String getProgramming_language() {
		return Programming_language;
	}








	public void Code(){
		  System.out.println(getName()+" programming language is"+getProgramming_language());
	}
	public double bonus()
	{
		
		return salary*0.8;
	}
}




public class Assign2 {
	
	
	public static void main(String[] args)
	{
		Manager m=new Manager("Tamil",01,50000,6);
		Developer d= new Developer("Bharathi",02,45000,"Java");
		m.reporting();
		d.Code();
		
		 System.out.println(m.getName() + " Bonus:" + m.bonus());
		 System.out.println(d.getName() + " Bonus:" + d.bonus());
	}

}
