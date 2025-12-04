package EasyProblemSolvinf;

public class ReverseofNumber {

	public static void main(String[] args) {
		int num=721;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}System.out.println(rev);
	}
//	int num=765;
//	int rev=0;
//	while(num!=0) {
//		rev=rev*10+num%10;
//		num/=10;
//	}System.out.println(rev);
//}
}