import java.util.Scanner;
class Book {
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

    // Display Method
    void display() {
        System.out.println("Book Details:");
        System.out.println("ISBN       : " + getISBN());
        System.out.println("Book Name  : " + getBName());
        System.out.println("Category   : " + getCategory());
        System.out.println("Price      : " + getPrice());
        
    }
} // Book class ends here


class TestBook {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        Book b1 = new Book(); // Calls default constructor
        b1.display();
	
	System.out.println("Enter ISBN: ");
	String a = sc.next();
	
	System.out.println("Enter Book Name: ");
	String b = sc.next();

	System.out.println("Enter Price: ");
	double d = sc.nextDouble();

	sc.nextLine();
	System.out.println("Enter Category: ");
	String c = sc.nextLine();

        Book b2 = new Book(a, b, c, d); // Calls parameterized constructor
        b2.display();
    } // main ends here
} // TestBook ends here
