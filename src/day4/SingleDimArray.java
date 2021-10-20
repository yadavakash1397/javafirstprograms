package day4;

public class SingleDimArray
{

	public static void main(String[] args) 
	{
		//declaration of array with specifying size
		/*int a[]=new int[5]; //int []a=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		*/
		
		//declration of array without specifying size
		int a[]= {1,2,3,4,5,6};
		
		//length of array
		System.out.println("length of array is "+a.length);
		
		//read values from array by using for loop
		/*for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		*/
		
		//read values of array using advanced for loop
		System.out.println("the values in array are");
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
