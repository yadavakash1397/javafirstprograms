package Scanner1;

import java.util.Scanner;

public class scanner1 
{
	//REDING VALUES FROM USER
	public static void main(String[] args) 
	{
		
		Scanner reader=new Scanner(System.in);
		System.out.println("enter");
		//int x=reader.nextInt();           //  for integer values
		
		String x=reader.next();           // for string values
		System.out.println("entered number is:"+x);

	}

}
