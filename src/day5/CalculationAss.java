package day5;

//WRITE A PROGRAM TO DEMONSTRATE CONSTRUCTOR
public class CalculationAss
{
	int a,b,c;
	
	CalculationAss(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}
	
	void sum()
	{
		System.out.println("sum is "+(a+b+c));
	}

	public static void main(String[] args)
	{
		CalculationAss ak1=new CalculationAss(10,30,50);
		ak1.sum();

	}

}
