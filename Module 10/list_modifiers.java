import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create and initialize LinkedLists and ArrayList
        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 20, 20, 70));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(100, 200));
        ArrayList<Integer> v = new ArrayList<>(Arrays.asList(2, 3, 4));

        // Copy elements from l to l2
        l2 = new LinkedList<>(l);

        // Assign elements from l to l2 again
        l2.clear();
        l2.addAll(l);

        // Add elements to the LinkedList
        l.add(40); // push_back
        l.addFirst(100); // push_front

        // Remove elements from the LinkedList
        l.removeLast(); // pop_back
        l.removeLast(); // pop_back
        l.removeFirst(); // pop_front

        // Insert elements of ArrayList into LinkedList
        ListIterator<Integer> it = new LinkedList<>(l).listIterator(2);
        it.addAll(v);

        // Erase a range of elements from the LinkedList
        Iterator<Integer> start = l.listIterator(2);
        Iterator<Integer> end = l.listIterator(5);
        while (start != end) {
            start.next();
            start.remove();
        }

        // Print the second element
        System.out.println(l.get(1));

        // Replace all occurrences of 20 with 100
        Collections.replaceAll(l, 20, 100);

        // Find an element (20 in this case)
        if (l.contains(20)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        // Print all the elements in the LinkedList
        for (int val : l) {
            System.out.println(val);
        }
    }
}
