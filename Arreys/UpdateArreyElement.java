/* Program : Update any element of arrey
@author: Ayan Singha
@Date : 21 Sep 2022
@Version: 1.1
*/

import java.util.Scanner; // importing util pacakge for scanner class

//starting of class UpdateArreyElement
class UpdateArreyElement

{
	static boolean flag;
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
	
	
	static int searchElement(int myArrey[], int value)
	{
		int position=0;
		// searching the value to be deleted in the arrey
	   for(int i=0; i<myArrey.length;i++)
	   {
		   if(myArrey[i]==value)
		   {
			   flag=true;
			   position=i;
			   break;
		   }
	   }
	   return position;
	   
	}

	static void updateElement(int myArrey[], int position)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("--Enter new element:");
		int value= sc.nextInt();
		myArrey[position]=value;
		displayArrey(myArrey);
	}
	
	
	// staring of main method 
	public static void main(String... args)
	{
		Scanner sc= new Scanner(System.in);
		int myArrey[] =inputArrey();
		displayArrey(myArrey);
		System.out.println("--Enter Element to be update:");
		int value= sc.nextInt();
		int position =searchElement(myArrey,value);
		if(flag)
		{
			updateElement(myArrey,position);
		}
		else
		{
		   System.out.println("-->Element not found");
		}
		
	}
	// end of main method 
}
//end of class UpdateArreyElement
