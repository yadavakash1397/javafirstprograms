package day6;

public class StaticKeyword 
{
	static int a=5;
	int b=2;
	static int add(int a, int b) // static method    if here int a replaced by another variable suppose x
	{
		StaticKeyword skt=new StaticKeyword();
		System.out.println(skt.sub(8, 1));
		System.out.println(mul(2,9));
		return(a+b);                                // then here a will take static a value=5 
	}
	
	static int mul(int a, int b) // static method
	{
		return(a*b);
	}

	
	int sub(int a, int b) //non static method
	{
		return(a-b);
	}

//A. HOW STATIC METHOD CAN ACCESS STATIC AND NON STATIC METHODS AND VARIABLES	
	
//1.main is static method so it can access static variables and methods directly
//2.if you want to access not static variables and methods, we want to create object, through object we can access it.
	
	public static void main(String[] args) //main is static method
	{
		int c;
		System.out.println(a);//1 static variable so directly accessible, if main method is present in other class then also accessible directly using class name classname.static variable or method
		c=add(4,5);//1 static method so directly accessible
		System.out.println(c);
		
		//System.out.println(b); 2.this is incorrect bcoz b is non static so can't access directly without object
		//d=sub(4,2);            2.this is also incorrect bcoz sub is non static method so can't access directly without object
		
		
		StaticKeyword sk=new StaticKeyword();
		System.out.println(sk.b);//2.here we can access bcoz object is created
		System.out.println(sk.sub(4, 2));//2.here non static method accessible bcoc object is created
	}

}
