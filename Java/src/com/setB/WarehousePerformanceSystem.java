package com.setB;

import java.util.Scanner;

class StockHandler{
	private String handName;
	private String handId;
	
	public StockHandler(String handName, String handId) {
		this.handName = handName;
		this.handId = handId;
	}

	public void profile() {
		System.out.println("------Performance Summary-----");
		System.out.println("Handler Name : "+this.handName);
		System.out.println("Handler ID : "+this.handId);
	}
}

class StockPerformance extends StockHandler{
	private double totalStock;
	private double avgStock;
	private String handlingGrade;
	int total=0;
		public StockPerformance(String handName, String handId, double totalStock, double avgStock, String handlingGrade) {
		super(handName, handId);
		this.totalStock = totalStock;
		this.avgStock = avgStock;
		this.handlingGrade = handlingGrade;
	}
	public void addStock(double sqty) {
		if(sqty>=0) {
			total+=sqty;
		}
		else {
			System.out.println("Entered Amount is not Valid");
		}
	}
	public void reCalculate(int count) {
		this.totalStock=total;
		this.avgStock=this.totalStock/count;
		if(this.avgStock>=0 && this.avgStock<10) {
			this.handlingGrade="Not satisfied";
		}
		else if(this.avgStock>=10 && this.avgStock<20) {
			this.handlingGrade="Need Improvement";
		}
		else if(this.avgStock>=20 && this.avgStock<40) {
			this.handlingGrade="Satisfied";
		}
		else if(this.avgStock>=40 && this.avgStock<70) {
			this.handlingGrade="Efficient";
		}
		else if(this.avgStock>=70){
			this.handlingGrade="Excellent";
		}
	}
	public void viewDetails() {
		profile();
		System.out.println("Total Stock Handled : "+this.totalStock);
		System.out.println("Average Stock Per Entry : "+this.avgStock);
		System.out.println("Handling Grade : "+this.handlingGrade);
	}
	
}

public class WarehousePerformanceSystem {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.print("Enter Handler Name : ");
		String hname=in.next();
		System.out.print("Enter Handler ID : ");
		String hid=in.next();
		StockPerformance pe=new StockPerformance(hname, hid, 0, 0, "Not declared");
		int opt=0,count=0;
		do {
			System.out.println("--------MENU---------");
			System.out.println("1. Add Stock");
			System.out.println("2. Recalculate Result");
			System.out.println("3. View Profile Summary");
			System.out.println("4. Exit");
			System.out.println("Enter your choice [1-4]: ");
			opt=in.nextInt();
			switch(opt) {
			case 1: 
				System.out.println("Enter Stock Quantity : ");
				int qty=in.nextInt();
				pe.addStock(qty);
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