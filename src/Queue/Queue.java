package Queue;

public class Queue {
    // Node class (Linked List)
    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Front and Rear pointers
    private Node front;
    private Node rear;
    // Constructor
    public Queue() {
        front = null;
        rear = null;
    }
    // Enqueue operation
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) { // Queue is empty
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    // Dequeue operation
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) { // Queue becomes empty
            rear = null;
        }

        return value;
    }
    // Peek operation
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return front.data;
    }
    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }
    // Display queue elements
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = front;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    // Main method for testing
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
        queue.display();
    }
}
