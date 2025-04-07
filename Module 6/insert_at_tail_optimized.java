class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {

    // A helper class to hold both head and tail references
    static class LinkedList {
        Node head;
        Node tail;

        void insertAtTail(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        void printLinkedList() {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.val);
                tmp = tmp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Initializing the list manually
        list.head = new Node(10);
        Node a = new Node(20);
        list.tail = new Node(30);

        list.head.next = a;
        a.next = list.tail;

        // Update tail during inserts
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);

        list.printLinkedList();
        System.out.println("Tail = " + list.tail.val);
    }
}
