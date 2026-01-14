public class stack {
  public static void main(String[] args) throws Exception {
      customStack stack=new customStack(5);
      stack.push(45);
      stack.push(45);
      stack.push(45);
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());

  }
}
