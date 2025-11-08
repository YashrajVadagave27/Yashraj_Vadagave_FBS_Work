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
	Complex[] b = new Complex[3];
        b[0] = new Complex();  
      	b[1] = new Complex(7,9);
	b[2] = new Complex();
       	for(int i=0;i<b.length;i++)
	{
		b[i].display();
	}
        
    } // main ends here
} // TestComplex ends here
