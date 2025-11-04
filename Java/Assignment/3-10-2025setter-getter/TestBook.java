class Book {
    String ISBN;
    String bName;
    String category;
    double price;

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
} // Book ends here


class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setISBN("978-93-325-1234-7");
        b1.setBName("Chava");
        b1.setCategory("Novel");
        b1.setPrice(299.00);

        System.out.println("ISBN NO IS : " + b1.getISBN());
        System.out.println("BOOK NAME  : " + b1.getBName());
        System.out.println("CATEGORY   : " + b1.getCategory());
        System.out.println("PRICE      : " + b1.getPrice());
    } // main ends here
} // TestBook ends here
