package Scanner1;

import java.util.Scanner;

public class Add 
{

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter two nos ");
		int a=reader.nextInt();
		int b=reader.nextInt();
		System.out.println("addition of "+a+" & "+b+" is "+(a+b));
	}

}
