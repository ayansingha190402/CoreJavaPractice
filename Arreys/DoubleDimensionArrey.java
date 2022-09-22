/* Program : Create a 2D array and travase it
@author: Ayan Singha
@Date : 21 Sep 2022
@Version: 1
*/

import java.util.Scanner; // importing util pacakge for scanner class

//starting of class DoubleDimensionArrey
class DoubleDimensionArrey
{
	
	// staring of method inputArrey
	static void inputArrey()
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the rows of Arrey");
		int row=sc.nextInt();
		System.out.println("\nEnter the column of Arrey");
		int column=sc.nextInt();
		int newArrey[][]= new int[row][column];
		for(int i=0;i<row;i++)
		{
			//inner loop for single row
			for(int j=0;j<column;j++)
			{
				System.out.println("myArrey["+i+"]["+j+"] ->");
				newArrey[i][j]= sc.nextInt();
			}
			// end of innerloop	
		}
		displayArrey(newArrey);
		
	}
	// end of method inputArrey
	
	// staring of method displayArrey
	static void displayArrey(int myArray[][])
	{		
		
		for(int[] arrayRow:myArray)
		{
			for(int myRow:arrayRow)
			{
				System.out.print(myRow+ "  ");
			}
			
			System.out.println();
				
		}
		
	}
	// end of method displayArreyFor
	
	
	
	// staring of main method 
	public static void main(String... args)
	{
		inputArrey();
	}
	// end of main method 
}
//end of class DoubleDimensionArrey