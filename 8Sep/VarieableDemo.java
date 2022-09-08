//javap java.lang.System
/* Program : VarieableDemo
@author: Ayan Singha
@Date : 8 Sep 2022
@Version: 1
*/


class VarieableDemo // start of class VarieableDemo
{
	static int number1;// declaring static variable
	int number2;  // declaring Instance variable
	
	public static void main(String[] args) //Calling the main method
	{
    
		// declaring loclal variable
		int number3 = 18;
		System.out.println("Static Variebele " + number1); // printing static varieablle
		//System.out.println("Instance Variebele " + number2);  // printing Instance varieablle
		System.out.println("Local Variebele " + number3);  // printing local varieablle

		
    }  // end of main method
	
}  // end of class VarieableDemo