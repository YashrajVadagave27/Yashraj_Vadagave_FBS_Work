class Complex extends Object {
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
    
    public String toString() {
    	return "\nComplex Number : "+this.real+" + "+this.imag;
    }
} // Complex class ends here


class TestComplex {
    public static void main(String[] args) {
    	Object c = new Complex();
    	
    	System.out.println(c);
    	System.out.println(c.toString());
    	
    } // main ends here
} // TestComplex ends here
