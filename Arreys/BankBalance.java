/* Program :BankBalance
@author: Ayan Singha
@Date : 19 Sep 2022
@Version: 1
*/

import java.util.Scanner; // importing util pacakge for scanner class

//starting of class 
class BankBalance
{
	
	// staring of method 
	static void inputBalance()
	{		
		float name;
		double accountBalance;
		int size=10;
		int newArrey[]= new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account no");
		for(int i=0;i<size;i++)
		{
			
			newArrey[i]=sc.nextInt();
			
			
		}
		displayBalance(newArrey);
		
	}
	// end of method 
	
	// staring of method 
	static void displayBalance(int myArrey[])
	{
		System.out.println("\n\nYour account no is  ->");
		for(int i=0;i<myArrey.length;i++)
		{
			if(i<6)
			{
				System.out.print("X");
			}
			else
			{
				System.out.print(myArrey[i]);
			}	
		}
		
	}
	// end of method 
	
	
	// staring of main method 
	public static void main(String... args)
	{
		inputBalance();
	}
	// end of main method 
}
//end of class TraverseArrey