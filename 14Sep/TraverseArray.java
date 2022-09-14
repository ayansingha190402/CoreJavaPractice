/* Program : Traversing an arry
@author: Ayan Singha
@Date : 14 Sep 2022
@Version: 1
*/

import java.util.Scanner; // importing util pacakge for scanner class

//starting of class TraverseArray
class TraverseArray
{
	
	// staring of method display
	static void Arrey(int num)
	{
		int j=2;
		int newArrey[]=new int[num];
		for(int i=0;i<num;i++)
		{
			newArrey[i]=j;
			j+=2;
			
		}
		System.out.println("\nElements are : -");
		for(int i=0;i<num;i++)
		{
			System.out.println("myArrey["+i+"] ->"+newArrey[i]);
			
			
		}
	}
	// end of method display*/
	
	// staring of main method 
	public static void main(String... args)
	{
		System.out.println("\nEnter size of Arrey");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		Arrey(num);
	}
	// end of main method 
}
//end of class ScannerDemo