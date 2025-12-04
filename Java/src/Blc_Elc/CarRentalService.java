package Blc_Elc;

public class CarRentalService {

	public static void main(String[] args) {
		Car obj1=new Car();
		Car obj2=new Car();
		obj1.setcarId(23);
		obj1.setbrand("TATA");
		obj1.setmodel("xyz");
		obj1.setrentalPricePerDay(10000);
		System.out.println("Car ID : "+obj1.getcarId());
		System.out.println("Brand : "+obj1.getbrand());
		System.out.println("Model : "+obj1.getmodel());
		System.out.println("rentalPricePerDay : "+obj1.getrentalPricePerDay());
		System.out.println("-----------------------------");
		obj2.setcarId(40);
		obj2.setbrand("Hyundai");
		obj2.setmodel("gdz");
		obj2.setrentalPricePerDay(15000);
		System.out.println("Car ID : "+obj2.getcarId());
		System.out.println("Brand : "+obj2.getbrand());
		System.out.println("Model : "+obj2.getmodel());
		System.out.println("rentalPricePerDay : "+obj2.getrentalPricePerDay());
	}

}
