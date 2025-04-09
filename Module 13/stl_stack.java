import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            st.push(val);
        }

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
