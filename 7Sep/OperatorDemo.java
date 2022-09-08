/* Program : Understnading the Operator
@author: Ayan Singha
@Date : 7 Sep 2022
@Version: 1
*/

// Declaring the class OperatorDemo
class OperatorDemo
{
	public static void main(String args[])     //Calling The Main Method
	{
	
		float divisor=8;
		float dividend= 67;
		int q= (int) (dividend/divisor);
		//int q=5;
		int r = (int) (dividend%divisor);
		System.out.println("The quotient is : "+q);
		System.out.println("The remainder is : "+r);
		boolean status=8>9;
		System.out.println("The status is : "+status);

	} // End of the main Function


} // End of the class OperatorDemo
