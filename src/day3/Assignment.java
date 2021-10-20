package day3;

public class Assignment 
{

	public static void main(String[] args)
	{
		//no 1
		System.out.println("1) Find no is +ve or -ve");
		int a=-0;
		if (a>0)
			System.out.println("No is +ve");
		else if(a==0)
			System.out.println("No is neither +ve nor -ve");
		else
			System.out.println("No is -ve");
		
		//no 2
		System.out.println("");
		System.out.println("2) find greatest no betn 3 nos");
		int b,c,d;
		b=80;
		c=100;
		d=90;
		if(b>c)
		{
			if(b>d)
			{
				System.out.println("greatest no is "+b);
			}
			else
			{
				System.out.println("greatest no is "+d);
			}
		}
		else
		{
			if(c>d)
			{
				System.out.println("greatest no is "+c);
			}
			else
			{
				System.out.println("greatest no is "+d);
			}
		}
		
		//no 3
		{
			System.out.println("");
			System.out.println("3) multiplication table of 5");
			int x=5;
			for(int y=1;y<=10;y++)
			{
				System.out.println(x+"*"+y+"="+(x*y));
			}
			
		}
		
		//no 4
		{
			System.out.println("");
			System.out.println("4) count no of digit of no");
			//BY USING DO WHILE LOOP
			
			int i=0;
			int j=10;
			do
			{
				if(j==0)
					break;
				j=j/10;
				i++;
			}while(j!=0);
				System.out.println("no of digits are "+i);
			
			
			//BY USING WHILE LOOP
			/*
			int i=0;
			int j=100;
			while(j!=0)
			{
				j=j/10;
				i++;
				
			}
			System.out.println("no of digits are "+i);
			*/
		}

	}

}
