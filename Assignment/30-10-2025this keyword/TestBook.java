class Book
{
	  String ISBN;
  	  String bName;
  	  String category;
	 double price;

	void setISBN(String i){
		this.ISBN = i;
	}
	void setBName(String b){
		this.bName = b;
	}
	void setCategory(String s){
		this.category = s;
	}
	void setPrice(double p){
		this.price = p;
	}
}// book ends here 

class TestBook
{
	public static void main(String[] args)
	{
		Book b1; 
		b1 = new Book();
		
		   b1.setISBN("978-93-325-1234-7");
		   b1.setBName("Chava");
     		   b1.setCategory("Novel");
     		   b1.setPrice(299.00);

	System.out.println("ISBN NO IS : " + b1.ISBN);
	System.out.println("BOOK N IS : " + b1.bName);
	System.out.println("Category IS : " + b1.category);
	System.out.println("Price is : " + b1.price);
	} //main ends here 
}//test book information store here 