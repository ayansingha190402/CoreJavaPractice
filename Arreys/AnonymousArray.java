/*Programme: Creating an Anonymous array: Array without any name
@author: 
@Date:
*/

// declaring class AnonymousArray
class AnonymousArray{
   
   // method to print an array
   static void displayArray(int myArrey[])
   {
	   // loop to print array elements
	
		int x=0;
		System.out.println("\n\nDisplaying elements  ->");
		for(int i: myArrey)
		{
			System.out.println("myArrey["+x+"] ->"+i);
			x++;
				
		} // end of for
   }
   // end of method displayArray
   
   // main method
   public static void main(String ...args)
   {
	   // calling the method displayArray
    displayArray(new int[]{1,2,3,4,6,7,9,1,2});
   
   }

// end of main

} 

// end of class AnonymousArray