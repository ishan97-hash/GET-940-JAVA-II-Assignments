class BankAccount {
	public static void main(String[]args) {
		Accountdetails ad = new Accountdetails(9895, 2500, "8087");
		
		ad.showAccountDetails();
	    
		
	}
}

class Accountdetails{
	
	private int accountNo;
	private double accountBalance;
	private String accountPassword;
	static String BankName = "ICIC Bank";

	
	
	Accountdetails(int accountNo, double accountBalance, String accountPassword){
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
		
	}
	//Setters and getters for the AccountDetails
	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	
	
	void showAccountDetails() {
		System.out.println("Bank Name:"+ Accountdetails.BankName);
		System.out.println("password: " + accountPassword); 
		System.out.println("Acc_No: " + accountNo); 
		System.out.println("Balance: Rs" + accountBalance); 	
	
	}
}
	
