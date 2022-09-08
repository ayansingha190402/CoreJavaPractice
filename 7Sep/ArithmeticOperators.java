/* Program : Understnading the Arithmetic Operators
@author: Ayan Singha
@Date : 7 Sep 2022
@Version: 1
*/


class ArithmeticOperators // start of class ArithmeticOperators
{
	public static void main(String[] args) //Calling the main method
	{
    
		// declare variables
		int number1 = 18, number2 = 3;

		int sum = number1 + number2; // addition operator
		System.out.println("The sum is  " + sum);

		int substract = number1 - number2 ;  // subtraction operator
		System.out.println("Result after subtraction is  " + substract);

		int multiply = number1 * number2; // multiplication operator
		System.out.println(" Multiplication of two number is " + multiply);

		int divison = number1 / number2; // division operator
		System.out.println("Result after divide Number 1 by Number 2  is " + divison);

		int remainder = number1 % number2 ; // modulo operator
		System.out.println("Remainder after divison is  " + remainder);
    }  // end of main method
	
}  // end of class ArithmeticOperators