package Day_0;

public class Bank 
{
	private String bankName;
	private String bankCustomerName;
	private String bankAddress;
	private String bankIFSCCode;
	private long customerAccountNumber;
	private int currentBalance;
	
	
	public void  setDeatils(String bankName, String bankCustomerName, String bankAddress, String bankIFSCCode, long customerAccountNumber, 
			int currentBalance) 
	{
	this.bankName = bankName;
	this.bankCustomerName=bankCustomerName;
	this.bankAddress = bankAddress;
	this.bankIFSCCode = bankIFSCCode;
	this.customerAccountNumber= customerAccountNumber;
	this.currentBalance=currentBalance;
	
	}
	public void withdraw(int amount)
	{
		 if(currentBalance<=1000)
		 {
			 System.out.println("Maintain Balance plzz");
		 }
		 else if((currentBalance-amount)<=1000)
		 {
			 System.out.println("Withdraw amount="+amount);
			 System.out.println("InsufficientBalance");
		 }
		 else if((currentBalance-amount)>1000)
		 {
			 System.out.println("Withdraw amount="+amount);
			 System.out.println("Withdraw success");
			 System.out.println("after withdraw Available Balance : Rs"+(currentBalance-amount));
		 }
	}
	public void Deposit(int amount)
	{
		currentBalance=currentBalance + amount;
		System.out.println("Deposite amount="+amount);
		System.out.println("Deposited Successfully ");
		System.out.println(" Available Balance : Rs"+currentBalance);
	}
	public void currentBalance() {
		System.out.println("Your current Balance is :"+currentBalance);
	}
	public String displayDetails()
	{
		return "Bank [bankName=" + bankName + ", bankCustomerName=" + bankCustomerName + ", bankAddress=" + bankAddress
				+ ", bankIFSCCode=" + bankIFSCCode + ", customerAccountNumber=" + customerAccountNumber
				+ ", currentBalance=" + currentBalance + "]";
	}
}

