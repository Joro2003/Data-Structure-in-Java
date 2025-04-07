import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        // Display the first element using front() equivalent
        System.out.println(l.getFirst());

        // Display the first element using iterator equivalent
        System.out.println(l.iterator().next());

        // Display the last element using back() equivalent
        System.out.println(l.getLast());
    }
}
