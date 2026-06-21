public class LinkedList {
    private Node head; // Head of the list

    // Node inner class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert a new node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete a node by value
    public void deleteVal(int key) {
        Node current = head, prev = null;

        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) return;

        prev.next = current.next;
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Driver Code
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insertAtEnd(1) ;
        llist.insertAtEnd(2);
        llist.insertAtEnd(3);

        System.out.println("Initial List:");
        llist.printList();

        llist.deleteVal(2);
        System.out.println("After Deleting 2:");
        llist.printList();
    }
}
