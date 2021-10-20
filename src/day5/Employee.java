package day5;

public class Employee //this class having main method so it can't be shared
{
	int id;
	String name;
	String designation;
	double salary;
	int yrojn;
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(designation);
		System.out.println(salary);
		System.out.println(yrojn);
	}
	public static void main(String[]args)
	{
		Employee emp1=new Employee();//object created
		emp1.id=12;
		emp1.name="akash";
		emp1.designation="engineer";
		emp1.salary=50000;
		emp1.yrojn=2020;
		
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.id=14;
		emp2.name="ajinkya";
		emp2.designation="manager";
		emp2.salary=100000;
		emp2.yrojn=2021;
		
		emp2.display();
		
		
	}

}
