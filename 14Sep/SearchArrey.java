/* Program : Search in Arey 
@author: Ayan Singha
@Date : 14 Sep 2022
@Version: 1
*/

import java.util.Scanner; // importing util pacakge for scanner class

//starting of class SearchArrey
class SearchArrey
{
	// staring of method searchInArrey
	
	static void searchInArrey(int myArrey[])
	{
		System.out.println("\nEnter element to be searched ->");
		Scanner sc = new Scanner(System.in);
		int element=sc.nextInt();
		boolean status = false;
		int temp=0;
		for(int i=0;i<myArrey.length;i++)
		{
			if(myArrey[i]==element)
			{
				status = true;
				temp =i;
				break ;
			}
			
		}
		if(status)
			System.out.println("\nElement found at -> Index"+temp);
		else
			System.out.println("\nElement not present in the arrey ");
	}
	// end of method searchInArrey
	
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
		searchInArrey(newArrey);
	}
	// end of method inputArrey
	
	// staring of method displayArrey
	static void displayArrey(int myArrey[])
	{
		
		for(int i=0;i<myArrey.length;i++)
		{
			System.out.println("myArrey["+i+"] ->"+myArrey[i]);
				
		}
		
	}
	// end of method displayArrey
	
	// staring of main method 
	public static void main(String... args)
	{
		inputArrey();
	}
	// end of main method 
}
//end of class SearchArrey