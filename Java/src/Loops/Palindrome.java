package Loops;
	
public class Palindrome {
public static void main(String[] args) {
	int num=121;
	int temp=num;
	int sum=0;
	while(num!=0) {
		int rem=num%10;
		sum=sum*10+rem;
		num/=10;
	}
		if(sum==temp) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("It is not Palindrome");
		}
}
}