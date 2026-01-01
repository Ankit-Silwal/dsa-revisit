public class primeNo {
  public static void main(String[] args) {
    System.out.println(check(13));
    System.out.println(check(6));
    System.out.println(check(9));
    System.out.println(check(12));
    System.out.println(check(17));
  
  }
  static boolean check(int num){
    int check=2;
    while(check*check<num){
      if(num%check==0){
        return false;
      }
      check++;
    }
    return true;
  }
}
