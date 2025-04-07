import java.util.Scanner;

class Node {
    int val;
    Node next;
    
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {
    
    // Insert at the tail of the linked list
    public static void insertAtTail(Node head, Node tail, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    
    // Print the linked list
    public static void printLinkedList(Node head) {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }

    // Delete the node at the tail
    public static void deleteAtTail(Node head, Node tail, int idx) {
        Node tmp = head;
        for (int i = 1; i < idx; i++) {
            tmp = tmp.next;
        }
        Node deleteNode = tmp.next;
        tmp.next = tmp.next.next;
        delete deleteNode;
        tail = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Node head = null;
        Node tail = null;
        
        // Reading input values
        while (true) {
            int val = sc.nextInt();
            if (val == -1) {
                break;
            }
            insertAtTail(head, tail, val);
        }
        
        // Output the tail value before deletion
        System.out.println("Tail before delete: " + tail.val);
        
        // Delete the node at the 3rd position (tail)
        deleteAtTail(head, tail, 3);
        
        // Print the linked list after deletion
        printLinkedList(head);
        
        // Output the tail value after deletion
        System.out.println("Tail after delete: " + tail.val);
        
        sc.close();
    }
}
