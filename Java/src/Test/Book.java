package Test;

public class Book {
	String title;
	int pages;
	public void displayBook() {
		System.out.println("Book Title:"+title);
		System.out.println("Pages:"+pages);
	}
public static void main(String[] args) {
	Book obj=new Book();
	obj.title="Java Basics";
	obj.pages=120;
	obj.displayBook();
}

}
