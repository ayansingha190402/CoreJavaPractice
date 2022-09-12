/* Program : NestedSwitch
@author: Ayan Singha
@Date : 12 Sep 2022
@Version: 1
*/


class NestedSwitch  // start of class NestedSwitch
{
	
	public static void main(String[] args) //Calling the main method
	{
		String game=args[0].toLowerCase();

		
		switch(game) //starting of switch case
		{
			
			case "football": 
			{
				System.out.println("I love football"); // printing
				String role=args[1].toLowerCase();
				switch(role) //starting of switch case
				{
					case "keeper": System.out.println("I am a goal keeper"); // printing
									break;
					case "striker": System.out.println("I am a striker"); // printing
									break;	  
					default : System.out.println("I am a all rounder "); // printing
					
				}
				break;
				
			}
			case "badminton": System.out.println("I love badminton"); // printing
				             break;
			case "cricket": System.out.println("I love cricket"); // printing
				             break;		  
			default : System.out.println("Wrong input "); // printing
					
		}
		
		
    }  // end of main method
	
}  // end of class NestedSwitch

