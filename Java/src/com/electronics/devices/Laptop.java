package com.electronics.devices;

public class Laptop {
	private String model;
	private double price;
	public void setModel(String mdl) {
		model=mdl;
	}
	public String getModel() {
		return model;
	}
	public void setPrice(double pri) {
		price=pri;
	}
	public double getPrice() {
		return price;
	}
	public void ShowlaptopDetails() {
		System.out.println("Laptop Model: " + model); 
		System.out.println("Price: $" + price); 
	}
}
