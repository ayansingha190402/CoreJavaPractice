/* Program : Traverse in Arey 
@author: Ayan Singha
@Date : 14 Sep 2022
@Version: 1
*/

import java.util.Scanner; // importing util pacakge for scanner class

//starting of class TraverseArrey
class TraverseArrey
{
	
	// staring of method inputArrey
	static void inputArrey()
	{		
		System.out.println("\nEnter size of Arrey");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int newArrey[]= new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("myArrey["+i+"] ->");
			newArrey[i]=sc.nextInt();
			
			
		}
		displayArreyFor(newArrey);
		displayArreyEnhanceFor(newArrey);
	}
	// end of method inputArrey
	
	// staring of method displayArreyFor
	static void displayArreyFor(int myArrey[])
	{
		System.out.println("\n\nDisplay using for loop ->");
		for(int i=0;i<myArrey.length;i++)
		{
			
			System.out.println("myArrey["+i+"] ->"+myArrey[i]);
				
		}
		
	}
	// end of method displayArreyFor
	
	// staring of method displayArreyEnhanceFor
	static void displayArreyEnhanceFor(int myArrey[])
	{
		int x=0;
		System.out.println("\n\nDisplay using enhance for loop ->");
		for(int i: myArrey)
		{
			System.out.println("myArrey["+x+"] ->"+i);
			x++;
				
		}
		
	}
	// end of method displayArreyEnhanceFor
	
	
	// staring of main method 
	public static void main(String... args)
	{
		inputArrey();
	}
	// end of main method 
}
//end of class TraverseArrey