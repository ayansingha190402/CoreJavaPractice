/* Program : PalindromeNumber
@author: Ayan Singha
@Date : 13 Sep 2022
@Version: 1
*/


class PalindromeNumber // start of class PalindromeNumber
{
	// declaring the method checkPalindrome
	static void checkPalindrome(int number)
	{
		// declaring integer varieables
		int temp=number;
		int remainder=0;
		int reverseNumber=0;
		
		/*starting of while loop for claculating
		the reverse of input no*/
		while (number>0)
		{
			remainder=(number%10);
			reverseNumber=(reverseNumber*10)+remainder;
			number=number/10;
		}
		
		//check whthet input no is equal to its reverse no or not 
		if(temp==reverseNumber)
		{
			System.out.println(temp+ " -> this is a Palindrome Number");
		}   
		else
		{
			System.out.println(temp+ " -> this is not a Palindrome Number");
		}   
	}
	// end of method checkPalindrome
	
	

	// declaring the main method 
	public static void main(String... args) //Calling the main method
	{
		
		// taking input in integer form
		int number=Integer.parseInt(args[0]);
		
		//calling the function PalindromeNumber using number as parameter
		checkPalindrome(number);
		
		
		
    }  // end of main method
	
}  // end of class PalindromeNumber

