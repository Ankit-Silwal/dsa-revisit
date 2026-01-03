public class countZeroes {
  public static void main(String[] args) {
      System.out.print(count(193430080));
  }
  static int c=0;
  static int count(int num){
    if(num==0){
      return c;
    }
    if(num%10==0){
      c++;
    }
    count(num/10);
    return c;
  }
}
