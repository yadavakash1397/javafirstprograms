package day6;

public class MethodOverLoading
{
	void add(int x, int y)
	{
		System.out.println(x+y);
	}
	
	void add(int x, float y)
	{
		System.out.println(x+y);
	}
	
	void add(double x, float y)
	{
		System.out.println(x+y);
	}
	
	void add(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}

	public static void main(String[] args) 
	{
		MethodOverLoading mo=new MethodOverLoading();
		mo.add(2, 4);
		mo.add(2, 4.0f);
		mo.add(2.0, 4.0f);
		mo.add(2, 4, 6);
	}

}
