abstract class Shape {
    String color;
    double area;
    static int sCount = 0;
    Shape() {
        System.out.println("Shape Default Constructor Called");
        this.color = "Red";
        this.area = 0.0;
        sCount++;
    }

    Shape(String color) {
        System.out.println("Shape Parameterized Constructor Called");
        this.color = color;
        this.area = 0.0;
        sCount++;
    }

    String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}
	
	static int getsCount() {
		return sCount;
	}
	
	abstract void calArea();
	
	void display() {
        System.out.println("Color: " + this.color);
    }
}//shape ends here

class Triangle extends Shape {
    double base, height;

    Triangle() {
        super();
        System.out.println("Triangle Default Constructor Called");
        this.base = 10;
        this.height = 5;
        this.area = 0.5 * base * height;
    }

    Triangle(String color, double base, double height) {
        super(color);
        System.out.println("Triangle Parameterized Constructor Called");
        this.base = base;
        this.height = height;
        this.area = 0.5 * base * height;
    }

    double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}
	
	void calArea() {
        System.out.println("Area is Triangle : "+this.area);
    }
	
	void display() {
        super.display();
        System.out.println("Base: " + this.base);
        System.out.println("Height: " + this.height);
        System.out.println();
    }
}//triangle ends here

class Rectangle extends Shape {
    double length, width;

    Rectangle() {
        super();
        System.out.println("Rectangle Default Constructor Called");
        this.length = 10;
        this.width = 5;
        this.area = length * width;
    }

    Rectangle(String color, double l, double w) {
        super(color);
        System.out.println("Rectangle Parameterized Constructor Called");
        this.length = l;
        this.width = w;
        this.area = l * w;
    }

    double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getWidth() {
		return width;
	}

	void setWidth(double width) {
		this.width = width;
	}
	
	void calArea() {
        System.out.println("Area is Rectangle : "+this.area);
    }
	
	void display() {
        super.display();
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println();
    }
}//rectangle ends here

class Circle extends Shape {
    double radius;

    Circle() {
        super();
        System.out.println("Circle Default Constructor Called");
        this.radius = 7;
        this.area = 3.14 * radius * radius;
    }

    Circle(String color, double radius) {
        super(color);
        System.out.println("Circle Parameterized Constructor Called");
        this.radius = radius;
        this.area = 3.14 * radius * radius;
    }

    double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	void calArea() {
        System.out.println("Area is Circle : "+this.area);
    }
	
	void display() {
        super.display();
        System.out.println("Radius: " + this.radius);
        System.out.println();
    }
}//circle ends here

class ShapeMain {
    public static void main(String[] args) {
    	Shape s;
    	
        s = new Triangle();
        s.display();
        s.calArea();

        s = new Rectangle("Blue", 8, 4);
        s.display();
        s.calArea();

        s = new Circle("Green", 5);
        s.display();
        s.calArea();
        
        System.out.println("Total Shape Count: " + Shape.getsCount());
    }//main ends here
}//ShapeMain ends here
