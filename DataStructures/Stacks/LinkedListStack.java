class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedListStack {
    Node head;

    LinkedListStack() {
        this.head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    boolean pop() {
        if (isEmpty())
            return false;
        else {
            head = head.next;
            return true;
        }
    }

    Integer peek() {
        if (isEmpty())
            return null;
        else
            return head.value;
    }

    void display() {
        if (isEmpty())
            return;

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value + (temp == head ? " <- top" : ""));
            temp = temp.next;
        }
        System.out.println();
    }
}