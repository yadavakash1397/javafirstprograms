package day2;

public class operators {

	public static void main(String[] args) 
	{
		int a,b;
		a=20;
		b=30;
		
		//arithmetic operators +-*/%
		System.out.println("addition is "+(a+b));
		System.out.println("subtraction is "+(b-a));
		System.out.println("multiplication is "+(a*b));
		System.out.println("division is "+(b/a));
		System.out.println("remainder is "+(b%a));
		
        //relational operators(comparision operators)
		//it returns always boolean value
		System.out.println("a>b is "+(a>b));
		System.out.println("a<b is "+(a<b));
		System.out.println("a=b is "+(a==b));
		System.out.println("a>=b is "+(a>=b));
		System.out.println("a<=b is "+(a<=b));
		System.out.println("a!=b is "+(a!=b));
		
		//logical operators
		//it require two boolean values
		boolean x=true;
		boolean y=false;
		System.out.println("x&&y is "+(x&&y));
		System.out.println("x||y is "+(x||y));
		System.out.println("!x is "+(!x));
		System.out.println("!y is "+(!y));
		
		//increment and decrement operators
		a++;                      //a=20, it increments a after this line
		System.out.println(a);    //a=21
		System.out.println(a++);  //a=21, increments a after this line
		System.out.println(a);    //a=22
		/*same will be happen in decrement*/
	}

}
