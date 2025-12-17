package com.school.app;
import com.school.management.School;
import com.school.staff.Principal;
public class SchoolApp {

	public static void main(String[] args) {
		School sc=new School();
		Principal p=new Principal();
		sc.setName("Jai");
		sc.setLocation("ZPHS");
		p.setPrincipalName("Jayanth");
		p.setExperienceYears(4);
		sc.showSchoolInfo();
		System.out.println();
		p.showPrincipalinfo();

	}

}
