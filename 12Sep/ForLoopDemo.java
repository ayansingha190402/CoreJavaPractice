/* Program : ForLoopDemo
@author: Ayan Singha
@Date : 12 Sep 2022
@Version: 1
*/


class ForLoopDemo // start of class ForLoopDemo
{
	
	// declaring the method forLoopDemo1
	public static void forLoopDemo1(int value, int constant)
	{
		System.out.println("Printing the table of no you have entered: \n"); 
		for(int val=value;val<=10;val++) // starting of for loop
		{
			System.out.println(constant +" X "+value+" = "+" "+(value*constant));

		}
	}
	// end of method forLoopDemo1
	
	
	
	// declaring the method forLoopDemo2
	public static void forLoopDemo2(int value, int constant)
	{
		System.out.println("Printing the table of consecutive no of the no you have entered: \n");
		for(;value<=10;) // starting of for loop
		{
			System.out.println(constant +" X "+value+" = "+" "+(value*constant));
			value++; // here we incrementing the value of varieable value 
		}
	}
	// end of method forLoopDemo2
	

	
	// declaring the main method 
	public static void main(String[] args) //Calling the main method
	{
		int constant =Integer.parseInt(args[0]);
		int value=1;
		forLoopDemo1(value,constant);
		forLoopDemo2(value,constant+1);
		
    }  // end of main method
	
}  // end of class ForLoopDemo

