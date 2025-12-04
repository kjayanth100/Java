package Blc_Elc;

public class Book {
	int bookId;
	String title;
	String author;
	double price;
	public int getbookId() {
		return bookId;
	}
	public void setbookId(int id) {
		bookId=id;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String tit) {
		title=tit;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String auth) {
		author=auth;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double pri) {
		price=pri;
	}
}
