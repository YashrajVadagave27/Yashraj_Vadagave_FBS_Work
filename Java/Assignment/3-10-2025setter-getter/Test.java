class Date {
    int day, month, year;
    String dow;

    // Setter methods
    void setDay(int d) {
        this.day = d;
    }

    void setMonth(int m) {
        this.month = m;
    }

    void setYear(int y) {
        this.year = y;
    }

    void setDow(String str) {
        this.dow = str;
    }

    // Getter methods
    int getDay() {
        return this.day;
    }

    int getMonth() {
        return this.month;
    }

    int getYear() {
        return this.year;
    }

    String getDow() {
        return this.dow;
    }

    // Display method
    void display() {
        System.out.println("Date is : " + getDay() + "/" + getMonth() + "/" + getYear());
        System.out.println("Day is : " + getDow());
    }
} // Date class ends here


class Test {
    public static void main(String[] args) {
        Date d1 = new Date();

        // Using setters
        d1.setDay(4);
        d1.setMonth(8);
        d1.setYear(1984);
        d1.setDow("Saturday");

        d1.display();
    }
} // Test class ends here
