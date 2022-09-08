/* Program : Understnading the Assignment Operators
@author: Ayan Singha
@Date : 7 Sep 2022
@Version: 1
*/


class AssignmentOperators // start of class AssignmentOperators
{
	public static void main(String[] args) //Calling the main method
	{
    
		// declare variables
		int value= Integer.parseInt(args[0]);// taking input 
		int constant=Integer.parseInt(args[1]);// taking input 
		
		System.out.println("Value of varieable value is   " + value);    // printing the value after input
		System.out.println("Value of varieable constant is   " + constant);   // printing the value after input
		
		
		value = constant; // assign value using =
		System.out.println("Assign value using =  " + value);

		value += constant;  // assign value using +=
		System.out.println("Assign value using +=  " + value);

		value -= constant; // assign value using /=
		System.out.println(" Assign value using -=  " + value);

		value *= constant; // assign value using *=
		System.out.println("Assign value using *=  " + value);

		value /= constant; // assign value using /=
		System.out.println(" Assign value using /= " + value);
		
		value %= constant; // assign value using %=
		System.out.println(" Assign value using %= " + value);
    }  // end of main method
	
}  // end of class Ass\cOperators