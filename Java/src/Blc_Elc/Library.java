package Blc_Elc;

public class Library {

	public static void main(String[] args) {
		Book obj1=new Book();
		Book obj2=new Book();
		obj1.setbookId(4234);
		obj1.settitle("Good");
		obj1.setauthor("jai");
		obj1.setprice(99);
		System.out.println("Book ID : "+obj1.getbookId());
		System.out.println("Book Title : "+obj1.gettitle());
		System.out.println("Author : "+obj1.getauthor());
		System.out.println("Price : "+obj1.getprice());
		System.out.println("---------------------------");
		obj1.setbookId(4456);
		obj1.settitle("Morning");
		obj1.setauthor("Bablu");
		obj1.setprice(999);
		System.out.println("Book ID : "+obj1.getbookId());
		System.out.println("Book Title : "+obj1.gettitle());
		System.out.println("Author : "+obj1.getauthor());
		System.out.println("Price : "+obj1.getprice());
	}

}
