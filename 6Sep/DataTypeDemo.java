/*
Program : Understanding data type in Java
@author: Ayan Singha
@Date : 6 Sep 2022
@Version: 1
*/

class DataTypeDemo

{

	/* declaring  varieable as static 
	without assigning  any value 
	to show default values */
	static byte byte_type1;
	static int number1;
	static float marks1;
	static double percentage1;
	static boolean isJavaNotFun;
	// calling main
	public static void main(String args[])
	
	{
		byte byte_type2=-30;
		int number2=50;
		float marks2=87.65F;
		double percentage2 =95.009;
		boolean isJavaFun = true;
		// printing default value
		System.out.println("\nPrinting default values of different data types"); 
	
		System.out.println("The value of byte_type1 is:"+ byte_type1); 
		System.out.println("The value of numeber1 is:"+number1); 
		System.out.println("The value of marks1 is:"+marks1); 
		System.out.println("The value of percentage1 is:"+ percentage1); 
		System.out.println("The value of isJavaNotFun is:"+ isJavaNotFun);
		
		//Printing values of different data types after assigning 
		System.out.println("\n Printing values of different data types after assigning "); 
		System.out.println("The value of byte_type2 is:"+ byte_type2);
		System.out.println("The value of numeber2 is:"+number2);
		System.out.println("The value of marks2 is:"+marks2); 
		System.out.println("The value of percentage2 is:"+ percentage2);
		System.out.println("The value of isJavaFun is:"+ isJavaFun);
		
		// type casting 
		byte test = (byte)129;
		System.out.println("The value of test is:"+ test);
	}
// end of main 	

}
// end of DataTypeDemo