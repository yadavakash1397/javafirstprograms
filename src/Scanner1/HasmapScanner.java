package Scanner1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HasmapScanner 
{

	public static void main(String[] args) 
	{
	Scanner reader=new Scanner(System.in);
	HashMap <Integer,String>  Hm=new HashMap <Integer,String> ();
	System.out.println("enter hashmap values ");
		for(int i=0;i<5;i++)
		{
			Hm.put(reader.nextInt(), reader.next());	
		}
		
		for(Map.Entry as:Hm.entrySet())
		{
			System.out.println(as.getKey()+" "+as.getValue());//
		}

	}

}
