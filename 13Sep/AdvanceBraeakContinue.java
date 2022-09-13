/* Program : Advance Break & Continue
@author: Ayan Singha
@Date : 13 Sep 2022
@Version: 1
*/


class AdvanceBraeakContinue
 // start of class AdvanceBraeakContinue
{
	
	// declaring the method BraeakContinueDemo
	public static void breakStatement(int number)
	{

		System.out.println("Using break Statement");
		System.out.println("Input is  ->"+number);
		System.out.println("Type 1");
		
		// using of unlabelled break
		for(int i=1;i<=number;i++)
	   {
		   System.out.println();
		   for(int j=1;j<=number;j++)
		   {
			   if(i<=j)
			   {
				   break; // breaking only the inner loop
			   }
			   System.out.print(i+""+j+ "  ");
		   }
	   }
	   
	   // using of labelled break
		System.out.println("\n\nType 2");
		outerloop: for(int i=1;i<=number;i++)
	    {
		   System.out.println();
		   for(int j=1;j<=number;j++)
		   {
			   if(i<=j)
			   {
				   break outerloop; // breaking  the outer loop also
			   }
			   System.out.print(i+""+j+ "  ");
		   }
	    }
		
	}
	// end of method breakStatement
	
	// declaring the method continueStatement
	public static void continueStatement(int number)
	{

		System.out.println("Using continue Statement");
		System.out.println("Input is  ->"+number);
		System.out.println("Type 1");
		
		// using of unlabelled break
		for(int i=1;i<=number;i++)
	   {
		   System.out.println();
		   for(int j=1;j<=number;j++)
		   {
			   if(i<=j)
			   {
				   continue; // breaking only the inner loop
			   }
			   System.out.print(i+""+j+ "  ");
		   }
	   }
	   
	   // using of labelled break
		System.out.println("\n\nType 2");
		outerloop: for(int i=1;i<=number;i++)
	    {
		   System.out.println();
		   for(int j=1;j<=number;j++)
		   {
			   if(i<=j)
			   {
				   continue outerloop; // breaking  the outer loop also
			   }
			   System.out.print(i+""+j+ "  ");
		   }
	    }
		
	}
	// end of method breakStatement
	
	
	// declaring the main method 
	public static void main(String[] args) //Calling the main method
	{
		// taking input in integer form
		int number =Integer.parseInt(args[0]);
		
		//calling the function breakStatement using number as parameter
		breakStatement(number);
		
		System.out.println("\n\n");
		
		
		//calling the function continueStatement using number as parameter
		continueStatement(number);
		
		
		
    }  // end of main method
	
}  // end of class AdvanceBraeakContinue

