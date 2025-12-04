package Test2;
//Q3. Square and Cube Finder
//Design a Java program with two instance methods—one to find the square and another to find the cube of a given number. Focus on demonstrating how different instance methods can perform unique tasks within the same class.

public class SquarenCube {
	public int square() {
		int a=10;
		return a*a;
	}
	public void cube() {
		System.out.println((square()*a));
	}
	public static void main(String[] args) {
		SquarenCube obj=new SquarenCube();
		obj.square();
		obj.cube();
	}

}
