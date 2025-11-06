import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);

        // Default constructor
        Complex c1 = new Complex();
        c1.display();

        System.out.print("Enter real part: ");
        int real = sc.nextInt();

        System.out.print("Enter imaginary part: ");
        int imag = sc.nextInt();

        Complex c2 = new Complex(real, imag);
        c2.display();

        
    } // main ends here
} // TestComplex ends here
