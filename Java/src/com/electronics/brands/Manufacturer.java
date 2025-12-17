package com.electronics.brands;

public class Manufacturer {
	private String brandName;
	private String Country;
	public void setBrandName(String bName) {
		brandName=bName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setCountry(String cny) {
		Country=cny;
	}
	public String getCountry() {
		return Country;
	}
	public void showManufacturerDetails() {
		System.out.println("Brand Name: "+brandName);
		System.out.println("Country of Origin: "+Country);
	}
}
