/* Program : Shift Operator
@author: Ayan Singha
@Date : 8 Sep 2022
@Version: 1
*/


class ShiftOperator  // start of class ShiftOperator
{
	
	public static void main(String[] args) //Calling the main method
	{
    
		// taking input 
		int number1= Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		
		//printing the value after input
		System.out.println("The value of number1 is:"+number1);
		System.out.println("The value of number2 is:"+number2);
		
		// using the shift operators
		System.out.println("Left Shift:" + (number1<<number2)); // Left Shift
		System.out.println("Right Shift: " + (number1>>number2)); // Right Shift
		System.out.println("Unsigned Right Shift:" + (number1>>>number2)); // Unsigned Right Shift
		
		
    }  // end of main method
	
}  // end of class 
