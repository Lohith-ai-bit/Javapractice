import java.util.Scanner;

class LinearQueue {

    static final int MAX = 5;      // Maximum size of queue
    static int[] queue = new int[MAX];
    static int front = 0;
    static int rear = 0;

    public static boolean isEmpty() {
        return front == rear;
    }

    public static boolean isFull() {
        return rear == MAX;
    }

    public static void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is FULL!");
        } else {
            queue[rear] = item;
            rear++;
            System.out.println(item + " inserted.");
        }
    }

    public static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY!");
        } else {
            System.out.println(queue[front] + " removed.");
            // Shift elements to left
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
        }
    }

    public static void display() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY!");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Linear Queue Menu ---");
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    enqueue(value);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
