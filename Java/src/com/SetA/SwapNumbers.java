package com.SetA;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int num1=in.nextInt();
		System.out.print("Enter Number 2 : ");
		int num2=in.nextInt();
		System.out.println("---Before Swapping----");
		System.out.println("Num1 = "+num1+" Num2 = "+num2);
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("----After Swapping-----");
		System.out.println("Num1 = "+num1+" Num2 = "+num2);

	}

}