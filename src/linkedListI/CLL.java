package linkedListI;

public class CLL {

  private Node head;
  private Node tail;
  private int size;

  private class Node {
    int value;
    Node next;
    Node(int value){
      this.value = value;
    }
  }

  public CLL(){
    size = 0;
  }

  public void insertFirst(int val){
    Node node = new Node(val);
    if(head == null){
      head = node;
      tail = node;
      node.next = node;
      size++;
      return;
    }
    node.next = head;
    tail.next = node;
    head = node;
    size++;
  }

  public void insertLast(int val){
    Node node = new Node(val);
    if(head == null){
      head = node;
      tail = node;
      node.next = node;
      size++;
      return;
    }
    tail.next = node;
    node.next = head;
    tail = node;
    size++;
  }

  public void insert(int val, int index){
    if(index == 0){
      insertFirst(val);
      return;
    }
    if(index == size){
      insertLast(val);
      return;
    }
    Node temp = head;
    for(int i = 1; i < index; i++){
      temp = temp.next;
    }
    Node node = new Node(val);
    node.next = temp.next;
    temp.next = node;
    size++;
  }

  public void deleteFirst(){
    if(size == 1){
      head = null;
      tail = null;
      size = 0;
      return;
    }
    head = head.next;
    tail.next = head;
    size--;
  }

  public void deleteLast(){
    if(size == 1){
      head = null;
      tail = null;
      size = 0;
      return;
    }
    Node temp = head;
    while(temp.next != tail){
      temp = temp.next;
    }
    temp.next = head;
    tail = temp;
    size--;
  }

  public void deleteIndex(int index){
    if(index == 0){
      deleteFirst();
      return;
    }
    if(index == size - 1){
      deleteLast();
      return;
    }
    Node temp = head;
    for(int i = 1; i < index; i++){
      temp = temp.next;
    }
    temp.next = temp.next.next;
    size--;
  }

  public void reverse(){
    if(size <= 1){
      return;
    }
    Node prev = tail;
    Node current = head;
    Node next;
    do{
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    } while(current != head);
    tail = head;
    head = prev;
  }

  public void display(){
    if(head == null){
      System.out.println("EMPTY");
      return;
    }
    Node temp = head;
    do{
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    } while(temp != head);
    System.out.println("(HEAD)");
  }
}
