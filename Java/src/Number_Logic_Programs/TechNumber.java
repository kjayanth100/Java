package Number_Logic_Programs;

public class TechNumber {
	public static boolean isTech(int num) {
		int count=0,temp=num,div=1;
		while(num!=0) {
			count++;
			num/=10;
		}
		for(int i=1;i<=count/2;i++) {
			div*=10;
		}
		if(div==num) {
			return false;
		}
		int left=temp/div;
		int right=temp%div;
		int sum=left+right;
		sum*=sum;
		return sum==temp;
		}
	public static void main(String[] args) {
//		if(isTech(2025)) {
//			System.out.println("Tech");
//		}else {
//			System.out.println("!Tech");
//		}
		for(int i=1;i<=100;i++) {
			if(isTech(i)) {
				System.out.println(i);
			}
		}
	}

}
