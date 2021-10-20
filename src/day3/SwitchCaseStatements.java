package day3;

import java.util.Scanner;

public class SwitchCaseStatements 
{

	public static void main(String[] args)
	{
		/*
	 int day=1;
	
	 switch(day)
	 {
	 case 1:System.out.println("sunday");
	 break;
	 case 2:System.out.println("monday");
	 break;
	 case 3:System.out.println("tuesday");
	 break;
	 case 4:System.out.println("wednesday");
	 break;
	 case 5:System.out.println("thursday");
	 break;
	 case 6:System.out.println("friday");
	 break;
	 case 7:System.out.println("saturday");
	 break;
	 default:System.out.println("invalid no");
	 
	*/
		Scanner reader =new Scanner(System.in);
		System.out.println("enter character");
		char day=(char)reader.next().toLowerCase().charAt(0);
		
		 switch(day)
		 {
		 	case 'a':System.out.println("sunday");
		 	break;
		 	case 'b':System.out.println("monday");
		 	break;
		 	case 'c':System.out.println("tuesday");
		 	break;
		 	case 'd':System.out.println("wednesday");
		 	break;
		 	case 'e':System.out.println("thursday");
		 	break;
		 	case 'f':System.out.println("friday");
		 	break;
		 	case 'g':System.out.println("saturday");
		 	break;
		 	default:System.out.println("invalid char you entered"); 
		 }
		

	}

}
