/* Program : Usage of Trenary Operator ?:
@author: Ayan Singha
@Date : 13 Sep 2022
@Version: 1
*/


class TrenaryOperatorDemo // start of class TrenaryOperatorDemo
{
	// declaring the method iElseEvenOdd
	static void iElseEvenOdd(int number)
	{
		if(number%21==0)// checking whether it is even
			System.out.println("The no is even no /n");
		else // else it is odd
			System.out.println("The no is Odd no/n");
	}
	// end of method iElseEvenOdd
	
	// declaring the method trenaryEvenOdd
	static void trenaryEvenOdd(int number)
	{
		// using of trenary Operator to check a no even or odd
		String result=(number%2==0)?"even no":"Odd no";
		System.out.println(result);
	}
	// end of method trenaryEvenOdd
	
	// declaring the main method 
	public static void main(String... args) //Calling the main method
	{
		
		// taking input in integer form
		int number=Integer.parseInt(args[0]);
		
		//calling the function iElseEvenOdd using number as parameter
		iElseEvenOdd(number);
		
		//calling the function trenaryEvenOdd using number as parameter
		trenaryEvenOdd(number);
		
    }  // end of main method
	
}  // end of class TrenaryOperatorDemo

