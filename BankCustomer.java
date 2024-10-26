package Day_0;

public class BankCustomer {
			public static void main(String[]args)
			{
				Bank b1 = new Bank();
				b1.setDeatils("SBI","smith","basmath","ABC@149",888888888,5000);
				b1.currentBalance();
				b1.withdraw(400);
				b1.Deposit(1000);
				String b2=b1.displayDetails();
				System.out.println(b2);
			}
}
/*




public class Bank 
{
	private String bankName;
	private String bankCustomerName;
	private String bankAddress;
	private String bankIFSCCode;
	private int customerAccountNumber;
	private int currentBalance;
	
	
	public void  setDeatils(String bankName, String bankCustomerName, String bankAddress, String bankIFSCCode, int customerAccountNumber, 
			int currentBalance) {
	this.bankName = bankName;
	this.bankCustomerName=bankCustomerName;
	this.bankAddress = bankAddress;
	this.bankIFSCCode = bankIFSCCode;
	this.customerAccountNumber= customerAccountNumber;
	this.currentBalance=currentBalance;
	
	}
	public void withdraw(int amount)
	{
		 currentBalance=currentBalance - amount;
		
	}
	public void Deposit(int amount)
	{
		currentBalance=currentBalance + amount;
	}
	public void currentBalance() {
		System.out.println("Your current Balance is :");
	}
	public String displayDetails()
	{
		return "Bank [bankName=" + bankName + ", bankCustomerName=" + bankCustomerName + ", bankAddress=" + bankAddress
				+ ", bankIFSCCode=" + bankIFSCCode + ", customerAccountNumber=" + customerAccountNumber
				+ ", currentBalance=" + currentBalance + "]";
	}
}
*/