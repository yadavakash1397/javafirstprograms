package day6;

public class ConstructorOverLoading 
{
	ConstructorOverLoading() //default constructor
	{
		
	}
	
	ConstructorOverLoading(int x, int y,int z)
	{
		System.out.println(x+y+z);
	}
	
	ConstructorOverLoading(int x, int y)
	{
		System.out.println(x+y);
	}
	
	ConstructorOverLoading(int x, float y)
	{
		System.out.println(x+y);
	}
	
	ConstructorOverLoading(double x, int y)
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) 
	{
	 	ConstructorOverLoading co=new ConstructorOverLoading(10,20);
	 	ConstructorOverLoading c1=new ConstructorOverLoading(10,20.0f);
	 	ConstructorOverLoading c2=new ConstructorOverLoading(10.0,20);
	 	ConstructorOverLoading c3=new ConstructorOverLoading(10,20,30);
	}

}
