package Test2;
//Q1. Arithmetic Operations Using Methods
//Write a Java program that defines an instance method to perform arithmetic operations (addition, subtraction, multiplication, division, and modulus) on two numbers and display the results. Emphasize how arithmetic operators work together to manipulate values.

public class Operators {
	public void Arthimetic() {
		int a=10;
		int b=15;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		new Operators().Arthimetic();
	}

}
