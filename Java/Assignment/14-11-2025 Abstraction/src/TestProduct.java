class Product extends Object {
    int productId, price, quantity;
    String pname;

    // Default Constructor
    Product() {
        System.out.println("Constructor called");
        this.productId = 120112;
        this.price = 120000;
        this.quantity = 24;
        this.pname = "I-Phone";
    }

    // Parameterized Constructor
    Product(int id, int p, int q, String name) {
        System.out.println("Parameterized constructor called");
        this.productId = id;
        this.price = p;
        this.quantity = q;
        this.pname = name;
    }

    // Setter Methods
    void setProductID(int i) {
        this.productId = i;
    }

    void setPrice(int p) {
        this.price = p;
    }

    void setQuantity(int q) {
        this.quantity = q;
    }

    void setPname(String str) {
        this.pname = str;
    }

    // Getter Methods
    int getProductID() {
        return this.productId;
    }

    int getPrice() {
        return this.price;
    }

    int getQuantity() {
        return this.quantity;
    }

    String getPname() {
        return this.pname;
    }
    
    public String toString() {
    	return "\nProduct ID : "+this.productId+"\nPrice : "+this.price+"\nQuantity : "+this.quantity+"Product Name : "+this.pname;
    }

} // Product class ends here


class TestProduct {
    public static void main(String[] args) {
    	Object c = new Complex();
    	
    	System.out.println(c);
    	System.out.println(c.toString());
  
    } // main ends here
} // TestProduct ends here
