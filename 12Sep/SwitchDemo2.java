/* Program : Printing the grade as per value 
@author: Ayan Singha
@Date : 12 Sep 2022
@Version: 1
*/


class SwitchDemo2  // start of class SwitchDemo2
{
	
	public static void main(String[] args) //Calling the main method
	{
		//declaring grade character
		
		char grade=args[0].toUpperCase().charAt(0);

		
		switch(grade) //starting of switch case on the basis of grade varieable
		{
			case 'A': System.out.println("Your grade is "+grade+"\nPass:Excilent "); // printing
					  break; 
			case 'B': System.out.println("Your grade is "+grade+"\nPass:Very Good "); // printing
					  break;
			case 'C': System.out.println("Your grade is "+grade+"\nPass:Good  "); // printing
					  break;
			case 'D': System.out.println("Your grade is "+grade+"\nPass:Do better "); // printing
					  break;
			case 'E': System.out.println("Your grade is "+grade+"\nFail"); // printing
					  break;
			default : System.out.println("Wrong input "); // printing
					
		}
		
		
    }  // end of main method
	
}  // end of class SwitchDemo2
