package Laderif;

public class InsurancePolicy {
	public String calculatePremium(int age,int experience) {
		String st;
		if(age>=50 && experience>=10) {
			st="Lowest Premium";
		}
		else if((age>=30 && age<=50)&&(experience>=5)) {
			st="Moderate Premium";
		}
		else if((age>=18 && age<=30)&&(experience<5)) {
			st="Highest Premium";
		}
		else {
			st="Not Eligible for Insurance";
		}
		return st;
	}
	public static void main(String[] args) {
		String result=new InsurancePolicy().calculatePremium(21, 2);
		System.out.println(result);
	}
}
