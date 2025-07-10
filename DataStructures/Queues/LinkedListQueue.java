class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedListQueue {
    Node front, rear;

    LinkedListQueue() {
        this.front = this.rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }

    Integer peek() {
        if (isEmpty())
            return null;
        else
            return front.value;
    }

    void enqueue(int value) {
        Node newNode = new Node(value);

        if (isEmpty())
            front = rear = newNode;
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    boolean dequeue() {
        if (isEmpty())
            return false;

        front = front.next;
        if (front == null)
            rear = null;
        return true;
    }

    void display() {
        if (isEmpty())
            return;

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.value);

            if (temp == front && temp == rear)
                System.out.print(" <- front <- rear");
            else if (temp == front)
                System.out.print(" <- front");
            else if (temp == rear)
                System.out.print(" <- rear");

            System.out.println();
            temp = temp.next;
        }
        System.out.println();
    }
}