package Methods;

public class Book {
	String bookTitle;
	String author;
	int isbn;
	public void addBookDetails(String BTitle,String Aname,int isbnum) {
		bookTitle=BTitle;
		author=Aname;
		isbn=isbnum;
	}
public String displayDetails() {
	return "Book Title : "+bookTitle+"\n"+"Author Name : "+author+"\n"+"ISBN : "+isbn;
}
public static void main(String[] args) {
	Book obj=new Book();
	obj.addBookDetails("Godfather","Kamal Hasan",1234);
	System.out.println(obj.displayDetails());
}
}
