package com.setB;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num=in.nextInt();
		int temp1=num,temp2=num,count=0,sum=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		while(temp1!=0) {
			int rem=temp1%10;
			sum+=Math.pow(rem, count);
			temp1/=10;
		}
		System.out.println((temp2==sum)?"Armstrong Number":"Not a Armstrong Number");

	}

}