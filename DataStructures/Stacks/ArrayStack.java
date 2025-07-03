public class ArrayStack {
    int[] stack;
    int top, size;

    ArrayStack(int size) {
        this.size = size;
        this.stack = new int[this.size];
        this.top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int value) {
        if (isFull())
            return;
        else
            stack[++top] = value;
    }

    boolean pop() {
        if (isEmpty())
            return false;
        else {
            top--;
            return true;
        }
    }

    Integer peek() {
        if (isEmpty())
            return null;
        else
            return stack[top];
    }

    void display() {
        if (isEmpty())
            return;

        for (int i = top; i >= 0; i--)
            System.out.println(stack[i] + (i == top ? " <- top" : ""));

        System.out.println();
    }
}