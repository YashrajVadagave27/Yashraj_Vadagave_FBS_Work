class Book extends Object {
    String ISBN;
    String bName;
    String category;
    double price;

    // Default Constructor
    Book() {
        System.out.println("Constructor called");
        this.ISBN = "978-93-325-1234-7";
        this.bName = "Chava";
        this.category = "Novel";
        this.price = 299.00;
    }

    // Parameterized Constructor
    Book(String i, String b, String c, double p) {
        System.out.println("Parameterized constructor called");
        this.ISBN = i;
        this.bName = b;
        this.category = c;
        this.price = p;
    }

    // Setter Methods
    void setISBN(String i) {
        this.ISBN = i;
    }

    void setBName(String b) {
        this.bName = b;
    }

    void setCategory(String s) {
        this.category = s;
    }

    void setPrice(double p) {
        this.price = p;
    }

    // Getter Methods
    String getISBN() {
        return this.ISBN;
    }

    String getBName() {
        return this.bName;
    }

    String getCategory() {
        return this.category;
    }

    double getPrice() {
        return this.price;
    }
    
    public String toString() {
    	return "\nISBN : "+this.ISBN+"\nBook Name : "+this.bName+"\nCategory : "+this.category+"\nPrice : "+this.price; 
    }
} // Book class ends here


class TestBook {
    public static void main(String[] args) {
    	Object b = new Book();
    	
    	System.out.println(b);
    	System.out.println(b.toString());
    } // main ends here
} // TestBook ends here
