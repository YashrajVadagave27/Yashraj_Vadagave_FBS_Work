class Product {
    int productId, price, quantity;
    String pname;

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

        Product p1 = new Product();
        p1.setProductID(120112);
        p1.setPrice(120000);
        p1.setQuantity(24);
        p1.setPname("I-Phone");
        p1.display();

    } // main ends here
} // TestProduct ends here
