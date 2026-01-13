package com.SetA;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=in.nextInt();
		boolean flag=true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				flag=false;
			}
		}
		System.out.println((flag==true)?"Prime Number":"Not a Prime Number");

	}

}
