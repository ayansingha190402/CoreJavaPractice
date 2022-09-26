class Bank
{
	private String bankName;
	private int accountNo;
	private String name;
	private String address;
	private double balance;
	
	Bank()
	{
		
	}
	Bank(int accountNo, String name, String address,double balance)
	{
		this.bankName=bankName;
		this.accountNo=accountNo;
		this.name=name;
		this.address=address;
		this.balance=balance;
	}
	
	void setBankName(String bankName)
	{
		this.bankName=bankName;
	}
	String getBankName()
	{
		return this.bankName;
	}
	
	void setAccountNo(int accountNo)
	{
		this.accountNo=accountNo;
	}
	int getAccountNo()
	{
		return this.accountNo;
	}
	
	
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return this.name;
	}
	
	
	void setAddress(String address)
	{
		this.address=address;
	}
	String getAddress()
	{
		return this.address;
	}
	
	
	void setBalance(double balance)
	{
		this.balance=balance;
	}
	double getBalance()
	{
		return this.balance;
	}
}