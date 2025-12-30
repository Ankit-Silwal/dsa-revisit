public class OddEvenBitWise {
  public static void main(String[] args) {
    int n=5;
    oddEven(5);
    oddEven(6);      
  }
  static void oddEven(int num){
    if((num&1)==1){
      System.out.println("Odd");
      return;
    }else{
      System.out.println("Even");
      return;
    }
  }
}
