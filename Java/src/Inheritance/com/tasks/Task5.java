package Inheritance.com.tasks;

class Computer{
	public void showBrand() {
		System.out.println("Brand: Dell");
	}
}

class Laptop extends Computer{
	public void showModel() {
		System.out.println("Model: XPS 15");
	}
}

public class Task5 {
	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.showBrand();
		l.showModel();
	}

}