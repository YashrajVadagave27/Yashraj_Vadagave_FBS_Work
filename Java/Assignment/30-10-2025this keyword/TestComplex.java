class Complex
{
    int real, imag;

    void setReal(int r){
        this.real = r;
    }

    void setImag(int i){
        this.imag = i;
    }

} // Complex ends here

class TestComplex
{
    public static void main(String[] args)
    {
        Complex c1;
        c1 = new Complex();
        c1.setReal(5);
        c1.setImag(3);

        System.out.println("Complex Number: " + c1.real + " + " + c1.imag + "i");


    } // main ends here
} // TestComplex ends here
