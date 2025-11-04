class Complex {
    int real, imag;

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
} // Complex ends here

class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.setReal(5);
        c1.setImag(3);

        c1.display();
    } // main ends here
} // TestComplex ends here
