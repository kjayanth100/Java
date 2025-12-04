package Test;

public class App {
	String name;
	int usagecount;
	public int openApp() {
		usagecount=usagecount+1;
		return usagecount;
	}
	public void display() {
		System.out.println("App Name: " +name);
		System.out.println("UsageCount: "+openApp());
	}
	public static void main(String[] args) {
		App obj=new App();
		obj.name="JAI";
		obj.openApp();
		obj.openApp();
		obj.display();
	}

}
