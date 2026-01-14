import java.util.LinkedList;
import java.util.Queue;

public class InbuildExample {
  public static void main(String[] args) {
    // Stack<Integer> stack=new Stack<>();
    // stack.push(34);
    // stack.push(44);
    // stack.push(54);
    // stack.push(74);
    // stack.push(84);
    // stack.push(94);

    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    Queue<Integer> queue=new LinkedList<>();
    queue.add(3);
    queue.add(6);
    queue.add(334);
    queue.add(34);
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    System.out.println(queue.peek());


  }

}
