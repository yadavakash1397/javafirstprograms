package day4;

public class StringAssignments
{

	public static void main(String[] args) 
	{
		String s="AkaSh";
		String r="akash";
		
		//Assignment no 1
		System.out.println("both string s and r are equal excluding case sensitivity is "+s.equalsIgnoreCase(r));
		
		//Assignment no 2
		System.out.println("s+r "+s.concat(r));
		
		//Assignment no 3
		System.out.println("length of string s is "+s.length());
		
		//Assignment no 4
		System.out.println("string s from index 1 to 3 is "+s.substring(1,4));//n and n+1
		
		//Assignment no 5
		System.out.println("string s in lower case is "+s.toLowerCase());
		
		//Assignment no 6
		System.out.println("string s in upper case is "+s.toUpperCase());

	}

}
