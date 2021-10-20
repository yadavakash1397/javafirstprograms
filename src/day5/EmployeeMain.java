package day5;

public class EmployeeMain //this class can't shared bcoz having main method BUT WE CAN USE OTHER CLASSES HERE TO MAKE OBJECTS
{

	public static void main(String[] args) 
	{
		//3 assigning values through constructor
		EmoloyeeWithoutMain emp1=new EmoloyeeWithoutMain(112,"aksha","engu",50.00,1997);
		
		//EmoloyeeWithoutMain emp1=new EmoloyeeWithoutMain();//object created
		//1 assigning values through object reference variable
		
		/*
		emp1.id=12;
		emp1.name="akash";
		emp1.designation="engineer";
		emp1.salary=50000;
		emp1.yrojn=2020;
		
		emp1.display();
		
		EmoloyeeWithoutMain emp2=new EmoloyeeWithoutMain();
		emp2.id=14;
		emp2.name="ajinkya";
		emp2.designation="manager";
		emp2.salary=100000;
		emp2.yrojn=2021;
		
		emp2.display();
		*/
		
		//2 assigning values through method
		/*
		emp1.getvalues(19,"akasha","QA engineer",50000,2050);
		*/
		emp1.display();
		
		
	}

}
