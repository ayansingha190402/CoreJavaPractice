/* Program : FactorialDemo
@author: Ayan Singha
@Date : 13 Sep 2022
@Version: 1
*/


class FactorialDemo // start of class FactorialDemo
{
	
	// declaring the method computeFactorial
	public static void computeFactorial(int number)
	{
		long result= 1; // intiatialising varieable
		System.out.println("\n\nDemo 1 for compute factorial");
		for(int value=1;value<=number;value++) // starting of for loop
		{
			result=value*result;
			System.out.println("Iteraion "+value+": Relult=  "+result);
		}
	}
	// end of method computeFactorial
	
	// declaring the method computeFactorial2
	public static void computeFactorial2(int number)
	{
		long result= 1; // intiatialising varieable
		System.out.println("\n\nDemo 2 for compute factorial");
		for(int value=number;value>=1;value--) // starting of for loop
		{
			result=value*result;
			System.out.println("Iteraion "+value+": Relult=  "+result);
		}

	}
	// end of method computeFactorial2
	
	
	
	// declaring the main method 
	public static void main(String[] args) //Calling the main method
	{
		// taking input in integer form
		int number =Integer.parseInt(args[0]);
		
		//calling the function computeFactorial1 using number as parameter
		computeFactorial(number);
		
		//calling the function computeFactorial2using number as parameter
		computeFactorial2(number);
		
    }  // end of main method
	
}  // end of class factorialDemo

