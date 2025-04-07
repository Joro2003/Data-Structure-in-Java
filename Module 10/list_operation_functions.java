import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(20, 30, 10, 50, 30, 60, 60, 10));

        // Sort the LinkedList in ascending order
        Collections.sort(l);

        // Sort the LinkedList in descending order
        Collections.sort(l, Collections.reverseOrder());

        // Remove duplicates
        Set<Integer> set = new LinkedHashSet<>(l); // LinkedHashSet preserves order
        l.clear();
        l.addAll(set);

        // Reverse the LinkedList
        Collections.reverse(l);

        // Print the elements
        for (int val : l) {
            System.out.println(val);
        }
    }
}
