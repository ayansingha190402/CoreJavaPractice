/* Program : SwitchExpression
@author: Ayan Singha
@Date : 12 Sep 2022
@Version: 1
*/


class SwitchExpression  // start of class SwitchExpression
{
	
	public static void main(String[] args) //Calling the main method
	{
		String game=args[0].toLowerCase();

		
		switch(game) //starting of switch case
		{
			
			case "football" -> System.out.println("I love football"); // printing
			case "badminton"-> System.out.println("I love badminton"); // printing
			case "cricket" ->  System.out.println("I love cricket"); // printing	  
			default -> System.out.println("Wrong input "); // printing
					
		}
		
		
    }  // end of main method
	
}  // end of class SwitchExpression

