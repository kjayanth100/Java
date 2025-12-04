package Laderif;

public class UniversityAdmission {
	public String evaluateAdmission(int marks,boolean sportsAchievement) {
		String st;
		if(marks>=95) {
			st="Admitted with Scholarship";
		}
		else if(marks>=85 && marks<=94) {
			st="Admitted without Scholarship";
		}
		else if(marks>=70 && marks<=84 && sportsAchievement) {
			st="Admitted under Sports Quota";
		}
		else if(marks>=60 && marks<=69) {
			st="Interview Required";
		}else {
			st="Admission Rejected";
		}
		return st;
	}
	public static void main(String[] args) {
		String result=new UniversityAdmission().evaluateAdmission(75, true);
		System.out.println(result);
	}
}
