package day6;

public class CalculationAss
{
	int sum(int x,int y)
	{
		return(x+y);
	}
	
	int sum(int x, int y,int z)
	{
		return(x+y+z);
	}
	
	double sum(double x,double y,double z)
	{
		return(x+y+z);
	}
	
	double sum(double x, double y)
	{
		return(x+y);
	}

	public static void main(String[] args)
	{
		CalculationAss cal=new CalculationAss();
		System.out.println("sum of 3 and 4 is "+cal.sum(3,4));
		System.out.println("sum of 3,4,5 is "+cal.sum(3, 4, 5));
		System.out.println("sum of 3.2 and 4.8 is "+cal.sum(3.2, 4.8));
		System.out.println("sum of 3.2, 4.2,5.7 is "+cal.sum(3.2, 4.3, 5.7f));
//higher values are ok means,that means we set double then entered value int and float ok
		                                  //if float then int only ok double not allowed
		                                  //if int then only int not float and double
	}

}
