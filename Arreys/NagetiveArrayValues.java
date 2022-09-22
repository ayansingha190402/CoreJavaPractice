/* Program : Print negetive values of an array
@author: Ayan Singha
@Date : 21 Sep 2022
@Version: 1.1
*/

import java.util.Scanner; // importing util pacakge for scanner class

//starting of class NagetiveArrayValues
class NagetiveArrayValues

{
	static int test;
	// staring of method inputArrey
	static int[] inputArrey()
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
		test=1;
		return newArrey;
		
	}
	// end of method inputArrey


	
	// staring of method displayArrey
	static void displayArrey(int myArrey[])
	{
		int x=0;
		System.out.println("\n\nDisplaying elements  ->");
		for(int i: myArrey)
		{
			if(test==2)
				if(myArrey[x]<0)
					System.out.println("myArrey["+x+"] ->"+i);
			x++;
				
		}
	}
	// end of method displayArrey
	
	// staring of method negetiveValues
	 public static int[] negetiveValues(int myArrey[])
	 {		
		
		
		int newArrey[]= new int[myArrey.length];
		for(int i=0;i<myArrey.length;i++)
		{
			if(myArrey[i]<0)
			{
				newArrey[i]=myArrey[i];
			}
			
			
		}
		test=2;
		return newArrey;
		
	}
	// end of method negetiveValues
	
	
	
	// staring of main method 
	public static void main(String... args)
	{
		int myArrey[] =inputArrey();
		displayArrey(myArrey);
		
		int newArrey[] =negetiveValues(myArrey);
		displayArrey(newArrey);
	}
	// end of main method 
}
//end of class NagetiveArrayValues