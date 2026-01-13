package com.SetA;

import java.util.Scanner;

class Vehicle{
	private String ownerName;
	private String vehNum;
	private String vehType;
	
	public Vehicle(String ownerName, String vehNum, String vehType) {
		super();
		this.ownerName = ownerName;
		this.vehNum = vehNum;
		this.vehType = vehType;
	}
	public void profile() {
		System.out.println("------Profile Details-------\nOwner Name : "+this.ownerName);
		System.out.println("Vehicle Number : "+this.vehNum);
		System.out.println("Vehicle Type : "+this.vehType);
	}
}

class ServiceVehicle extends Vehicle{
	private String centerName;
	private String category;
	
	public ServiceVehicle(String ownerName, String vehNum, String vehType, String centerName, String category) {
		super(ownerName, vehNum, vehType);
		this.centerName = centerName;
		this.category = category;
	}
	
	public void serviceCategory(String cat) {
		if(cat.equals(null)||cat.equals("")) {
			System.out.println("Data entered is not valid");
		}
		else {
			this.category=cat;
			System.out.println("Data Updated Successfully");
		}
	}
	
	public void serviceCenterName(String cname) {
		if(cname.equals(null)||cname.equals("")) {
			System.out.println("Data entered is not valid");
		}
		else {
			this.centerName=cname;
			System.out.println("Data Updated Successfully");
		}
	}
	
	public void viewDetails() {
		super.profile();
		System.out.println("Service Center Name : "+this.centerName);
		System.out.println("Service Category : "+this.category);
	}
}

public class VehicleManagementSystem {

	public static void main(String[] args) {
		 
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Owner Name : ");
		String oname=in.nextLine();
		System.out.print("Enter Vehicle Number : ");
		String vehNum=in.next();
		System.out.print("Enter Vehicle Type : ");
		String vehType=in.next();
		in.nextLine();
		System.out.print("Enter Service Center Name : ");
		String sname=in.nextLine();
		System.out.print("Enter Service Category : ");
		String scat=in.nextLine();
		ServiceVehicle sv=new ServiceVehicle(oname, vehNum, vehType, sname, scat);
		int opt=0;
		do {
			System.out.println("---------Menu-----------");
			System.out.println("1. Update Service Category");
			System.out.println("2. Update Service Center Name");
			System.out.println("3. View Profile");
			System.out.println("4. Exit");
			System.out.print("Enter your choice [1-4] : ");
			opt=in.nextInt();
			switch(opt) {
			case 1 : 
				in.nextLine();
				System.out.print("Enter Service Category : ");
				String newcat=in.nextLine();
				sv.serviceCategory(newcat);
				break;
			case 2: 
				in.nextLine();
				System.out.println("Enter Service Name : ");
				String newname=in.nextLine();
				sv.serviceCenterName(newname);
				break;
			case 3:
				sv.viewDetails();
				break;
			case 4:
				System.out.println("Thank You");
				break;
			default:
                System.out.println("Invalid choice");
			}
		}while(opt!=4);
		in.close();
	}
}
