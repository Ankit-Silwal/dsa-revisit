package Prac;

public class praOne {
  private int[] arr;
  private int front;
  private int rear;
  private int capacity;
  praOne(int capacity){
    this.arr=new int[capacity];
    this.capacity=capacity;
    front=0;
    rear=-1;
  }

  void unqueue(int x){
    if(rear==capacity-1){
      System.out.println("Queue overflow");
      return;
    }
    arr[++rear]=x;
  }

  int dequeue(){
    if(front>rear){
      System.out.println("Queue underflow");
      return -1;
    }
    return arr[front++];
  }

  int peek(){
    if(front>rear) return -1;
    return arr[front]; 
  }
}
