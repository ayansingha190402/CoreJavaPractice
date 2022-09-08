//javap java.lang.System
/* Program : LogicalOperator
@author: Ayan Singha
@Date : 8 Sep 2022
@Version: 1
*/


class LogicalOperator // start of class LogicalOperator
{
	
	public static void main(String[] args) //Calling the main method
	{
    
		// declaring boolean valaue
		boolean b1=true, b2=false;
		
		//printing the boolean values
		System.out.println("The value of b1 is:"+b1);
		System.out.println("The value of b2 is:"+b2);
		
		// using the logiacal opearators
		System.out.println("Logical OR :" + (b1|b2)); // logical OR
		System.out.println("Logical AND: " + (b1&b2)); // logical AND
		System.out.println("Logical XOR :" + (b1^b2)); // logical XOR
		System.out.println("NOT b1:" + (!b1)); // logical NOT
		System.out.println("NOT b2:" + (!b2)); // logical NOT
		
		
    }  // end of main method
	
}  // end of class LogicalOperator