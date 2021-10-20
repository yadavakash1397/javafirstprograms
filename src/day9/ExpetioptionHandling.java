package day9;

public class ExpetioptionHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//unchecked exception
		
		//ARITHMETIC EXCEPTION
		
		int b=50;
		try
		{
		b=50/0;
		}
		catch(ArithmeticException q)
		{
			System.out.println("ArithmeticException handled");
		}
		finally
		{
			System.out.println("finally");
		}
		
		
		//null pointer exception
		
		int i[]=null;
		try
		{
		System.out.println(i.length);
		}
		catch(NullPointerException s)
		{
			System.out.println("null pointer exception handled");
		}
		finally
		{
			System.out.println("finally");
		}
		
		
		//NumberFormatException
		String s="abc";
		try
		{
			int x=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException handled");
		}
		finally
		{
			System.out.println("finally");
		}


		System.out.println("hello");
		System.out.println("world");
		
		//checked exception
		
		//try using
		/*try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException d)
		{
			
		}*/
		
		//throws keyword using
		Thread.sleep(5000);
		System.out.println("hello");
		
		
		

	}

}
