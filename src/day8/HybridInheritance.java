package day8;

class A1
{
	void display()
	{
		System.out.println("this is parent class A1");
	}
}

interface B1
{
	int a=20;
	void add();
}

interface B2
{
	void sub();
}

public class HybridInheritance extends A1 implements B1,B2
{
	public void add()
	{
		System.out.println(a);
	}
	public void sub()
	{
		System.out.println(2*a);
	}
	
	public static void main(String[] args) 
	{
		HybridInheritance obj=new HybridInheritance();
		obj.display();
		obj.add();
		obj.sub();
	}

}
