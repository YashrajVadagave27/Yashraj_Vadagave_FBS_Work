package p1;

public class MyKey implements Comparable<MyKey> {

    int key;

    public MyKey(int i) {
        this.key = i;
    }

    @Override
    public int compareTo(MyKey o) {
        System.out.println("Inside compareTo()");
        return this.key - o.key;   // used by TreeMap
    }

    @Override
    public int hashCode() {
        System.out.println("Inside hashCode()");
        return this.key;
    }

    public boolean equals(Object o1) {
        System.out.println("Inside equals()");
        MyKey mk = (MyKey) o1;
        if(this.key == mk.key) {
        	return true;
        }else {
        	return false;
        }
    }

    @Override
    public String toString() {
        return "Key : " + this.key + " ";
    }
}
