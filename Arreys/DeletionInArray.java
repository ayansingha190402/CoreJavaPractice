/* Program : Delete a element in Array 
@author: Ayan Singha
@Date : 21 Sep 2022
@Version: 1.1
*/

import java.util.Scanner; // importing util pacakge for scanner class

//starting of class DeletionInArray
class DeletionInArray
{
	static boolean flag;
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
			
			System.out.println("myArrey["+x+"] ->"+i);
			x++;
			if(test==2)
			{
				if(x==myArrey.length -1)
				{
					break;
				}
				
			}
				
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
	
	//method to delete an element
   static void deleteElement(int myArrey[], int position)
   {
	
	   
	   //deleting value
	   
	   for(int i=position+1;i<myArrey.length;i++)
	   {
		   myArrey[i-1]=myArrey[i];
	   }
		   
	   System.out.println("----Elements after deleting the value are :");
	   test =2;
	        
	   displayArrey(myArrey);
	}
  
	
	// staring of main method 
	public static void main(String... args)
	{
		Scanner sc= new Scanner(System.in);
		int myArrey[] =inputArrey();
		displayArrey(myArrey);
		System.out.println("--Enter Element to be deleted :");
		int value= sc.nextInt();
		int position =searchElement(myArrey,value);
		if(flag)
		{
			deleteElement(myArrey,position);
		}
		else
		{
		   System.out.println("-->Element not found");
		}
		
		
	}
	// end of main method 
}
//end of class DeletionInArray