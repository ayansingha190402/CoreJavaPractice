/* Program : Printing the day as per value 
@author: Ayan Singha
@Date : 9 Sep 2022
@Version: 1
*/


class SwitchDemo  // start of class SwitchDemo
{
	
	public static void main(String[] args) //Calling the main method
	{
		//taking input day in integer form
		int day=Integer.parseInt(args[0]);
		
		switch(day) //starting of switch case on the basis of day
		{
			case 1: System.out.println("Monday "); // printing
					break; 
			case 2: System.out.println("Tuesday "); // printing
					break;
			case 3: System.out.println("Wednesday "); // printing
					break;
			case 4: System.out.println("Thursday "); // printing
					break;
			case 5: System.out.println(" Friday "); // printing
					break;
			case 6: System.out.println("Saturaday "); // printing
					break;
			case 7: System.out.println("Sunday "); // printing
					break;
			default : System.out.println("Wrong input "); // printing
					
		}
		
		
    }  // end of main method
	
}  // end of class SwitchDemo
