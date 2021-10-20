package day8;

interface ABC
{
	int a=20;
	void add();
}

interface XYZ
{
	int b=30;
	void sub();
}
public class MultipleInheritance implements ABC,XYZ
{
	public void add()
	{
		System.out.println(a); //also can print b value
	}
	
	public void sub()
	{
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		MultipleInheritance i=new MultipleInheritance();
		i.add();
		i.sub();
	

	}

}
