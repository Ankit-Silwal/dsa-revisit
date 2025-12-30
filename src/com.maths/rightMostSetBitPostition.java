public class rightMostSetBitPostition {
  public static void main(String[] args) {
      System.out.println(rightbit(4));
      System.out.println(rightbit(1));
      System.out.println(rightbit(44));
      System.out.println(rightbit(354534));
      System.out.println(rightbit(5));
      System.out.println(rightbit(9));
      System.out.println(rightbit(0));
  }
  static int rightbit(int num){
    if(num==0){
      return -1;
    }
    int pos=0;
    while(num>0){
      num=num>>1;
      pos++;
    }
    return pos;
  }
}
