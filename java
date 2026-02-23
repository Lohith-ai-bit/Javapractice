public class LinkedListDemo {
    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at position (1-based)
    public void insertAtPosition(int data, int pos) {
        if (pos <= 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++)
            temp = temp.next;
        if (temp == null) return;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by value
    public void delete(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
    }

    // Delete at position (1-based)
    public void deleteAtPosition(int pos) {
        if (head == null) return;
        Node temp = head;
        if (pos == 1) {
            head = temp.next;
            return;
        }
        for (int i = 1; temp != null && i < pos - 1; i++)
            temp = temp.next;
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display(); // 10 20 30
        list.insertAtBeginning(5);
        list.display(); // 5 10 20 30
        list.insertAtPosition(15, 3);
        list.display(); // 5 10 15 20 30
        list.delete(10);
        list.display(); // 5 15 20 30
        list.deleteAtPosition(2);
        list.display(); // 5 20 30
    }
}