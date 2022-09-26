/* Program :  Write a Student and create an array of  customers and display the
 students whose marks are less than 1000	
@author: Ayan Singha
@Date : 22 Sep 2022
@Version: 1.0
*/

import java.util.Scanner;


//decalaring the class BankAccount
class BankAccount
{
	//starting of main method
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		//taking array of object Bank
		/*Bank s[]= new Bank[10];
		for(int i=0;i<5;i++)
		{
			s[i]= new Bank();
		}
		
			 
        // Initializing the first element
        // of the array
        s[1] = new Bank("SBI",1002, "Ayan","Arambagh", 1200);
		
 
        // Initializing the second element
        // of the array
        s[2] = new Bank("PNB",2002, "Subhadip", "Sonamukhi",1100);
		
		// Initializing the third element
        // of the array
        s[3] = new Bank("UCO",3001, "Jayanta","Bishnupur",1500);
 
        // Initializing the fourth element
        // of the array
        s[4] = new Bank("CANARA",4001, "Uday","Purulia",900);
		
		// Initializing the fifth element
        // of the array
		s[0]=new Bank("AXIS",1001,"Shilpa","Bankura",880);*/
	
		System.out.println("--> Enter total no Account Holder: ");
		int size = sc.nextInt();
		Bank s[]= new Bank[size];
		
		//
		for(int i=0;i<=5;i++)
		{
			s[i]=new Bank();
			System.out.println("--> Enter the Bank Name:  " );
			s[i].setBankName(sc.next());
			System.out.println("--> Enter the Account No:  " );
			s[i].setAccountNo(sc.nextInt());
			System.out.println("--> Enter the Name:  " );
			s[i].setName(sc.next());
			System.out.println("--> Enter the ADdress:  " );
			s[i].setAddress(sc.next());
			System.out.println("--> Enter the Account Balance:  " );
			s[i].setBalance(sc.nextInt());
		}
		
		// displayong all bank account detials 
		//using for loop 
		for(int i=0;i<5;i++)
		{
			
			System.out.println("BANK NAME : "+s[i].getBankName());
			System.out.println("ADDRESS: "+s[i].getAddress());
			System.out.println("NAME: "+s[i].getName());
			System.out.println("BALANCE: "+s[i].getBalance());
			System.out.println("===================================== ");
			
		}
		System.out.println("--> Person having balance less than 1000: ");//printing
		
		//starting of for loop 
		for(int i=0;i<5;i++)
		{
			if((s[i].getBalance())<=1000)
			{
				
				System.out.println("BANK NAME : "+s[i].getBankName());
				System.out.println("ADDRESS: "+s[i].getAddress());
				System.out.println("NAME: "+s[i].getName());
				System.out.println("BALANCE: "+s[i].getBalance());
				System.out.println("===================================== ");
			}
		}
	}
}