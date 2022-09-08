/* Program : AverageDemo
@author: Ayan Singha
@Date : 6 Sep 2022
@Version: 1
*/

//statrt of class AverageDemo
class AverageDemo
{
	//start of main
	 static void main(String arg[])
	{
		float marks1= 90.0F;
		float marks2= 92.0F;
		float marks3= 87.2F;
		float average1= (marks1+ marks2+ marks3)/3;
		System.out.println("Addition of marks1n marks2 & marks3 "+ average1);
		float marks4= Float.parseFloat(arg[0]);// taking input 
		float marks5= Float.parseFloat(arg[1]);// taking input 
		float marks6= Float.parseFloat(arg[2]);// taking input 
		float average2= (marks4+ marks5+ marks6)/3;
		System.out.println("Addition of marks4, marks5 & marks6 "+ average2);
		
	}
	//end of main
	
	
}
// end of class AverageDemo
