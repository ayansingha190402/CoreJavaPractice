/* Program : Insert new element in Array 
@author: Ayan Singha
@Date : 16 Sep 2022
@Version: 1
*/

import java.util.Scanner; // importing util pacakge for scanner class

//starting of class InsertionInArrey
class InsertionInArrey
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
		
		displayArrey(newArrey);
		insertElement(newArrey);
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
	
	//declaring the method insertElement
	static void insertElement(int myArray[])
   {	  
         Scanner sc = new Scanner(System.in);
         
         System.out.println("\n-> Enter elements  to be inserted :");
		 int value= sc.nextInt();
	 
		 System.out.println("-> Elements the position of the element :");
		 int position= sc.nextInt();
		 
		 int size= myArray.length;
	     int newArray[] = new int[size+1];
		 
		 for(int i=0;i<position-1;i++)
		 {
			 newArray[i]= myArray[i];
		 }
		 
		 newArray[position-1]=value;
		 
		 for(int j=position;j<size+1;j++)
		 {
			 newArray[j]= myArray[j-1];
		 }
	   
	    System.out.print("Displaying Array after insert new element :" );
		displayArrey(newArray);
	 }
	 // end of method insertElement
	
	// staring of main method 
	public static void main(String... args)
	{
		inputArrey();
		
		
		
	}
	// end of main method 
}
//end of class InsertionInArrey