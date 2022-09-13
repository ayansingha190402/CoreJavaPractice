/* Program : WhileDemo
@author: Ayan Singha
@Date : 13 Sep 2022
@Version: 1
*/


class WhileDemo // start of class WhileDemo
{
	// declaring the method whileLoopDemo
	static void whileLoopDemo(int status)
	{
		System.out.println("\n\nUse of While Loop");
		//starting of while loop
		while (status>10)
		{
			System.out.println("Bulb is ON ---- Durablity  "+status+"\n");
			status-=5;
		}
		
		//check bulb staus
		if(status<=10)
		{
			System.out.println("Bulb is OFF");
		}   
	}
	// end of method whileLoopDemo
	
	// declaring the method doWhileLoopDemo
	static void doWhileLoopDemo(int status)
	{
		System.out.println("\n\nUse of do While Loop");
		//starting of do while loop
		do
		{
			System.out.println("Bulb is ON ---- Durablity  "+status+"\n");
			status-=5;
		}
		while (status>10);
		
		//check bulb staus
		if(status<=10)
		{
			System.out.println("Bulb is OFF");
		}   
	}
	// end of method doWhileLoopDemo2
	

	// declaring the main method 
	public static void main(String... args) //Calling the main method
	{
		
		// taking input in integer form
		int status=Integer.parseInt(args[0]);
		
		//calling the function whileLoopDemo using status as parameter
		whileLoopDemo(status);
		
		//calling the function doWhileLoopDemo using status as parameter
		doWhileLoopDemo(status);
		
		
		
    }  // end of main method
	
}  // end of class WhileDemo

