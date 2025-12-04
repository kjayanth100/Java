package GetSet;

public class Employee {
String empname,empdesg;
double empsalary;
int empid;
public String getempname() {
	return empname;
}
public void setempname(String name) {
	empname=name;
}
public String getempdesg() {
	return empdesg;
}
public void setempdesg(String desg) {
	empdesg=desg;
}
public double getempsalary() {
	return empsalary;
}
public void setempsalary(double salary) {
	empsalary=salary;
}
public int getempid() {
	return empid;
}
public void setempid(int id) {
	empid=id;
}
	public static void main(String[] args) {
	Employee obj=new Employee();
	obj.setempname("Jai");
	System.out.println("Employee Name : "+obj.getempname());
	obj.setempdesg("Developer");
	System.out.println("Employee desg : "+obj.getempdesg());
	obj.setempsalary(30000);
	System.out.println("Employee Salary : "+obj.getempsalary());
	obj.setempid(542);
	System.out.println("Employee ID : "+obj.getempid());
	}

}
