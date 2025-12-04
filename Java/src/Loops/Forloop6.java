package Loops;

public class Forloop6 {

	  public void EvenorOdd() {
		  String Evennumbers=" ";
		  String Oddnumbers=" ";
		  for(int i=1;i<=200;i++) {
			  if(i%2==0) {
				  Evennumbers+=i+" ";
			  }else {
				  Oddnumbers+=i+" ";
			  }
		  }
		  System.out.println("EVEN: " +Evennumbers);
		  System.out.println("ODD: " +Oddnumbers);
	  }
public static void main(String[] args) {
	Forloop6 obj=new Forloop6();
	obj.EvenorOdd();
}
}
