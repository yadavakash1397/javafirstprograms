package day8;

interface A
{
	int a=20;               //variables in interface are STATIC & FINAL
	void add(int a, int b); //methods in interface are abstract methods & and bydefault they are public
	
}

class B implements A
{
	public void add(int a, int b)    //public should written
	{
		System.out.println(a+b);
	}
}

public class InterfaceStart 
{
	public static void main(String[] args) 
	{
		B obj=new B();
		obj.add(4,5);
		
		//A obj2=new A();    ERROR BCOZ CAN'T INSTATIATE INTERFACE A
		A obj2=new B();    //we can instantiate using class name
		obj2.add(4,5);
		

	}

}
