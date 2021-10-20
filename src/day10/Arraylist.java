package day10;

import java.util.ArrayList;

public class Arraylist  
{

	public static void main(String[] args) 
	{
	//declare arraylist
		ArrayList list=new ArrayList();
		
	//adding arraylist elemnts
		
		list.add("akash");
		list.add("123");
		list.add('a');
		list.add("yadav");
		
	//find size of arraylist
		System.out.println(list.size());
		System.out.println(list);
		
	//remove element from arraylist
		list.remove(2);
		System.out.println(list.size());
		System.out.println(list);
		
	//nwe element insert in arraylist
		list.add(1, "ranjit");
		System.out.println(list.size());
		System.out.println(list);
		
	//read values from arraylist using enhanced forloop
		for(Object c:list)
		{
			System.out.println(c);
		}
		System.out.println(list.get(1));
		
	

	}

}
