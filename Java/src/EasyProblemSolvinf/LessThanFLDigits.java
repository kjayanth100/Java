package EasyProblemSolvinf;
public class LessThanFLDigits {

	public static void main(String[] args) {

		int num=7845,count=0,first=0,last=0;
		int temp=num,temp1=num;
		boolean res=false;
		for(int i=1;i<=num;i++) {
			count++;
			num/=10;
		}
		for(int i=1;i<=count;i++) {
			int n=temp%10;
			if(i==1)
				first=n;
			else if(i==count)
				last=n;
			temp/=10;
		}
		for(int i=1;i<=count;i++) {
			int n=temp1%10;
			if(i!=1&&i!=count) {
				if(n<first && n<last)
					res=true;
			}
			temp1/=10;
		}
		System.out.println(res);
			

	}

}