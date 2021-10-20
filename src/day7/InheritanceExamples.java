package day7;
//single inheritance and multilevel inheritance
class A               //parent class
{
	int a;
	void print()
	{
		System.out.println(a);
	}
}

class B extends A    //child class of A     contains all of A
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}

class C extends B   //child class of B       contains all of B as well as A
{
	int c;
	void display()
	{
		System.out.println(c);
	}
}

public class InheritanceExamples 
{
	public static void main(String[] args)
	{
		A tp=new A();//object tp created of class A
		tp.a=20;     //tp is of class A so can access value of A
		tp.print();
		
		
		//tp.b=10;   tp is of class A so can't access variables and methods of class B
		//tp.show();
		
		B tpp=new B();//object tpp created of class B
		tpp.b=30;     //tpp if of class B so access value of class B
		tpp.show();
		
		//MAIN single inheritance
		tpp.a=40;     //tpp is of class B but still can access class A bcoz Class B is child class of A
		tpp.print();
		
		//multilevel inheritance
		C td=new C();
		//td can access own class C variables and methods
		td.c=100;
		td.display();
		
		//td can also access parent class B variables and methods
		td.b=101;
		td.show();
		
		//td also also can access parent class A of parent class B
		td.a=1012;
		td.print();
		
		
	}

}
