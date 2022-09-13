/* Program : Break & Continue
@author: Ayan Singha
@Date : 13 Sep 2022
@Version: 1
*/


class BraeakContinueDemo // start of class FactorialDemo
{
	
	// declaring the method BraeakContinueDemo
	public static void breakStatement(int number)
	{

		System.out.println("Using break Statement");
		System.out.println("Input is  ->"+number);
		System.out.println("Type 1");
		for(int value=number;value>=0;value--) // starting of for loop
		{
			System.out.println(value);
			if(value<5)
			{
				break; // using of break to exit loop
			}
		}
		
		System.out.println("\n\nType 2");
		for(int value=number;value>=0;value--) // starting of for loop
		{
			
			if(value<5)
			{
				break;// using of break to exit loop
			}
			System.out.println(value);
		}
	}
	// end of method breakStatement
	
	// declaring the method continueStatement
	public static void continueStatement(int number)
	{

		System.out.println("Using contunue Statement");
		System.out.println("Input is  ->"+number);
		System.out.println("Type 1");
		for(int value=number;value>=0;value--) // starting of for loop
		{
			System.out.println(value);
			if(value<5)
			{
				continue;// using of continue to pass this particular case
			}
		}
		
		System.out.println("\n\nType 2");
		for(int value1=number;value1>=0;value1--) // starting of for loop
		{
			
			if(value1<5)
			{
				continue;// using of continue to pass this particular case
			}
			System.out.println(value1);
		}
	}
	// end of method breakStatement
	
	
	// declaring the main method 
	public static void main(String[] args) //Calling the main method
	{
		// taking input in integer form
		int number =Integer.parseInt(args[0]);
		
		//calling the function breakStatement using number as parameter
		breakStatement(number);
		
		System.out.println("\n\n");
		//calling the function continueStatement using number as parameter
		continueStatement(number);
		
		
    }  // end of main method
	
}  // end of class factorialDemo

