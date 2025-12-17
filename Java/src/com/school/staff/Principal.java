package com.school.staff;

public class Principal {
	private String principalName;
	private int experienceYears;
	public void setPrincipalName(String pname) {
		principalName=pname;
	}
	public String getPrincipalName() {
		return principalName;
	}
	public void setExperienceYears(int e) {
		experienceYears=e;
	}
	public int getExperienceYears() {
		return experienceYears;
	}
	public void showPrincipalinfo() {
		System.out.println("Principal Name: "+principalName);
		System.out.println("Experience: "+experienceYears);
	}
}
