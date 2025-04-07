public class Main {

    static void rec(int i, int n) {
        // base case
        if (i > n) {
            return;
        }
        rec(i + 1, n); // recursive call first
        System.out.println(i); // print after recursion
    }

    public static void main(String[] args) {
        int n = 5;
        rec(1, n); // start recursion with 1
    }
}
