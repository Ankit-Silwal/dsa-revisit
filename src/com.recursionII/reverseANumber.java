public class reverseANumber {
  public static void main(String[] args) {
    System.out.println(reverse(3435)); //5343 
  }
  static int sum=0;
  static int reverse(int num){
    if(num==0){
      return sum;
    }
    int rem=num%10;
    sum=sum*10+rem;
    reverse(num/10);
    return sum;
  }
}
