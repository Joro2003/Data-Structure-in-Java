import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // Initialize a LinkedList with elements
        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Initialize an array and a Vector
        int[] a = {10, 20, 30};
        ArrayList<Integer> v = new ArrayList<>(Arrays.asList(10, 20, 30));

        // Initialize another LinkedList from the Vector
        LinkedList<Integer> l2 = new LinkedList<>(v);

        // Clear the list and print its size
        l2.clear();
        System.out.println(l2.size());

        // Resize the list to 5 elements, filling with 100
        for (int i = 0; i < 5; i++) {
            l2.add(100);
        }

        // Print all elements in l2
        for (int val : l2) {
            System.out.println(val);
        }
    }
}
