package com.setB;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num=in.nextInt();
		int fnum=0;
		int lnum=1;
		System.out.print("Fibonnaci Series : "+fnum+" "+lnum+" ");
		for(int i=1;i<=num-2;i++) {
			int temp=fnum+lnum;
			fnum=lnum;
			lnum=temp;
			System.out.print(temp+" ");
		}

	}

}
