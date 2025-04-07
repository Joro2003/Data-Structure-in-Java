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

    static class LinkedList {
        Node head = null;
        Node tail = null;

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
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true) {
            int val = sc.nextInt();
            if (val == -1) {
                break;
            }
            list.insertAtTail(val);
        }

        list.printLinkedList();
        sc.close();
    }
}
