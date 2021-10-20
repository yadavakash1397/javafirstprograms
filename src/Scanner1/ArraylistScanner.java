package Scanner1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistScanner 
{

	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		System.out.println("enter size of array");
		Scanner reader=new Scanner(System.in);
		int j=reader.nextInt();
		System.out.println("enter values of arraylist :");
		int a[]=new int[j];
		
		for(int i=0;i<j;i++)
		{
			//a[i]=reader.nextInt();
			obj.add(reader.next());
		}
		System.out.println(obj);
		
		/*
		for(int i:a)
		System.out.print(i+" ");
		*/

	}

}
