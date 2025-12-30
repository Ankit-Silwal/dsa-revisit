public class ithBit {
  public static void main(String[] args) {
      System.out.println(bit(31,4)); //1
      System.out.println(bit(23,4)); //0
      System.out.println(bit(444,1));
      System.out.println(bit(3333,1));
  }
  static int bit(int num,int pos){
    int key=1;
    key=key<<(pos-1);
    int dummy=(num&key);
    if(dummy>0){
      return 1;
    }else{
      return 0;
    }
  }
}
