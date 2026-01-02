package Inheritance.com.tasks;

class Person{
	public Person() {
		System.out.println("Person object created");
	}
}

class Student extends Person{
	public Student() {
		System.out.println("Student object created");
	}
}

public class Task3 {
	public static void main(String[] args) {
		Student s=new Student();
	}
}