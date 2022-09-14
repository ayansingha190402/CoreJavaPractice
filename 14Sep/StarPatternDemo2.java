/* Program : StarPatternDemo2

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


class StarPatternDemo2 // start of class StarPatternDemo2
{
	
	
	// declaring the method starPattern
	public static void starPattern1(int noOfRows)
	{
		//declaring integer varieables
		int temp=noOfRows;
		int temp1=noOfRows-1;
		int temp2=1;
		
		System.out.println("\n\n****  Star pattern  ****");
		for(int i=1;i<=noOfRows;i++) // starting of for loop
		{
			System.out.println();// printing new line
			for(int j=temp-1;j>=1;j--) // starting of nested for loop
			{
				System.out.print("  ");
			}
			temp--;
			for(int k=1;k<=i;k++) // starting of nested for loop
			{
				System.out.print("* ");
			}
			
		}
		for(int i=noOfRows-1;i>=1;i--) // starting of for loop
		{
			System.out.println();// printing new line
			for(int j=1;j<=temp2;j++) // starting of nested for loop
			{
				System.out.print("  ");
			}
			temp2++;
			for(int k=temp1;k>=1;k--) // starting of nested for loop
			{
				System.out.print("* ");
			}
			temp1--;
			
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

