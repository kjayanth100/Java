package Blc_Elc;

public class PayrollSystem {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setemployeeId(1234);
		obj.setemployeeName("Jai");
		obj.setsalary(25000);
		System.out.println("Employee ID :"+obj.getemployeeId());
		System.out.println("Employee Name : "+obj.getemployeeName());
		System.out.println("Employee Salary : "+obj.getsalary());
		System.out.println("----------------------");
		obj.setsalary(30000);
		System.out.println("Updated Employee Salary : "+obj.getsalary());
	}

}
