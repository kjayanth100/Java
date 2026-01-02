package Inheritance.com.tasks;

class Vehicle{
	public void run() {
		System.out.println("Vehicle is Running");
	}
}

class Car extends Vehicle{
	public void speed() {
		System.out.println("Car is moving at 80 km/h");
	}
}

public class Task2 {
	public static void main(String[] args) {
		Car c=new Car();
		c.run();
		c.speed();
	}

}