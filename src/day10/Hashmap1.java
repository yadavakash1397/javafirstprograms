package day10;

import java.util.HashMap;
import java.util.Map;


public class Hashmap1 
{

	public static void main(String[] args) 
	{
	//declaration of hashmap	
	//	HashMap obj=new HashMap();
		HashMap <Integer,String> obj=new HashMap<Integer, String>();
		
		obj.put(101,"akash");
		obj.put(102,"yogesh");
		obj.put(103,"ranjit");
		obj.put(105,"rohit");
		System.out.println(obj);
		
	//remove element from hashmap
		obj.remove(105);
		System.out.println(obj);
		
	//read pair from hashmap
		for(Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	//get one value from key
		System.out.println(obj.get(102));
		
	//	System.out.println(obj.entrySet());
		
		
	}

}
