class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;
    int count;

    SinglyLinkedList() {
        this.head = null;
        this.count = 0;
    }

    void insert(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(value);
        }
        count++;
    }

    void printList() {
        if (head == null) {
            System.out.println("Underflow: Singly Linked List is empty.");
        } else {
            Node temp = head;

            System.out.print("The elements of the linked list are: ");

            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    void delete(int n) {
        if (head == null) {
            System.out.println("Underflow: Singly Linked List is empty.");
        } else if (n <= 0 || n > count) {
            System.out.println("Invalid index " + n + ": Valid range is 1 to " + count);
        } else if (n == 1) {
            System.out.println(head.value + " deleted from the list.");
            head = head.next;
            count--;
        } else {
            Node temp = head;

            for (int i = 0; i < n - 2; i++) {
                temp = temp.next;
            }
            System.out.println((temp.next).value + " deleted from the list.");
            temp.next = (temp.next).next;
            count--;
        }
    }
}