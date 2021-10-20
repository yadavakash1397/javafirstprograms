package day7;
//method overriding
class x  
{
	int a=890;
	void cal(int x, int y)                 //bank
	{
		System.out.println("sum "+(x+y));
	}
}

class y extends x 
{
	int a=90;
	void cal(int x, int y)//same defn      //axis bank
	{
		System.out.println("sub "+(x-y));
		//super.cal(x, y);, this will refer immediate parent class method  SUPER KEYWORD
		System.out.println(a);
		System.out.println(super.a);                    // this is for variable 
		                                                 //and also useful for CONSTRUCTOR
	}
}

class z extends x  
{
	int c;
	void cal(int x, int y)//same defn       //kotak bank
	{
		System.out.println("mul"+(x*y));
	}
}

public class MethodOverriding //this is achieved only by inheritance
{
	public static void main(String[] args) 
	{
		x ak=new x();
		ak.cal(2, 4);
		y yd=new y();
		yd.cal(3, 6);
		z rd=new z();
		rd.cal(4, 8);

	}

}
