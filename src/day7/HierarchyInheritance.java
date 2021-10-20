package day7;
//we can't give same name for multiple classes in same package

class Parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}

class Child2 extends Parent
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}

public class HierarchyInheritance
{
	public static void main(String[] args) 
	{
		Child1 ab=new Child1();
		ab.a=10;
		ab.b=20;
		ab.display();
		ab.show();
		
		Child2 ac=new Child2();
		ac.a=40;
		ac.c=50;
		ac.display();
		ac.print();

	}

}
