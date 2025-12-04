package Methods;

public class Car {
	String carMake;
	String carModel;
	int manufacturingYear;
	public void addCarDetails(String cmake,String cmodel,int myear){
		carMake=cmake;
		carModel=cmodel;
		manufacturingYear=myear;
	}
	public String displayDetails(){
		return "Car Make : "+carMake+"\n"+"Car Model : "+carModel+"\n"+"Manufacturing Year : "+manufacturingYear;
	}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.addCarDetails("Toyota","XYZ",2002);
		System.out.println(obj.displayDetails());

	}

}
