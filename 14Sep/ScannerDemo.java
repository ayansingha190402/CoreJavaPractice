/* Program : Implement scanner class
@author: Ayan Singha
@Date : 14 Sep 2022
@Version: 1
*/

import java.util.Scanner; // importing util pacakge for scanner class

//starting of class ScannerDemo
class ScannerDemo
{
	// declaring global static varieable
	static int rollNo;
	static String name;
	static float marks;
	static char gender;	
	
	// staring of method takeInput
	static void takeInput()
	{
		// creating a object for scanner class
		Scanner sc=new Scanner(System.in);
		
		// taking input string for name
		System.out.println("Enter you name ");
		name=sc.nextLine();
		
		// taking input integer for roll no
		System.out.println("Enter you Roll No ");
		rollNo=sc.nextInt();
		
		// taking input float for marks
		System.out.println("Enter you marks");
		marks=sc.nextFloat();
		
		// taking input string and convert it to character for gender
		System.out.println("Enter you gender");
		gender=sc.next().charAt(0);
	}
	// end of method takeInput
	
	// staring of method display
	static void display()
	{
		//printing student detilas
		System.out.println("\n\n------ STDENT DETAILS------");
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollNo);
		System.out.println("Marks: "+marks);
		System.out.println("Gender: "+gender);
		
	}
	// end of method display
	
	// staring of main method 
	public static void main(String... args)
	{
		//calling the methods 
		takeInput();
		display();
	}
	// end of main method 
}
//end of class ScannerDemo