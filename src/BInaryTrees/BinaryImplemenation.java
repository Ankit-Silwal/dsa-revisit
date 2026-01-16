package BInaryTrees;

import java.util.Scanner;
public class BinaryImplemenation {
  public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      BinaryTree tree=new BinaryTree();
      tree.populate(scanner);
      tree.display();
  }
}
