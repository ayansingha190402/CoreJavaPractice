/* Program : PatternDemo
@author: Ayan Singha
@Date : 13 Sep 2022
@Version: 1
*/


class PatternDemo // start of class forLoopDemo
{
	
	
	// declaring the method starPattern
	public static void starPattern(int noOfRows)
	{
		
		System.out.println("\n\nNo pattern");
		for(int i=1;i<=noOfRows;i++) // starting of for loop
		{
			System.out.println();
			for(int j=1;j<=i;j++) // starting of nested for loop
			{
				System.out.print("* ");
			}
			
		}
	}
	// end of method starPattern
	
	// declaring the method starPatternInverse
	public static void starPatternInverse(int noOfRows)
	{
		
		System.out.println("\n\nStar pattern Inverse ");
		for(int i=noOfRows;i>=1;i--) // starting of for loop
		{
			System.out.println();
			for(int j=i;j>=1;j--) // starting of nested for loop
			{
				System.out.print("* ");
			}
			
		}
	}
	// end of method starPatternInverse
	
	// declaring the method numberPattern
	public static void numberPattern(int noOfRows)
	{
		
		System.out.println("\n\nNo pattern");
		for(int i=1;i<=noOfRows;i++) // starting of for loop
		{
			System.out.println();
			for(int j=1;j<=i;j++) // starting of nested for loop
			{
				System.out.print(j+" ");
			}
			
		}
	}
	// end of method numberPattern
	
	
	// declaring the method numberPatternInverse
	public static void numberPatternInverse(int noOfRows)
	{
		
		System.out.println("\n\nNo pattern Inverse ");
		for(int i=noOfRows;i>=1;i--) // starting of for loop
		{
			System.out.println();
			for(int j=i;j>=1;j--) // starting of nestedfor loop
			{
				System.out.print(j+" ");
			}
			
		}
	}
	// end of method numberPatternInverse
	
	
	
	
	
	
	// declaring the main method 
	public static void main(String... args) //Calling the main method
	{
		// taking input in integer form
		int noOfRows =Integer.parseInt(args[0]);
		
		//calling the function starPattern using noOfRows as parameter
		starPattern(noOfRows);
		
		//calling the function starPatternInverse using noOfRows as parameter
		starPatternInverse(noOfRows);
		
		//calling the function numberPattern using noOfRows as parameter
		numberPattern(noOfRows);
		
		//calling the function numberPatternInverse using noOfRows as parameter
		numberPatternInverse(noOfRows);
		
		
    }  // end of main method
	
}  // end of class factorialDemo

