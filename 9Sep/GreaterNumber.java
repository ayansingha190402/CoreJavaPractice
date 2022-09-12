/* Program : GreaterNumber
@author: Ayan Singha
@Date : 9 Sep 2022
@Version: 1
*/


class GreaterNumber  // start of class GreaterNumber
{
	
	public static void main(String[] args) //Calling the main method
	{
    
		
		//taking input Numbers in Integer form
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		
		if(number1 == number2)  //checking wheteher two no is equal 
		{
			System.out.println(number1+ "  is equal to  " + number2);  //printing the result
		}
		else if (number1>number2) // again checking wheteher number1 is greater
		{
			System.out.println(number1+ "  is greater  than  " + number2);  //printing the result
		}
		else // when the any one of above two condition is not satisfied
		{
			System.out.println(number1+ "  is less than  " + number2);  //printing the result
		}
		
    }  // end of main method
	
}  // end of class GreaterNumber