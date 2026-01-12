package linkedListI;

public class customLinkedList{
  public static void main(String[] args) {
      LL list=new LL();
      list.insertFirst(4);
      list.insertFirst(556);
      list.insertLast(45);
      list.insertLast(3);
      list.insert(44,1);
      list.display();
      list.deleteFirst();
      list.display();
      list.deleteLast();
      list.display();
      list.deleteIndex(1);
      list.display();
  }
}