package day4;

public class ArrayAssignment 
{
	public static void main(String[] args) 
	{//TRY ALL ASSIGNMENT WITH TWO AND MULTIDIMENSIONAL ARRAY
		//Assignment no 1
		//WRIE JAVA PROGRAM TO CALCULATE SUM OF VALUES OF ARRAY
		/*
		int k=0;
		int a[]= {10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			k=k+a[i];
		}
		System.out.println("sum of array is "+k);
		*/
		
		
		//Assignment no 2
		//WRITE A JAVA PROGRAM TO SEARCH A SPECIFIC NO IN ARRAY
		/*
		int a[]= {10,50,30,40,50};
		int k=60,c=0;
		for(int i=0;i<a.length;i++)
		{
			if(k==a[i])
			{
				System.out.println("value found at a["+i+"]");
				c++;
				
			}
	        
		}
		if(c==0)
		{
			System.out.println("value not found");
		}
		*/
		
		//ASSIGNMENT NO 3
		//WRITE A JAVA PROGRAM TO PRINT EVEN  AND ODD NO IN ARRAY
		/*
		int a[]= {11,12,13,14,15,16};
		System.out.println("Even numbers are");
		for(int i:a)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Odd numbers are");
		for(int j:a)
		{
			if(j%2!=0)
			{
				System.out.println(j);
			}
		}
		*/
		
		//ASSIGNMENT NO 4
		//WRITE A PROGRAM TO FIND GREATEST AND SMALLEST NO IN ARRAY
		/*
		int a[]={100,11,1,13,14,15,16};
		int k=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(k>a[i])
			{
				k=a[i];
			}
		}
		System.out.println("smallest no in array is "+k);
		int l=a[0];
		for(int j=1;j<a.length;j++)
		{
			if(l<a[j])
			{
				l=a[j];
			}
		}
		System.out.println("greatest no in array is "+l);
		*/
		
		//Assignment no 5
		//Write a program to add two matrices
	/*
		int a[][]= {{1,20,30},{40,70,90},{70,80,90}};
		int b[][]= {{10,20,30},{40,50,60},{70,80,10}};
		if((a.length==b.length)&&(a[0].length==b[0].length)&&(a[1].length==b[1].length)&&(a[2].length==b[2].length))
		{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.println("c["+i+"]["+j+"]="+(a[i][j]+b[i][j]));
			}
		}
		}
		else
		{
			System.out.println("matrices not having same no of row and columns");
		}
		*/
		
		//Assignment no 6
		//DEFINE ARRAY WITH SOME STRING VALUES, WRITE A PROGRAM TO SEARCH SPECIFIC STRING IN ARRAY
	
		String a[]= {"akash","ajinkya","sourabh","yogesh","rohan","rohan"};
		int c=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i].equals("rohan"))
			{
		        System.out.println("string is present in array is at index "+i);
		        c++;
			}
			
		}
		if(c==0)
		{
			System.out.println("String not present");
		}
	
		
		
		
		
		
		
		
		
		
		
	}

}
