package day7;

/*final*/ class finalk  //3.if class is final then ////can't extend
{   //2.for method
	/*final*/ void add()
	{}
}
class finall extends finalk
{
	void add()    //compile time error bcoz it is final ////can't override
	{}
}




public class FinalKeyword //nothing but constant
{
	//1.for variable
	final int a=20;      //should be initialized
	int b=20;
	
	
	

	public static void main(String[] args) 
	{
		FinalKeyword fk=new FinalKeyword();
		//fk.a=80; //compile time error bcoz final
		fk.b=30;   //ohk
		

	}

}
