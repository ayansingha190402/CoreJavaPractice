/* Program : Arey Even Odd sum
@author: Ayan Singha
@Date : 14 Sep 2022
@Version: 1
*/

import java.util.Scanner; // importing util pacakge for scanner class

//starting of class ArrayEvenOddSum
class ArrayEvenOddSum
{
	// staring of method display
	static void arrey(int num)
	{
		int newArrey[]=new int[num];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<num;i++)
		{
			System.out.println("myArrey["+i+"] ->");
			newArrey[i]=sc.nextInt();
			
			
		}
		System.out.println("\nElements are : -");
		for(int i=0;i<num;i++)
		{
			System.out.println("myArrey["+i+"] ->"+newArrey[i]);
			
			
		}
		int evenSum=0, oddSum=0;
		for(int i=0;i<num;i++)
		{
			if(newArrey[i]%2==0)
				evenSum=evenSum+newArrey[i];
			else
				oddSum=oddSum+newArrey[i];
			
		}
		System.out.println("\nEven Sum is ->"+evenSum);
		System.out.println("\nOdd Sum is ->"+oddSum);
	}
	// end of method display*/
	
	// staring of main method 
	public static void main(String... args)
	{
		System.out.println("\nEnter size of Arrey");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		arrey(num);
	}
	// end of main method 
}
//end of class ArrayEvenOddSum