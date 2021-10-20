package day6;

public class ThisKeyword 
{
	int a,b;              //class variables or instance variables
	
	ThisKeyword()
	{
		a=30;
		b=40;
	}
	void getvalues(int a,int b) //method variables
	{
		this.a=a;       //this is showing class variables
		this.b=b;	    //if this keyword is not used then a & b are treated as method variables, so values are assigned to itself not to class variables
	}
	
	void printvalues()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		ThisKeyword tk=new ThisKeyword();
		
		tk.getvalues(10, 20);
		tk.printvalues();
		

	}

}
