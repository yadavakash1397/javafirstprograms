package day5;


public class StudentAss 
{
	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	
	void getStuData(int sid, String sNAME)
	{
		SID=sid;
		Sname=sNAME;
	}
	
	void getStuMarks(int a,int b,int c)
	{
		Sub1=a;
		Sub2=b;
		Sub3=c;
	}
	
	void totalMarks()
	{
		int Total=Sub1+Sub2+Sub3;
		System.out.println("Student id:"+SID+"  Student name:"+Sname+"  Total marks:"+Total);
	}

	public static void main(String[] args)
	{
		StudentAss stu1=new StudentAss();
		stu1.getStuData(10,"akash");
		stu1.getStuMarks(80,90,80);
		stu1.totalMarks();
		
		StudentAss stu2=new StudentAss();
		stu2.getStuData(11,"ranjit");
		stu2.getStuMarks(50,60,70);
		stu2.totalMarks();

	}

}
