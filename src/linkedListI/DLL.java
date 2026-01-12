package linkedListI;

public class DLL {
  private int size=0;
  private Node head;
  private Node tail;
  private class Node{
    int value;
    Node next;
    Node prev;
    public Node(int value){
      this.value=value;
    }
    public Node(int value,Node prev,Node next){
      this.value=value;
      this.prev=prev;
      this.next=next;
    }
  }
  public DLL(){
    this.size=0;
  }
  public void insertFirst(int num){
    Node temp=new Node(num);
    if(head==null){
      head=temp;
      tail=head;
      size++;
      return;
    }
    head.prev=temp;
    temp.next=head;
    head=temp;
    size++;
  }

  public void insertLast(int num){
    Node temp=new Node(num);
    if(head==null){
      head=temp;
      tail=temp;
      size++;
      return;
    }
    tail.next=temp;
    temp.prev=tail;
    tail=temp;
    size++;
  }

  public void insert(int num,int index){
    Node node=new Node(num);
    Node temp=head;
    if(index==0){
      insertFirst(num);
      return;
    }
    if(index==size){
      insertLast(num);
      return;
    }
    for(int i=1;i<index;i++){
      temp=temp.next;
    }
    node.next=temp.next;
    node.prev=temp;
    temp.next.prev=node;
    temp.next=node;
    size++;
  }

  public void deleteFirst(){
    Node temp=head.next;
    head.next=null;
    head=temp;
    if(head!=null){
      head.prev=null;
    }
    size--;
    if(size==0){
      tail=null;
    }
  }

  public void deleteLast(){
    Node temp = tail.prev;
    tail.prev = null;
    tail = temp;

    if(tail != null){
      tail.next = null;
    }
    size--;
    if(size == 0){
      head = null;
    }
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

    Node toDelete = temp.next;

    temp.next = toDelete.next;
    toDelete.next.prev = temp;

    toDelete.next = null;
    toDelete.prev = null;

    size--;
  }


}
