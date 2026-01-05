package com.Problemsolving;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int div=1;
		int num=in.nextInt();
		int temp=num;
		int square=num*num;
		for(int i=1;i<=num;i++) {
			div*=10;
			num/=10;
		}
		if((square%div)==temp) {
			System.out.println("It is an Automorphic Number");
		}
		else {
			System.out.println("It is not an Automorphic Number");
		}
	}

}