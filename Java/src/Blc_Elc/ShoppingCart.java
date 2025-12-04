package Blc_Elc;

public class ShoppingCart {

	public static void main(String[] args) {
		Product obj1=new Product();
		Product obj2=new Product();
		obj1.setproductId(100);
		obj1.setproductName("Buds");
		obj1.setprice(899.9);
		obj1.setquantity(1);
		
		System.out.println("Product ID : "+obj1.getproductId());
		System.out.println("Product Name : "+obj1.getproductName());
		System.out.println("Price : "+obj1.getprice());
		System.out.println("Quantity : "+obj1.getquantity());
		System.out.println("------------------------------");
		obj2.setproductId(100);
		obj2.setproductName("Buds");
		obj2.setprice(899.9);
		obj2.setquantity(3);
		System.out.println("Product ID : "+obj2.getproductId());
		System.out.println("Product Name : "+obj2.getproductName());
		System.out.println("Price : "+obj2.getprice());
		System.out.println("Quantity : "+obj2.getquantity());
	}

} 
