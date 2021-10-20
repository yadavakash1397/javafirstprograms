package day4;

public class TwoDimArray 
{

	public static void main(String[] args) 
	{
		//insert values into array if size is know
		int a[][]=new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=5;
		
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=6;
		
		//insert values into array if size is dont know
		//int a[][]= {{1,2},{3,4}}// {} for one row
		
		System.out.println("no of rows are "+a.length);
		System.out.println("no of columns are "+a[0].length);
		
		// read values from array using for loop
		
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		*/
		//read values from array using advanced or enhanced for loop
		
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.println(i);
			}
		}
		

	}

}
