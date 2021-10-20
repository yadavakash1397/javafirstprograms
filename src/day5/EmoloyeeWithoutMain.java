package day5;

public class EmoloyeeWithoutMain //this class can be shared bcoz it does not contain main method
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
	//for assign values in variables through method
	void getvalues(int eid,String ename,String des,double sal,int yoj)
	{
		id=eid;
		name=ename;
		designation=des;
		salary=sal;
		yrojn=yoj;
	}
	//for assign values through constructor 
	EmoloyeeWithoutMain(int eid,String ename,String des,double sal,int yoj)
	{
		id=eid;
		name=ename;
		designation=des;
		salary=sal;
		yrojn=yoj;
	}

}
