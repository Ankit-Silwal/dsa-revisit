public class squareRootNewtonRapsonMethod {
  public static void main(String[] args) {
      System.out.printf("%.3f",root(41));
  }
  static double root(int num){
    double x=num;
    double root=0;
    while(true){
      root=0.5*(x+(num/x));
      if(Math.abs(root-x)<0.001){
        break;
      }
      x=root;
    }
    return root;
  }
}
