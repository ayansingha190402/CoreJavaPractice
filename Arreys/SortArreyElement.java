/* Program : To sort element of array
@author: Ayan Singha
@Date : 21 Sep 2022
@Version: 1.1
*/

import java.util.Scanner; // importing util pacakge for scanner class

//starting of class SortArreyElement
class SortArreyElement

{
	
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
			System.out.println("myArrey["+x+"] ->"+i);
			x++;
				
		}
	}
	// end of method displayArrey
	
	// staring of method sortArrayElement
	static int[] sortArrayElement(int myArrey[])
   {
	   int temp;
	   for(int i=0;i<myArrey.length-1;i++)
	   {
		   for(int j=i+1;j<myArrey.length;j++)
		   {
			   if(myArrey[i]>myArrey[j])
			   {
				   //swaping the values 
				   temp = myArrey[i];
				   myArrey[i]=myArrey[j];
				   myArrey[j]=temp;
			   }
		   }
	   }
	    return myArrey;
	}
	
	
	
	// staring of main method 
	public static void main(String... args)
	{
		int myArrey[] =inputArrey();
		System.out.println("\nArray before sorting -->");
		displayArrey(myArrey);
		
		int newArrey[] =sortArrayElement(myArrey);
		System.out.println("\nArray after sorting -->");
		displayArrey(newArrey);
	}
	// end of main method 
}
//end of class NagetiveArrayValues