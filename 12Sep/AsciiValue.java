/* Program : AsciiValue
@author: Ayan Singha
@Date : 12 Sep 2022
@Version: 1
*/

// declaring of class AsciiValue
class AsciiValue 
{
	// declaring method printAsciiValue 
	static void printAsciiValue (char cValue)
	{
		int asciival = cValue; // computing Ascii value 
		System.out.println("The ascii value of "+ cValue +" is :"+ asciival );// printing
	}
	// end of  method printAsciiValue 



	// declaring method CheckChar 
	static void CheckChar (char cValue)
	{
		int asciiVal = cValue; //implicit coversion for get ASCII value
		if ((asciiVal>=65) && (asciiVal<=90)) // checking whether it is a upper case or not
		{
			System.out.println("Its a capital letter");
			if ((cValue=='A') || (cValue=='E') || (cValue=='I') || (cValue=='O') || (cValue=='U')) // checking whether it is a vowel or not
			{
				System.out.println("It`s a vowel");
			}
			else // else it is consonent
			{
				System.out.println("It`s a consotent");
			}
		}
		else if ((asciiVal>=97) && (asciiVal<=122))// checking whether it is a lower case or not
		{
			System.out.println("Its a small letter");
			if ((cValue=='a') || (cValue=='e') || (cValue=='i') || (cValue=='o') || (cValue=='u'))// checking whether it is a vowel or not
			{
				System.out.println("It`s a vowel");
			}
			else   // else it is consonent
			{
				System.out.println("It`s a consotent");
			}
		}
		else if ((asciiVal>=48) && (asciiVal<=57))// checking whether it is a no or not
		{
			System.out.println("Its a number");
		}
		else// else it is other character
		{
			System.out.println("Its a special character");
		}
		
	}
	// end of  method checkChar
	
	
	// declaring main method
	public static void main(String args[])
	{
		char value = args[0].charAt(0); // taking a character input
		
		// calling method printAsciiValue 
		printAsciiValue(value) ;// passing value as a paramater
		
		// calling method CheckChar
		CheckChar(value) ;// passing value as a paramater
	}
	// end of  main method
}
//end of  class AsciiValue