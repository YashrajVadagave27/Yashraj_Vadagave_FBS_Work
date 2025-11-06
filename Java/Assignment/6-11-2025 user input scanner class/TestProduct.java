import java.util.Scanner;

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
        System.out.println("\nProduct Details:");
        System.out.println("Product ID : " + getProductID());
        System.out.println("Price      : " + getPrice());
        System.out.println("Quantity   : " + getQuantity());
        System.out.println("Name       : " + getPname());
    }
} // Product class ends here


class TestProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default constructor
        Product p1 = new Product();
        p1.display();

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Price: ");
        int price = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        Product p2 = new Product(id, price, quantity, name);
        p2.display();

    } // main ends here
} // TestProduct ends here
