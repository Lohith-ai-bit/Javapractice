package Queque;
import java.util.Scanner;
public class Linearqueue
{
 private static final int MAX = 100;
 private static int[] queue = new int[MAX];
 private static int front = 0;
 private static int rear = 0;

 public static boolean isEmpty() {
 return front == rear;
 }
 public static boolean isFull() {
 return rear == MAX;
 }
 public static void enqueue(int item)
{
 if (isFull()) {
 System.out.println("Queue is full");
 return;
 }
 queue[rear++] = item;
 }
 public static void dequeue()
{
 if (isEmpty()) {
 System.out.println("Queue is empty");
 return;
 }
 int item = queue[front++];
 System.out.println("Dequeued: " + item);
 }
public static void display()
{
 if (isEmpty()) {
 System.out.println("Queue is empty");
 return;
 }
 System.out.print("Queue elements: ");
 for (int i = front; i < rear; i++) {
 System.out.print(queue[i] + " ");
 }
 System.out.println();
 }
 public static void main(String[] args)
{
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("1. Enqueue");
 System.out.println("2. Dequeue");
 System.out.println("3. Display");
 System.out.println("4. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 switch (choice) {
 case 1:
 System.out.print("Enter a number to enqueue: ");
 int item = scanner.nextInt();
 enqueue(item);
 break;
 case 2:
 dequeue();
 break;
 case 3:
 display();
 break;
 case 4:
 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice");
 }
 } while (choice != 4);
 scanner.close();
}
}