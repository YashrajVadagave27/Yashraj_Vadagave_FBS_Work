class Shape {

    // Area of Triangle
    void area(double base, double height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }

    // Area of Rectangle
    void area(int length, int breadth) {
        int result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }

    // Area of Circle
    void area(double radius) {
        double result = 3.14159 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
} // Shape ends here


class Triangle {
    double base, height;

    void setDimensions(double b, double h) {
        base = b;
        height = h;
    }
} // Triangle ends here


class Rectangle {
    int length, breadth;

    void setDimensions(int l, int b) {
        length = l;
        breadth = b;
    }
} // Rectangle ends here


class Circle {
    double radius;

    void setDimensions(double r) {
        radius = r;
    }
} // Circle ends here


class TestShape {
    public static void main(String[] args) {

        Shape s = new Shape();

        // Triangle
        Triangle t = new Triangle();
        t.setDimensions(10.0, 5.0);
        s.area(t.base, t.height);

        // Rectangle
        Rectangle r = new Rectangle();
        r.setDimensions(8, 6);
        s.area(r.length, r.breadth);

        // Circle
        Circle c = new Circle();
        c.setDimensions(7.0);
        s.area(c.radius);
    } // main ends here
} // TestShape ends here
