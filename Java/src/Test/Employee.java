package Test;

public class Employee {
	String name;
	int age;
	public void displayInfo() {
		System.out.println("Employee Name:"+name);
		System.out.println("Age:"+age);
	}
public static void main(String[] args) {
	Employee obj=new Employee();
	obj.name="Jai";
	obj.age=21;
	obj.displayInfo();
}
}
