import java.util.Scanner;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    int count;

    LinkedList() {
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

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int choice, value, n;
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== Welcome to Linked List program =====\n");
        System.out.println("1. Insert a node.");
        System.out.println("2. Print the list.");
        System.out.println("3. Delete a node.");
        System.out.println("4. Exit");

        while (isRunning) {
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert: ");
                    value = sc.nextInt();
                    list.insert(value);
                    break;

                case 2:
                    list.printList();
                    break;

                case 3:
                    System.out.print("Enter the index to delete (1-based): ");
                    n = sc.nextInt();
                    list.delete(n);
                    break;

                case 4:
                    System.out.println("Terminating all operations...\n");
                    sc.close();
                    isRunning = false;
                    break;

                default:
                    System.out.println("Wrong choice.");
                    break;
            }
        }
        sc.close();
    }
}