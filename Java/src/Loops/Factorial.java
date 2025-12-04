package Loops;

public class Factorial {
public static void main(String[] args) {
	int num=4;
	int fact=1;
	for(int i=1;i<=num;i++){
		fact*=i;
//		int i=1;
//		while(i<=num) {
//			fact=fact*i;
//			i++;
//		}
		
	}
	System.out.println(fact);
}
}
