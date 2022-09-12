/* Program : GreaterAmongThree
@author: Ayan Singha
@Date : 9 Sep 2022
@Version: 1
*/


class GreaterAmongThree  // start of class GreaterAmongeThree
{
	
	public static void main(String[] args) //Calling the main method
	{
    
		
		//taking input Numbers in Integer form
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		int number3=Integer.parseInt(args[2]);
		
		if((number1 == number2) && (number1 == number3))  // checking wheteher all numbers are equal
		{
			System.out.println(" All numbers are equal");  //printing the result
		}
		
		else if((number1 >= number2) && (number1 >= number3))  // checking wheteher number1 is greater than other two
		{
			System.out.println(number1 + " is the largest number.");  //printing the result
		}
			else if ((number2 >= number1) && (number2 >= number3)) // again checking wheteher number2 is greater
			{
				System.out.println(number2 + " is the largest number.");  //printing the result
			}
			else // when the any one of above two condition is not satisfied, means number 3 is greater
			{
				System.out.println(number3 + " is the largest number.");  //printing the result
			}
		
    }  // end of main method
	
}  // end of class GreaterAmongThree