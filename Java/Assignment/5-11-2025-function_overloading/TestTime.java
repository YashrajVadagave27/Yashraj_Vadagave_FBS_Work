class Time {
    int hr, min, sec;

    // Set time
    void setTime(int h, int m, int s) {
        hr = h;
        min = m;
        sec = s;
    }

    // Display time in hh:mm:ss format
    void display() {
        System.out.printf("%02d:%02d:%02d%n", hr, min, sec);
    }

    // Add two Time objects
    void add(Time t1, Time t2) {
        hr = t1.hr + t2.hr;
        min = t1.min + t2.min;
        sec = t1.sec + t2.sec;

        normalizeTime();
        System.out.print("Sum of two Time objects = ");
        display();
    }

    // Add integer hours
    void add(Time t, int hours) {
        hr = t.hr + hours;
        min = t.min;
        sec = t.sec;

        normalizeTime();
        System.out.print("After adding hours = ");
        display();
    }

    // Add integer minutes
    void addMinutes(Time t, int minutes) {
        hr = t.hr;
        min = t.min + minutes;
        sec = t.sec;

        normalizeTime();
        System.out.print("After adding minutes = ");
        display();
    }

    // Add integer seconds
    void addSeconds(Time t, int seconds) {
        hr = t.hr;
        min = t.min;
        sec = t.sec + seconds;

        normalizeTime();
        System.out.print("After adding seconds = ");
        display();
    }

    // Normalize time (convert extra sec/min to proper time)
    void normalizeTime() {
        if (sec >= 60) {
            min += sec / 60;
            sec = sec % 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
        }
        if (hr >= 24) {
            hr = hr % 24;
        }
    }
} // Time ends here


class TestTime {
    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();

        t1.setTime(10, 45, 50);
        t2.setTime(5, 30, 25);

        // Add two Time objects
        result.add(t1, t2);

        // Add integer hours
        result.add(t1, 3);

        // Add integer minutes
        result.addMinutes(t1, 50);

        // Add integer seconds
        result.addSeconds(t1, 150);
    } // main ends here
} // TestTime ends here
