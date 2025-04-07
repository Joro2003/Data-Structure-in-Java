class LinkedListCycleDetection {

    // Node class to represent each element in the list
    static class Node {
        int val;
        Node next;

        // Constructor
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Creating the linked list
        Node head = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);

        // Linking nodes
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = d;  // Creates a cycle

        // Detecting cycle
        if (hasCycle(head)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }

    // Function to detect cycle using Floyd's cycle-finding algorithm
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by 1
            fast = fast.next.next;     // Move fast pointer by 2

            // If slow and fast pointers meet, a cycle is detected
            if (slow == fast) {
                return true;
            }
        }
        return false; // No cycle
    }
}
