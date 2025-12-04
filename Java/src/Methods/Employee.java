package Methods;

public class Employee {
	String employeeName;
	int employeeId;
	double employeeSalary;
	public void addEmployeeDetails(String empName,int empId,double empSalary) {
		employeeName=empName;
		employeeId=empId;
		employeeSalary=empSalary;
	}
	public String displayDetails() {
		return "EmployeeName :" +employeeName +"\n"+" EmployeeID: "+employeeId +"\n"+" EmployeeSalary : "+employeeSalary;
	}
	public static void main(String[] args) {
	Employee obj=new Employee();
	obj.addEmployeeDetails("Jai",542,30000);
	System.out.println(obj.displayDetails());

	}

}
