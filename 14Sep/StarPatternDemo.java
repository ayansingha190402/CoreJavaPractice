/* Program : StarPatternDemo1

printing this pattern : 
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
When input is 5
@author: Ayan Singha
@Date : 14 Sep 2022
@Version: 1
*/


class StarPatternDemo // start of class StarPatternDemo1
{
	
	
	// declaring the method starPattern
	public static void starPattern1(int noOfRows)
	{
		
		System.out.println("\n\n****  Star pattern  ****");
		for(int i=1;i<=noOfRows;i++) // starting of for loop
		{
			System.out.println(); // printing new line
			for(int j=1;j<=i;j++) // starting of nested for loop
			{
				System.out.print("* ");
			}
			
		}
		for(int i=noOfRows-1;i>=1;i--) // starting of for loop
		{
			System.out.println();// printing new line
			for(int j=i;j>=1;j--) // starting of nested for loop
			{
				System.out.print("* ");
			}
			
		}
	}
	// end of method starPattern
	

	
	// declaring the main method 
	public static void main(String... args) //Calling the main method
	{
		// taking input in integer form
		int noOfRows =Integer.parseInt(args[0]);
		
		//calling the function starPattern using noOfRows as parameter
		starPattern1(noOfRows);
		
		
    }  // end of main method
	
}  // end of class factorialDemo

