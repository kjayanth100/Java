package com.Problemsolving;

import java.util.Scanner;
public class DuckNumber {


		public static void main(String[] args) {
			
			Scanner in=new Scanner(System.in);
			System.out.print("Enter a number : ");
			String num=in.next();
			if(num.charAt(0)=='0') {
				System.out.println(num+" is Not a Duck Number");
			}
			else if(num.contains("0")) {
				System.out.println(num+" is a Duck Number");
			}
			else {
				System.out.println(num+" is not a Duck Number");
			}

		}


}
