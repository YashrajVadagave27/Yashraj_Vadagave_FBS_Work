class Product {
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

    // Display Method
    void display() {
        System.out.println("Product Details:");
        System.out.println("Product ID : " + getProductID());
        System.out.println("Price      : " + getPrice());
        System.out.println("Quantity   : " + getQuantity());
        System.out.println("Name       : " + getPname());
        
    }
} // Product class ends here


class TestProduct {
    public static void main(String[] args) {
	Product[] b = new Product[3];
        b[0] = new Product();  
      	b[1] = new Product(120113, 95000, 10, "Samsung Galaxy");
	b[2] = new Product();
       	for(int i=0;i<b.length;i++)
	{
		b[i].display();
	}
    
    } // main ends here
} // TestProduct ends here
