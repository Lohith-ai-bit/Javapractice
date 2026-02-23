 class LinkedList {
    Node head;


    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; 
        head = newNode;       
    }

    
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 1;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }
    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    public void DeleteAtEnding(){
        Node current=head 
        while(current.next.next!=null){
            current=current.next;
        }
    }
    public void deleteAtPosition(int position){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(position==0){
            head=head.next;
            return;
        }
        Node current=head;
        int count=0;
        while(current!=null && count<position-1){
            current=current.next;
            count++;
        }
        if(current==null || current.next==null){
            System.out.println("Position out of bounds");
            return;
        }
        current.next=current.next.next;
    }


    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
       
}
 public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtBeginning(5);
        list.insertAtPosition(7, 2);
        list.display(); 

    }
 }

class Node {
    int data;
    Node next; 
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }   
}
