package EasyProblemSolvinf;
public class LessThanFLDigits {

	public static void main(String[] args) {
		int num=898,temp1=num,temp2=num,sum=0,count=0;
		int first=0,last=0;
		boolean result=false;
		for(int i=1;i<=num;i++) {
			count++;
			num/=10;
		}
		for(int i=1;i<=count;i++) {
			int n=temp1%10;
			if(i==1) {
				last=n;
			}
			else if(i==count) {
				first=n;
			}temp1/=10;
		}       
		for(int i=1;i<=count;i++) {
			int n=temp2%10;
			if(i!=1&&i!=count) {
				if(n<first&&n<last) {
				result=true;
			}
			}
			temp2/=10;
		}
		System.out.println(result);
	}
}