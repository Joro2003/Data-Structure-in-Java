public class Main {

    static void fun(IntegerWrapper p) {
        p = null; // Only modifies the local copy
    }

    public static void main(String[] args) {
        int x = 10;
        IntegerWrapper p = new IntegerWrapper(x);
        fun(p); // This does not change 'p' in main
        System.out.println("In Main: " + p.value);
    }
}

// Custom wrapper class to simulate pointer behavior
class IntegerWrapper {
    int value;

    IntegerWrapper(int value) {
        this.value = value;
    }
}
