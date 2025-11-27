package p1;

public class A {
    protected void myfunA() {
        System.out.println("Inside A");
    }
}


class B extends A {
    void myfunB() {
        A ref = new A();
        ref.myfunA(); // allowed in same package
    }
}

class C {
    void myfunC() {
        A ref = new A();
        ref.myfunA(); // allowed in same package
    }
}