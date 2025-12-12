package Loops;

public class HarshadNumber {
	public boolean Harshad(int num) {
		int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		return (temp%sum==0);
	}
	public static void main(String[] args) {
		System.out.println((new HarshadNumber().Harshad(24))?"Harshad Number":"!Harshad Number");
	}

}
