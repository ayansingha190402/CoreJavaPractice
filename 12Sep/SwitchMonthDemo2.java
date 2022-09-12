/* Program : Printing no of days as per month name
@author: Ayan Singha
@Date : 12 Sep 2022
@Version: 1
*/


class SwitchMonthDemo2  // start of class SwitchMonthDemo
{
	
	public static void main(String[] args) //Calling the main method
	{
		String month=args[0].toLowerCase();

		
		switch(month) //starting of switch case 
		{
			// if braek statement not found it will go next case
			case "january":  
			case "march": 
			case "may":
			case "july": 
			case "august":
			case "october":
			case "decemver": System.out.println("No of days:31"); // printing
					         break;
			case "february": System.out.println("No of days:28"); // printing
				             break;
				             break;
			case "april":  
			case "june": 
			case "september": 
			case "november": System.out.println("No of days:30"); // printing
				             break;		  
			default : System.out.println("Wrong input "); // printing
					
		}
		
		
    }  // end of main method
	
}  // end of class SwitchMonthDemo2
