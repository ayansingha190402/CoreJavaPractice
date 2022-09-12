/* Program : Printing the grade as per value 
@author: Ayan Singha
@Date : 9 Sep 2022
@Version: 1
*/


class SwitchDemo2  // start of class SwitchDemo2
{
	
	public static void main(String[] args) //Calling the main method
	{
		//declaring grade character
		//char grade = Character.parseChar(args[0]);
		char grade='A';

		
		switch(grade) //starting of switch case on the basis of grade varieable
		{
			case 'A': System.out.println("Pass:Excilent "); // printing
					  break; 
			case 'B': System.out.println("Pass:Very Good "); // printing
					  break;
			case 'C': System.out.println("Pass:Good  "); // printing
					  break;
			case 'D': System.out.println("Pass:Do better "); // printing
					  break;
			case 'E': System.out.println("Fail"); // printing
					  break;
			default : System.out.println("Wrong input "); // printing
					
		}
		
		
    }  // end of main method
	
}  // end of class SwitchDemo2
