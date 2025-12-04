package Blc_Elc;

public class BankAccount {
	long accountNumber;
	String accountHolderName;
	double balance;
	public long getaccountNumber() {
		return accountNumber;
	}
	public void setaccountNumber(int acnum) {
		accountNumber=acnum;
	}
	public String getaccountHolderName() {
		return accountHolderName;
	}
	public void setaccountHolderName(String acHolderName) {
		accountHolderName=acHolderName;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double bal) {
		balance=bal;
	}
	
}
