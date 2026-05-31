class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    static void reversePrint(Node head) {
        if (head == null) {
            return;
        }

        reversePrint(head.next);   // go to last node
        System.out.print(head.data + " "); // print while returning
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        reversePrint(head);
    }
}