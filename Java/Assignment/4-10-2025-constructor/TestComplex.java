class Complex {
    int real, imag;

    // Default Constructor
    Complex() {
        System.out.println("Constructor called");
        this.real = 5;
        this.imag = 3;
    }

    // Parameterized Constructor
    Complex(int r, int i) {
        System.out.println("Parameterized constructor called");
        this.real = r;
        this.imag = i;
    }

    // Setter Methods
    void setReal(int r) {
        this.real = r;
    }

    void setImag(int i) {
        this.imag = i;
    }

    // Getter Methods
    int getReal() {
        return this.real;
    }

    int getImag() {
        return this.imag;
    }

    // Display Method
    void display() {
        System.out.println("Complex Number: " + getReal() + " + " + getImag() + "i");
    }
} // Complex class ends here


class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(); // Calls default constructor
        c1.display();

        Complex c2 = new Complex(7, 9); // Calls parameterized constructor
        c2.display();
    } // main ends here
} // TestComplex ends here
