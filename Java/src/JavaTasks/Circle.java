package JavaTasks;
public class Circle {
	static int r=5;
	public static void area() {
	    double area=3.14*r*r;
		System.out.println(area);
	}
	public static void perimeter(){
		 double perimeter=2*3.14*r;
		System.out.println(perimeter);
	}
public static void main(String[] args) {
	area();
	perimeter();
		
	}

}