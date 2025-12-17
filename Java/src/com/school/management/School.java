package com.school.management;

public class School {
	private String name;
	private String location;
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	public void setLocation(String l) {
		location=l;
	}
	public String getLocation() {
		return location;
	}
	public void showSchoolInfo() {
		System.out.println("School Name: "+name);
		System.out.println("School Locaton: "+location);
	}
}
