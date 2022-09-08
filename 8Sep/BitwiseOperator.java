/* Program : Bitwise Operator
@author: Ayan Singha
@Date : 8 Sep 2022
@Version: 1
*/


class BitwiseOperator  // start of class BitwiseOperator
{
	
	public static void main(String[] args) //Calling the main method
	{
    
		// declaring integer valaue
		int number1= 2, number2=3;
		
		//printing the boolean values
		System.out.println("The value of number1 is:"+number1);
		System.out.println("The value of number2 is:"+number2);
		
		// using the bitwise operators
		System.out.println("Bitwise OR :" + (number1|number2)); // logical OR
		System.out.println("Bitwise AND: " + (number1&number2)); // logical AND
		System.out.println("Bitwise XOR :" + (number1^number2)); // logical bitwise XOR
		System.out.println("NOT number1:" + (~number1)); // bitwise NOT
		System.out.println("NOT number2:" + (~number2)); // bitwise NOT
		
		
    }  // end of main method
	
}  // end of class BitwiseOperator