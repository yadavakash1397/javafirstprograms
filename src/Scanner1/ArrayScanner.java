package Scanner1;

import java.util.Scanner;

public class ArrayScanner 
{

	public static void main(String[] args) 
	{
		int a[]=new int [5];
		
		Scanner reader=new Scanner(System.in);
		System.out.println("enter array values:");
		for(int i=0; i<5;i++)
		{
			a[i]=reader.nextInt();
		}
		System.out.println("array values are ");
		
		for(int i:a)
		System.out.println(i);
		

	}

}
