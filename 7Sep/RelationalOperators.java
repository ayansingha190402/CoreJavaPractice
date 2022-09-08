/* Program : Understnading the Relational Operators
@author: Ayan Singha
@Date : 7 Sep 2022
@Version: 1
*/

class RelationalOperators {    //start of class RelationalOperators
  public static void main(String[] args) {  // start of main method 
    
    // declare variables
	int number1= Integer.parseInt(args[0]);// taking input 
	int number2=Integer.parseInt(args[1]);// taking input

    
	System.out.println("Value of Number1 is   " + number1);    // printing the value after assign
	System.out.println("Value of Number2 is   " + number2);   // printing the value after assign
	
    System.out.println("Vuse of == operator  " ); // use of == operator
	System.out.println(number1 == number2);  // it will check the coendition and print it`s the boolean value

    System.out.println("Vuse of != operator  " ); // use of != operator
    System.out.println(number1 != number2);  // it will check the coendition and print it`s the boolean value

    System.out.println("Vuse of > operator  " ); // use of > operator
    System.out.println(number1 > number2);   // it will check the coendition and print it`s the boolean value

    System.out.println("Vuse of < operator  " ); // use of < operator
    System.out.println(number1 < number2);   // it will check the coendition and print it`s the boolean value

    System.out.println("Vuse of >= operator  " ); // use of >= operator
    System.out.println(number1 >= number2);  // it will check the coendition and print it`s the boolean value

    System.out.println("Vuse of <= operator  " ); // use of <= operator
    System.out.println(number1 <= number2);  // it will check the coendition and print it`s the boolean value
  } 	//end o main method
}	// end of class RelationalOperators