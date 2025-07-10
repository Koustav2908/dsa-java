public class ArrayQueue {
    int[] queue;
    int front, rear, size;

    ArrayQueue(int size) {
        this.size = size;
        this.queue = new int[this.size];
        this.front = this.rear = -1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return rear == size - 1;
    }

    Integer peek() {
        if (isEmpty())
            return null;
        else
            return queue[front];
    }

    void enqueue(int value) {
        if (isFull())
            return;

        if (isEmpty())
            front = 0;

        queue[++rear] = value;
    }

    boolean dequeue() {
        if (isEmpty())
            return false;

        if (front == rear)
            front = rear = -1;
        else
            front++;

        return true;
    }

    void display() {
        if (isEmpty())
            return;

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i]);

            if (i == front && i == rear)
                System.out.print(" <- front <- rear");
            else if (i == front)
                System.out.print(" <- front");
            else if (i == rear)
                System.out.print(" <- rear");

            System.out.println();
        }
        System.out.println();
    }
}