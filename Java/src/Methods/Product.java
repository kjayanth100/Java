package Methods;

public class Product {
	String productName;
	int productID;
	int productPrice;
	public void addProductDetails(String pname,int pid,int pprice) {
		productName=pname;
		productID=pid;
		productPrice=pprice;
	}
	public String displayDetails() {
		return "Product Name : "+productName+"\n"+"Product ID : "+productID+"\n"+"Product Price : "+productPrice;
	}
	public static void main(String[] args) {
		Product obj=new Product();
		obj.addProductDetails("Cool Drink",123,25);
		System.out.println(obj.displayDetails());
	}

}
