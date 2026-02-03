package Stack;

public class Stack{
    private Node top;
    private int size;

    private class Node{
        private int data;
        private Node next;
        public Node(int data,Node next){
            super();
            this.data=data;
            this.next=next;
        }
        public Node(int data){
            super();
            this.data=data;
            this.next=null;
        }
    }

    public void push(int data){
        Node tempNode=new Node(data);
        tempNode.next=top;
        top=tempNode;
        size++;
    }
    public int pop(){
        if(isEmpty()){
            return -69;
        }
        int result=top.data;
        top=top.next;
        size--;
        return result;
    }

    public int seek(){
        if(isEmpty()){
            return -69;
        }
        return top.data;
    }


    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public void displayStack(){
        Node curr=top;
        while(curr!=null){
            System.out.printf("%d ",curr.data);
            curr=curr.next;
        }
    }
}
