class Node {
    int val;
    Node next;
    Node prev;

    // Constructor for the Node class
    Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class Main {

    // Function to print the list forward
    public static void printForward(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to insert a node at the tail of the list
    public static void insertAtTail(Node head, Node tail, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static void main(String[] args) {
        Node head = null;
        Node tail = null;

        Scanner sc = new Scanner(System.in);
        int val;

        // Read the values and insert them at the tail until -1 is encountered
        while (true) {
            val = sc.nextInt();
            if (val == -1) {
                break;
            }
            insertAtTail(head, tail, val);
        }

        printForward(head);
    }
}
