package JavaTasks;

public class Instance {
	boolean b;
	int i;
	String st;
	public String getData(boolean b1,int i1,String st1) {
		b=b1;
		i=i1;
		st=st1;
		return "Successfully Updated";
	}

	public static void main(String[] args) {
		Instance obj1=new Instance();
		Instance obj2=new Instance();
		String value=obj1.getData(true, 34, "JAVA");
		obj2.getData(false,45, "SPRING");
		System.out.println(obj1.st+" "+obj2.st);
		System.out.println(lvalue);
		

	}

}
