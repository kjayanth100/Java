package JavaTasks;

public class SumAvg {
	static int Sum(int a,int b){
		System.out.println(a+b);
		return (a+b);
	}
	static int Avg(int a, int b) {
		return Sum(a,b)/2;
	}
	

	public static void main(String[] args) {
		System.out.println(Avg(20,30));
		

	}

}
