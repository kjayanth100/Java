package Laderif;

public class LoanApproval {
	public String checkLoanApproval(double salary, int creditScore) {
		String st;
		if(salary>=80000.0 && creditScore>=750) {
			st="Loan Approved Immediately";
		}
		else if((salary>=50000.0 && salary<=80000.0)&&(creditScore>650 && creditScore<750)) {
			st="Loan Approved with Higher Interest Rate";
		}else if((salary>=30000.0 && salary<=50000.0)&&(creditScore>500 && creditScore<650)) {
			st="Co-signer Required";
		}else {
			st="Loan Rejected";
		}
		return st;
	}
	public static void main(String[]args) {
		String result=new LoanApproval().checkLoanApproval(90000,850);
		System.out.println(result);
	}
}
