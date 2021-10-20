package day8;

interface AA
{
	int aa=20;
	int bb=40;
	void add();
}

interface BB
{
	int xx=20;
	int yy=40;
	void mul();
}
public class Assignment2 implements AA,BB
{
	public void add()
	{
		System.out.println(aa+bb);
	}
	
	public void mul()
	{
		System.out.println(xx*yy);
	}

	public static void main(String[] args) 
	{
		Assignment2 asd=new Assignment2();
		asd.add();
		asd.mul();

	}

}
