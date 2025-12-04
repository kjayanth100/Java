package Blc_Elc_passingobj;

public class Company {

	public static void main(String[] args) {
		Employee e=Employee.getEmployeeDetails(43,"Jai",45000);
		System.out.println("Employee ID: "+e.empid);
		System.out.println("Employee Name: "+e.empName);
		System.out.println("Employee Salary: "+e.empSalary);
	}
}
