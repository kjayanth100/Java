package EasyProblemSolvinf;

public class Sumofdigit {

	public static void main(String[] args) {
		int num=101;
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num/=10;
		}
		System.out.println(sum);
	}
//	int num=101;
//	int sum=0;
//	while(num!=0) {
//		sum=sum+num%10;
//		num/=10;
//	}
//	System.out.println(sum);
//}

}
