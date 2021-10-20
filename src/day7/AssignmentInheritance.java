package day7;

class Teacher
{
	String designation="teacher";
	String collagename="svpm";
	void does()
	{
		System.out.println("teaching");
	}
}

class ComputerTeacher extends Teacher
{
	
}

public class AssignmentInheritance
{

	public static void main(String[] args) 
	{
		ComputerTeacher ct=new ComputerTeacher();
		System.out.println(ct.collagename);
		System.out.println(ct.designation);
		ct.does();

	}

}
