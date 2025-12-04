package Test;

public class Student {
	String name;
	public void greet() {
		System.out.println("Hello "+name);
	}
public static void main(String[] args) {
	Student obj=new Student();
	obj.name="Jai";
			obj.greet();
}
}
