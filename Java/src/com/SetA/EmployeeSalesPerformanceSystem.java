package com.SetA;

import java.util.Scanner;

class SalesEmployee{
	private String empName;
	private int empId;
	public SalesEmployee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}
	public void profile() {
		System.out.println("------Performance Summary-----");
		System.out.println("Employee Name : "+this.empName);
		System.out.println("Employee ID : "+this.empId);
	}
}

class PerformanceEmployee extends SalesEmployee{
	private double totalSales;
	private double avgSales;
	private String performanceGrade;
	int total=0;
	public PerformanceEmployee(String empName, int empId, double totalSales, double avgSales, String performanceGrade) {
		super(empName, empId);
		this.totalSales = totalSales;
		this.avgSales = avgSales;
		this.performanceGrade = performanceGrade;
	}
	public void addSales(double samt) {
		if(samt>=0) {
			total+=samt;
		}
		else {
			System.out.println("Entered Amount is not Valid");
		}
	}
	public void reCalculate(int count) {
		this.totalSales=total;
		this.avgSales=this.totalSales/count;
		if(this.avgSales>=0 && this.avgSales<500) {
			this.performanceGrade="Not satisfied";
		}
		else if(this.avgSales>=500 && this.avgSales<1000) {
			this.performanceGrade="Need Improvement";
		}
		else if(this.avgSales>=1000 && this.avgSales<2000) {
			this.performanceGrade="Satisfied";
		}
		else if(this.avgSales>=2000 && this.avgSales<3000) {
			this.performanceGrade="Good";
		}
		else if(this.avgSales>=3000){
			this.performanceGrade="Excellent";
		}
	}
	public void viewDetails() {
		profile();
		System.out.println("Total Sales : "+this.totalSales);
		System.out.println("Average Sales : "+this.avgSales);
		System.out.println("Performance Grade : "+this.performanceGrade);
	}
	
}

public class EmployeeSalesPerformanceSystem {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.print("Enter Employee Name : ");
		String ename=in.next();
		System.out.print("Enter Employee ID : ");
		int eid=in.nextInt();
		PerformanceEmployee pe=new PerformanceEmployee(ename, eid, 0, 0, "Not Declared");
		int opt=0,count=0;
		do {
			System.out.println("--------MENU---------");
			System.out.println("1. Add Sales");
			System.out.println("2. Recalculate Sales");
			System.out.println("3. View Profile Summary");
			System.out.println("4. Exit");
			System.out.println("Enter your choice [1-4]: ");
			opt=in.nextInt();
			switch(opt) {
			case 1: 
				System.out.println("Enter Sales Amount : ");
				int amt=in.nextInt();
				pe.addSales(amt);
				count++;
				break;
			case 2: 
				pe.reCalculate(count);
				System.out.println("ReCalculation Done Successfully");
				break;
			case 3:
				pe.viewDetails();
				break;
			case 4:
				System.out.println("Thank You");
				break;
			default:System.out.println("Invalid Choice");
			}
		}while(opt!=4);
		in.close();

	}

}
