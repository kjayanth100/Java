package Inheritance.com.tasks;

class Employee{
	double salary=50000;
}

class Manager extends Employee{
	double bonus=20000;
}

public class Task4 {
	public static void main(String[] args) {
		Manager m=new Manager();
		System.out.println("Total Salary : "+(m.salary+m.bonus));
	}

}
