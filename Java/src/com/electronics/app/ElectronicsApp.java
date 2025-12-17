package com.electronics.app;

import com.electronics.devices.Laptop;
import com.electronics.brands.Manufacturer;

public class ElectronicsApp {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		Manufacturer m=new Manufacturer();
		l.setModel("Dell XPS 15");
		l.setPrice(1500.99);
		m.setBrandName("Dell");
		m.setCountry("USA");
		l.ShowlaptopDetails();
		System.out.println();
		m.showManufacturerDetails();
	}

}
