class StudentTest
{
	public static void main(String... args)
	{
		Student s[]= new Student[5];
		for(int i=0;i<5;i++)
		{
			s[i]= new Student();
		}
		s[0]=new Student(22,"Ayan");
	} 
        // Initializing the first element
        // of the array
        s[1] = new Student(1, "Ayan", 92);
		
 
        // Initializing the second element
        // of the array
        s[2] = new Student(2, "Subhadip", 94);
		
		// Initializing the third element
        // of the array
        s[3] = new Student(3, "Jayanta",95);
 
        // Initializing the fourth element
        // of the array
        s[4] = new Student(4, "Uday",90);
		
		for(int i=0;i<=5;i++)
		{
			if(s[i].getMarks()>=90)
			{
				System.out.println("Name: "+s[i].getName())
			}
		}
}