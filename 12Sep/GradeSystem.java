/* Program : GradeSystem
@author: Ayan Singha
@Date : 12 Sep 2022
@Version: 1
*/



//statrt of class GradeSystem
class GradeSystem
{
	//start of main
	public static void main(String args[])
	{
		//passing the string to integer form
		int marks=Integer.parseInt(args[0]);
		
		if(marks>80)  //checking the age 
		{
			System.out.println("You grade is A");  //printing 
		}
		else if ((marks<=80) & (marks>=60)) // again checking the marks
		{
			System.out.println(" You grade is B ");  //printing
		}
		else if ((marks<=59) & (marks>=50)) // again checking the marks
		{
			System.out.println(" You grade is C ");  //printing
		}
		else if ((marks<49 )& (marks>=45)) // again checking the marks
		{
			System.out.println(" You grade is D ");  //printing
		}
		else if ((marks<=44) & (marks>=25)) // again checking the marks
		{
			System.out.println(" You grade is E ");  //printing
		}
		else if ((marks<=24) & (marks>=0)) // again checking the marks
		{
			System.out.println(" You are fall");  //printing
		}
		else // when any of above condition is not satisfied
		{
			System.out.println(" Wrong Input");  //printing
		}
		
	}
	
	//end of main
	
	
}
// end of class GradeSystem