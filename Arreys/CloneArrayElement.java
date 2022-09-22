/* Program : Insert new element in Array 
@author: Ayan Singha
@Date : 16 Sep 2022
@Version: 1
*/

import java.util.Scanner; // importing util pacakge for scanner class

// declaring class CloneArrayElement
class CloneArrayElement{
   
   
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
	static void displayArray(int myArrey[])
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
	

   // method to print an array
   static void copyArrayElement(int originalArray[])
   {	
	   //declaring an array to create a clone
	   
	   int deepCloneArray[] = originalArray.clone(); // deep copy : changes in original  are not reflected
	   
	   //declaring an array to create copy
	   int shallowCopyArray[] =originalArray;   // shallow copy : changes are reflected
	   
	   System.out.println("Printing the values of original array" );
	   displayArray(originalArray);	   
		   
		//changing the values of original array
		for(int i=0;i<originalArray.length;i++)
		{
			originalArray[i]*=10;
		}
		   
		//after change 
		System.out.println();
		System.out.println("Printing the values of copied array" ); 
		displayArray(shallowCopyArray);
		
		System.out.println();
		System.out.println("Printing the values of cloned array" ); 
		displayArray(deepCloneArray);
	  
   }
   // end of method
   
   
   // main method
   public static void main(String ...args)
   {
	   // calling the method inputArrey
	  int myArrey[] =inputArrey();
	   
	   
	   // calling the method copyArrayElement
       copyArrayElement(myArrey);
   
   }

// end of main

} 

// end of class CloneArrayElement