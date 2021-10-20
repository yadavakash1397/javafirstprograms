package day8;

interface AZ
{
	int a=20;
	int b=30;
	int sum();
}

public class Assignment implements AZ
{
	public int sum()
	{
		return(a+b);
	}

	public static void main(String[] args) 
	{
		Assignment abs=new Assignment();
		System.out.println(abs.sum());

	}

}
