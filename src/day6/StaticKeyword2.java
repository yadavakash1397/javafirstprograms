package day6;

public class StaticKeyword2 
{
	//B.HOW NON STATIC MOTHOD CAN ACCESS STATIC AND NON STATIC METHODS AND VARIABLES
	static int a=2;  //static variable
	int b=4;         //non static variable
	
	static int add(int x,int y)  //static method
	{
		return(x+y);
	}
	
	int mul(int x,int y)          //non static method
	{
		
		return(x*y);
	}
	

	
	int sub(int x,int y)         //non static method
	{
		//1.non static method can access static and non static variable directly using this keyword if this keyword is not there it take local method value
		System.out.println("value of a is "+a); //here take static value
		System.out.println("value of b is "+b); //here take static value  
		
		
		//2.non static method can access static and non static method directly
		System.out.println("add is "+add(x,y)); //static method directly accessible
		System.out.println("mul is "+mul(x,y)); //non static method also directly accessible 
		return(x-y);                //here take local value

	}
	
	

	public static void main(String[] args) 
	{
		StaticKeyword2 sk2=new StaticKeyword2();
		sk2.b=10;
		a=50;
		System.out.println("sub is "+sk2.sub(5,4));
		sk2.b=10;

	}

}
