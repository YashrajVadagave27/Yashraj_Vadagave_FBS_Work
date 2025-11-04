class Product 
{
	int productId, price , quantity;
	String pname;

	void setProductID(int i){
		this.productId = i;
	}
	void setPrice(int p ){
		this.price = p;
	}
	void setQuantity(int q){
		this.quantity = q;
	}
	void setPname(String str){
		this.pname = str;
	}	
}//product ends here 

class TestProduct
{
	public static void main(String[] args)
	{
		Product p1;
		p1 = new Product();
		p1.setProductID(120112);
		p1.setPrice(120000);
		p1.setQuantity(24);
		p1.setPname("I-phone");
	System.out.println("Product id :"+p1.productId);
	System.out.println("Price is :"+p1.price);
	System.out.println("Quantity is :"+p1.quantity);
	System.out.println("Pname :"+p1.pname);
	}//main ends here 
}//TestProduct ends here 