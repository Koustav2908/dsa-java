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
        if (head != null) {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    boolean delete(int n) {
        if (head == null || n <= 0 || n > count) {
            return false;
        }

        if (n == 1) {
            head = head.next;
        } else {
            Node temp = head;

            for (int i = 0; i < n - 2; i++) {
                temp = temp.next;
            }
            temp.next = (temp.next).next;
        }
        count--;
        return true;
    }

    int size() {
        return count;
    }
}