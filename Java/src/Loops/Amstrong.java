package Loops;

public class Amstrong {
public int power(int base,int exp) {
	int power=1;
	for(int i=1;i<=exp;i++) {
		power=power*base;
	}
	return power;
}
public int Count(int num) {
	int count=0;
	while(num!=0) {
		count++;
		num/=10;
	}
	return count;
}
public boolean isAmstrong(int num) {
	int count=Count(num);//3
	int temp=num;
	int sum=0;
	while(num!=0) {
		int rem=num%10;
		sum=sum+power(rem,count);
		//   
		num/=10;
	}
	return temp==sum;
}
public static void main(String[] args) {
	boolean result=new Amstrong().isAmstrong(153);
	System.out.println((result)?"amstrong":"not amstrong");
}
//(or)
//	for(int i=1;i<=10000;i++) {
//		boolean result=new Amstrong().isAmstrong(i);
//		if(result) {
//			System.out.println(i);
//		}
//	}
//}
}
