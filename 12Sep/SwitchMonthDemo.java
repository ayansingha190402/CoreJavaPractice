/* Program : Printing no of days as per month number
@author: Ayan Singha
@Date : 12 Sep 2022
@Version: 1
*/


class SwitchMonthDemo  // start of class SwitchMonthDemo
{
	
	public static void main(String[] args) //Calling the main method
	{
		int monthNumber=Integer.parseInt(args[0]);

		
		switch(monthNumber) //starting of switch case 
		{
			// if braek statement not found it will go next case
			case 1:  
			case 3: 
			case 5:
			case 7: 
			case 8:
			case 10:
			case 12: System.out.println("No of days:31"); // printing
					  break;
			case 2: System.out.println("No of days:28"); // printing
					  break;
			case 4:  
			case 6: 
			case 9: 
			case 11: System.out.println("No of days:30"); // printing
					  break;		  
			default : System.out.println("Wrong input "); // printing
					
		}
		
		
    }  // end of main method
	
}  // end of class SwitchMonthDemo
