/* Program : IfElseDemo
@author: Ayan Singha
@Date : 9 Sep 2022
@Version: 1
*/


class IfElseDemo  // start of class IfElseDemo
{
	
	public static void main(String[] args) //Calling the main method
	{
    
		
		//taking input Age in Integer form
		int age=Integer.parseInt(args[0]);
		
		if(age>=18)  //checking the age 
		{
			System.out.println("You are eligible for voting");  //printing 
		}
		else if (age<18 & age>=15) // again checking the age
		{
			System.out.println(" Wait Dear for few years ");  //printing
		}
		else // when the any one of above two condition is not satisfied
		{
			System.out.println(" Your are too young ");  //printing
		}
		
    }  // end of main method
	
}  // end of class IfElseDemo