package day4;

public class StringMethods 
{

	public static void main(String[] args) 
	{
		String s=" welcome ";
		String t=" to java ";
		
		//length()-calculate length of string
		System.out.println("length of string s is "+s.length());
		
		//concat()-COMBINE TWO STRINGS
		System.out.println("s+t="+s.concat(t));
		
		//trim()-remove left and right spaces
		System.out.println("after allignment"+s.trim());
		
		//charAt()- returns character at given index no( indexing start from 0)
		System.out.println("character at third place of string s is "+(s.charAt(2))); //space also taken as char
		
		//contains()- searches sequence of char in string
		System.out.println("come is present in string s is "+s.contains("come"));//in bracket string name also accepted
		
		//equals()- compare two strings, if equal returns true, if not equal returns false
		System.out.println("string s and welcome are equal, this is "+s.equals(" welcome "));//in bracket string name also accepted
		
		//equalsIgnoreCase- compare two string without watching capital letters or not, if equal reurns true otherwise false
		System.out.println("String s and WELCOME are equal, this is "+s.equalsIgnoreCase(" WELCOME "));
		
		//replace()-1) return string by replacing old char by new 2) as well as old string by new string
		System.out.println("by replacing e by a in string s new result is"+s.replace('e','a'));
		System.out.println("by replacing come by done in string s new result is"+s.replace("come", "done"));
		
		//substring()- returns string betn both indices substring(n,n+1)
		System.out.println("betn index 2 and 4 string is "+s.substring(2,5));
		
		//toLowercase()-returns string in lower case letters
		System.out.println("in small letters string s is "+s.toLowerCase());
		
		//toUppercase()-returns string in upper case letters
		System.out.println("in capital letters string s is "+s.toUpperCase());

	}

}
