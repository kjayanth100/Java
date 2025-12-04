package Loops;

public class Neon {
public boolean N(int num) {
	int square=num*num;
	int temp=num;
	int sum=0;
	while(square!=0) {
		sum=sum+square%10;
		square/=10;
	}
	return sum==temp;
}

	public static void main(String[] args) {
//		boolean result=new Neon().N(9);
//		System.out.println(result?"neon":"not neon");
//		(or)
		for(int i=1;i<=100;i++) {
			boolean result=new Neon().N(i);
			if(result) {
				System.out.println(i);
			}
		}
//		(or)
//		int num=9;
//			int square=num*num;
//			int sum=0;
//			while(square!=0) {
//				sum=sum+square%10;
//				square/=10;
//			}
//		System.out.println((num==sum)?"neon":"not neon");
//}
	}
}