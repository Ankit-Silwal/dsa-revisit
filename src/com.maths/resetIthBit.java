public class resetIthBit {
  public static void main(String[] args) {
      System.out.println(set(31,4));
      System.out.println(set(23,4));
  }
  static int set(int num,int bit){
    int dummy=1;
    dummy=dummy<<(bit-1);
    return (~dummy&num);
  }
}
