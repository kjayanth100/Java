package Loops;
	
public class PrimeNumber {
	public boolean isPrime(int num) {
//	public boolean isPrime(int num) {
//		int count=0;
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//				count++;
//			}
//		}
//		return count==2;
//	}
//		int count=0;
//		for(int i=2;i<num;i++) {
//			if(num%i==0) {
//				return false;
//			}
//			System.out.println(i);
//		}
//		return true;
//	}
		if(num<=1) {
			return false;
		}
		for(int i=2;i<(int)Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
//			System.out.println(i);
		}
		return true;
	}
	public static void main(String[] args) {
	PrimeNumber obj=new PrimeNumber();
//	System.out.println((obj.isPrime(143))?"Prime":"!Prime");
	for(int i=1;i<=100;i++) {
		if(obj.isPrime(i)) {
			System.out.println(i);
		}
	}

	}

}
