package Test;

public class Employeee {
		String name;
		double salary;
			public double increaseSalary(Employeee e){
			e.salary=e.salary+(e.salary*(0.10));
			return e.salary;
		}
		public static void main(String[] args){
		Employeee emp=new Employeee();
		emp.name="Teja";
		emp.salary=50000;
		emp.increaseSalary(emp);
		System.out.println("Updated Salary of "+emp.name+ " is:"+ emp.salary);
		}
			
}
