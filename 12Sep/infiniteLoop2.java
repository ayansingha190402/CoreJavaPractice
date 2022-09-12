/* Program : infiniteLoop2
@author: Ayan Singha
@Date : 12 Sep 2022
@Version: 1
*/


class infiniteLoop2 // start of class infiniteLoop1
{
	// declaring the method infiniteLoop1
	public static void infiniteLoop1()
	{
		System.out.println("Printing infinite loop: \n");
		for( ; ; ) // starting of infinite for loop
		{
			System.out.println("Hello: Myself Ayan");
		}
		// to stop infinite loop press cntrl+c
	}
	// end of method infiniteLoop1
	
	
	// declaring the main method 
	public static void main(String[] args) //Calling the main method
	{
		
		infiniteLoop1();
		
    }  // end of main method
	
}  // end of class infiniteLoop2

