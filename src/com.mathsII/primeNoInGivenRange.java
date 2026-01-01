public class primeNoInGivenRange {
  public static void main(String[] args) {
    printNo(40);
    System.out.println("\n\n");
    printNo(60);
    System.out.println("\n\n");
    printNo(199);
  }
  static void printNo(int num){
    for(int i=2;i<=num;i++){
      int j=2;
      boolean isPrime=true;
      while(j*j<=i){
        if(i%j==0){
          isPrime=false;
          break;
        }
        j++;
      }
      if(isPrime){
        System.out.println(i);
      }
    }
  }
}
