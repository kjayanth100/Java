package Laderif;

public class MovieTheater {
	public double getTicketPrice(int age) {
		double d;
		if(age<5) {
			d=0.0;
		}
		else if(age>=5 && age<=12) {
			d=5.0;
		}
		else if(age>=13 && age<=60) {
			d=10.0;
		}
		else if(age>60) {
			d=5.0;
		}else {
			d=0.0;
		}
		return d;
	}
	public static void main(String[] args) {
		MovieTheater obj=new MovieTheater();
		System.out.println("$"+obj.getTicketPrice(18));
	}

}
