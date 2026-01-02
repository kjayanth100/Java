package Inheritance.com.tasks;


	class Animal{
		public void display() {
			System.out.println("This is an Animal");
		}
	}

	class Dog extends Animal {
		
	}

	public class Task1 {
		public static void main(String[] args) {
			Dog d=new Dog();
			d.display();
		}
		
	}

