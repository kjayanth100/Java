package Blc_Elc_passingobj;

public class Employee {
	int empid;
	String empName;
	double empSalary;
	public int getempid() {
		return empid;
	}
	public void setempid(int id) {
		empid=id;
	}
	public String getempName() {
		return empName;
	}
	public void setempName(String name) {
		empName=name;
	}
	public double getempSalary() {
		return empSalary;
	}
	public void setempSalary(double sal) {
		empSalary=sal;
	}
	public static Employee getEmployeeDetails(int empid,String empName,double empSalary) {
		Employee emp=new Employee();
		
		emp.setempid(empid);
		emp.setempName(empName);
		emp.setempSalary(empSalary);
		return emp;
	}	
}