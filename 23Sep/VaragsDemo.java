class VaragsDemo
{
	static void printArray(int arr[])
	{
		System.out.println("+++++Normal Arrey Printing +++++ ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("+++++++++++++++++ ");
	}
	
	static void printArrayBetter(int ...ar)
	{
		System.out.println("+++++Normal Arrey Printing Using Varags: in Ints +++++ ");
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
		System.out.println("+++++++++++++++++ ");
	}
	
	static void printArrayBetter(String ...ar)
	{
		System.out.println("+++++Normal Arrey Printing Using Varags:  In String +++++ ");
		for(String i:ar)
		{
			System.out.print(i+" ");
		}
		System.out.println("+++++++++++++++++ ");
	}
	
	static void printArrayBetter()
	{
		System.out.println("++++EMPTY +++++ ");
		
	}
	/*static void printArrayBetter(int[] ...ar)
	{
		System.out.println("+++++Normal Arrey Printing Using Varags: in Ints +++++ ");
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
		System.out.println("+++++++++++++++++ ");
	}*/
	
	
	public static void main(String... args)
	{
		int a1[]={1,2,3};
		int a2[]={4,5,6,7};
		int a3[]={8,9,10,11};
		
		printArray(a1);
		printArray(a2);
		printArray(a3);
		
		printArrayBetter(6,4,5,2);
		printArrayBetter("AYAN","SUBHADIP","JAYANTA");
		printArrayBetter();
		//printArrayBetter(a1,a2,a3);
	}
}