package day3;

public class WhileLoop 
{
//print no betn 0-10
	public static void main(String[] args) 
	{
		System.out.println("no betn 0-10");
		int i=0;
		while(i<=10)
		{
			System.out.println(i++);
		}
//print even no betn 0-10
		System.out.println("even no betn 0-10");
		int j=0;
		while(j<=10)
		{
			System.out.println(j);
			j+=2;     //j=j+2;
		}
//print odd no betn 0-10
		System.out.println("odd no betn 0-10");
		int k=1;
		while(k<=10)
		{
			System.out.println(k);
			k+=2;
		}
//print no betn 1-10 in descending order
		System.out.println("no from 10-0");
		int l=10;
		while(l>=0)
		{
			System.out.println(l--);
		}
		

	}

}
