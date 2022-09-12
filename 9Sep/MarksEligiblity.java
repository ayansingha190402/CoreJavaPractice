/* Program : Eligiblity for college admission
@author: Ayan Singha
@Date : 9 Sep 2022
@Version: 1
*/


class MarksEligiblity  // start of class MarksEligiblity
{
	
	public static void main(String[] args) //Calling the main method
	{
    
		
		//taking input Totak Marks & PCM Marks in floating point
		float totalMarks=Float.parseFloat(args[0]);
		float pcmMarks=Float.parseFloat(args[1]);
		
		
		
		if(totalMarks>60) //checking eligiblity for admission
		{
			if((totalMarks > 80) || (pcmMarks > 80))  // again checking wheteher student is eligble or not
			{
				System.out.println(" You are eligible for Admission in our college in B.Tech");  //printing the result
			}
			else
			{
				System.out.println(" You are eligible for Admission in our college but not eligible for B.Tech");  //printing the result
			}
		}
		else // when the above condition is not satisfied 
		{
			System.out.println(" You are not eligible for Admission in our college");  //printing the result
		}
	
		
		
		
		
    }  // end of main method
	
}  // end of class MarksEligiblity