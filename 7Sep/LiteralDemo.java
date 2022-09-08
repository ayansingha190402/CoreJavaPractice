/* Program : Understanding the Literal
@author: Ayan Singha
@Date : 7 Sep 2022
@Version: 1
*/

//start of class A
class A
{
	//start of main
	public static void main(String args[])
	{
		int number1= Integer.parseInt(args[0]);
		double number2= Double.parseDouble(args[1]);
		System.out.println(" Number is "+ number1);
		System.out.println(" Number is "+ number2);
		
	}
	
	//end of main
	
	//start of main to check whether it is executing or not
	public static void main()
	{
		System.out.println(" Just for  checking ");
	}
	
	//end of main - This main function is not executing
	
	
}
// end of class A


//statrt of class LiteralDemo
class LiteralDemo
{
	//start of main
	public static void main(String args[])
	{
		int number1= 9_99_0;
		System.out.println(" Number is "+ number1);
		double number2= 9_99_0.51_3;
		System.out.println(" Number is "+ number2);
		
	}
	
	//end of main
	
	
}
// end of class LiteralDemo