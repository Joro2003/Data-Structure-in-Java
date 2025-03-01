import java.util.ArrayList;

public class VectorExample {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(100);
        System.out.println(System.identityHashCode(v.get(4)) + " " + System.identityHashCode(v.get(5)));
    }
}
