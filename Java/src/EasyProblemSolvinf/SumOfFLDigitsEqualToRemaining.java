package EasyProblemSolvinf;
public class SumOfFLDigitsEqualToRemaining {

	public static void main(String[] args) {
		int num=765;
		int count=0,temp=num,sum1=0,sum2=0;
		for(int i=1;i<=num;i++) {
			count++;
			num/=10;
		}
		for(int i=1;i<=count;i++) {
			int n=temp%10;
			if(i==1||i==count) {
				sum1=sum1+n;
			}
			else {
				sum2=sum2+n;
			}
			temp/=10;
		}
		System.out.println((sum1==sum2)?"Equal":"!Equal");
	}
}