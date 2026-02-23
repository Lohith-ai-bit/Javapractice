import java.util.Scanner;

class CircularQueue {
    private int size;
    private int front, rear;
    private int[] queue;

    public CircularQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = this.rear = -1;
    }

    public void enqueue(int data) {
        // Check if queue is full
        if ((rear + 1) % size == front) {
            System.out.println("Queue is FULL!");
            return;
        }

        // If queue is empty, set front to 0
        if (front == -1) {
            front = 0;
        }

        // Move rear to next position (circular)
        rear = (rear + 1) % size;
        queue[rear] = data;
        System.out.println(data + " inserted.");
    }

    public int dequeue() {
        // Check if queue is empty
        if (front == -1) {
            System.out.println("Queue is EMPTY!");
            return -1;
        }

        int data = queue[front];
        System.out.println(data + " removed.");

        // If only one element, reset queue
        if (front == rear) {
            front = rear = -1;
        } else {
            // Move front to next position (circular)
            front = (front + 1) % size;
        }

        return data;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is EMPTY!");
            return;
        }

        System.out.print("Queue elements: ");
        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        } else {
            for (int i = front; i < size; i++) {
                System.out.print(queue[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int n = sc.nextInt();

        CircularQueue cq = new CircularQueue(n);
        int choice;

        while (true) {
            System.out.println("\n--- Circular Queue Menu ---");
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
                    cq.enqueue(value);
                    break;

                case 2:
                    cq.dequeue();
                    break;

                case 3:
                    cq.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}