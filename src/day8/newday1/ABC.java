package day8.newday1;

//PRIVATE IS ONLY ACCESSIBLE WITHIN CLASS
class AB
{
	private int a=10;
	private void add() {}
}

public class ABC 
{
	

	public static void main(String[] args) 
	{
		AB dd=new AB();
		//dd.a=10; //error bcoz private
		
		/* THIS FOR DEFAULT CHECK FIRST DEFAULT KEYWORD CLASS
		DefaultKeyword ds=new DefaultKeyword();
		System.out.println(ds.a);
		ds.add();
		*/
	
	}

}
//access modifiers
//private--it is only for class
//default--it is only for package
//protected--it is within package and outside package using inheritance
//public--anywhere in project