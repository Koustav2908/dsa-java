class Node {
    int value;
    Node next, prev;

    Node(int value) {
        this.value = value;
        this.next = this.prev = null;
    }
}

public class DoublyLinkedList {
    Node head, tail;
    int count;

    DoublyLinkedList() {
        this.head = this.tail = null;
        this.count = 0;
    }

    void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        count++;
    }

    boolean delete(int n) {
        if (head == null || n <= 0 || n > count)
            return false;

        if (n == 1) {
            head = head.next;
            if (head == null)
                tail = null;
            else
                head.prev = null;
        } else if (n == count) {
            tail = tail.prev;
            if (tail == null)
                head = null;
            else
                tail.next = null;
        } else {
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp = temp.next;
            }
            (temp.prev).next = temp.next;
            (temp.next).prev = temp.prev;
        }
        count--;
        return true;
    }

    void forwardTraverse() {
        if (head != null) {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
        }
        System.out.println("NULL");
    }

    void backwardTraverse() {
        System.out.print("NULL");
        if (head != null) {
            Node temp = tail;

            while (temp != null) {
                System.out.print(" <- " + temp.value);
                temp = temp.prev;
            }
        }
        System.out.println();
    }

    int size() {
        return count;
    }
}