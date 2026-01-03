public class gcdAndLcm {
  public static void main(String[] args) {
      System.out.println(gcd(55,57));
      System.out.println(lcm(9,18 ));
  }
  static int gcd(int a,int b){
    if(a==0){
      return b;
    }
    return gcd(b%a,a);
  }
  static int lcm(int a,int b){
    int d=gcd(a,b);
    return (a/d)*(b/d)*d;
  }
}
