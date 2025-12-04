package Blc_Elc;

public class BankApplication {
	public static void main(String[] args) {
		BankAccount obj=new BankAccount();
		obj.setaccountNumber(987654321);
		obj.setaccountHolderName("Jayanth");
		obj.setbalance(30000);
		System.out.println("Account Number : "+obj.getaccountNumber());
		System.out.println("Account HolderName : "+obj.getaccountHolderName());
		System.out.println("Account Balance : "+obj.getbalance());
		System.out.println("---------------------------");
		obj.setbalance(25000);
		
		System.out.println("Updated Account Balance : "+obj.getbalance());
		
	}
}
