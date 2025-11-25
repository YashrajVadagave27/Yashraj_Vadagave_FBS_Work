interface Racer1 {
    void race1();
}
//interface racer1 ends here

interface Product1 {
    void buy1();
    void sell1();
}
//interface product1 ends here

class Vehicle1 {
    private String brand1;

    Vehicle1(String brand1) {
        this.brand1 = brand1;
        System.out.println("Vehicle1 constructor1 called.");
    }

    void start1() {
        System.out.println(brand1 + " vehicle1 starting...");
    }

    void stop1() {
        System.out.println(brand1 + " vehicle1 stopped.");
    }

    public String getBrand1() {
        return this.brand1;
    }

    public void setBrand1(String brand1) {
        this.brand1 = brand1;
    }
}
//class vehicle ends here

class Animal1 {
    private String name1;

    Animal1(String name1) {
        this.name1 = name1;
        System.out.println("Animal1 constructor1 called.");
    }

    void eat1() {
        System.out.println(name1 + " is eating1...");
    }

    void walk1() {
        System.out.println(name1 + " is walking1...");
    }

    public String getName1() {
        return this.name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
}
//class animal1 ends here

class SportsCar1 extends Vehicle1 implements Racer1, Product1 {

    private int topSpeed1;

    SportsCar1(String brand1, int topSpeed1) {
        super(brand1);
        this.topSpeed1 = topSpeed1;
        System.out.println("SportsCar1 constructor1 called.");
    }

    public void race1() {
        System.out.println(getBrand1() + " SportsCar1 racing1 at " + topSpeed1 + " km/h!");
    }

    public void buy1() {
        System.out.println(getBrand1() + " SportsCar1 purchased1.");
    }

    public void sell1() {
        System.out.println(getBrand1() + " SportsCar1 sold1.");
    }

    public int getTopSpeed1() {
        return this.topSpeed1;
    }

    public void setTopSpeed1(int speed1) {
        this.topSpeed1 = speed1;
    }
}
//class sportscar1 ends here

class Horse1 extends Animal1 implements Racer1, Product1 {

    private String color1;

    Horse1(String name1, String color1) {
        super(name1);
        this.color1 = color1;
        System.out.println("Horse1 constructor1 called.");
    }

    public void race1() {
        System.out.println(getName1() + " Horse1 racing1!");
    }

    public void buy1() {
        System.out.println(getName1() + " Horse1 bought1.");
    }

    public void sell1() {
        System.out.println(getName1() + " Horse1 sold1.");
    }

    public String getColor1() {
        return this.color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }
}
//class horse1 ends here

class Lion1 extends Animal1 {

    private int age1;

    Lion1(String name1, int age1) {
        super(name1);
        this.age1 = age1;
        System.out.println("Lion1 constructor1 called.");
    }

    public int getAge1() {
        return this.age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }
}
//class lion1 ends here

public class Main {
    public static void main(String[] args) {

        //sportcar
        Racer1 r1 = new SportsCar1("Audi1", 300);
        r1.race1();

        Product1 p1 = (Product1) r1;
        p1.buy1();
        p1.sell1();

        SportsCar1 car1 = (SportsCar1) r1;
        System.out.println(car1.getTopSpeed1());
        car1.setTopSpeed1(330);
        System.out.println(car1.getTopSpeed1());
        car1.start1();
        car1.stop1();


        //horse
        System.out.println();
        Racer1 r2 = new Horse1("Storm1", "Grey1");
        r2.race1();

        Product1 p2 = (Product1) r2;
        p2.buy1();
        p2.sell1();

        Horse1 h1 = (Horse1) r2;
        System.out.println(h1.getColor1());
        h1.setColor1("Black1");
        System.out.println(h1.getColor1());
        h1.eat1();
        h1.walk1();


        //lion is not racer and product
        System.out.println();
        Lion1 lion = new Lion1("Leo1", 4);
        System.out.println(lion.getAge1());
        lion.setAge1(6);
        System.out.println(lion.getAge1());
        lion.eat1();
        lion.walk1();
    }//main ends here
}//class main ends here
