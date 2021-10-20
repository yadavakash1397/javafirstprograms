package day3;

public class JumpingStatements 
{

	public static void main(String[] args) 
	{
		//use of break is to exit loop
		System.out.println("-------------BREAK---------------");
		for(int i=0;i<=10;i++)
		{
			if(i==5) //break and exit body, only print upto 4
			{
				break;
			}
			System.out.println(i);
		}
		//use of continue to skip next line
		System.out.println("------------continue--------------");
		for(int j=0;j<=10;j++)
		{
			if(j==5) //skip 5 no, print 1 2 3 4 6 7 8 9 10
			{
				continue;
			}
			System.out.println(j);
		}
	}
}
