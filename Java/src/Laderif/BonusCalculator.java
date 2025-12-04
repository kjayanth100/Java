package Laderif;

public class BonusCalculator {
	public double calculateBonus(int experience,int rating,double salary) {
		double d;
		if(experience>=5 && rating>=9) {
			d=(50/100.0)*salary;
		}
		else if((experience>=3 && experience<=5)&&(rating>=7 && rating<=9)){
			d=(30/100.0)*salary;
		}else if((experience>=1 && experience<=3)&&(rating>=5 && rating<=7)){
			d=(10/100.0)*salary;
		}
		else {
			d=0;
		}
		return d;
	}
	public static void main(String[] args) {
		double result=new BonusCalculator().calculateBonus(4, 8, 30000);
		System.out.println(result);
	}
}
