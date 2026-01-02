public class seivePrimeRange {
  public static void main(String[] args) {
    int n=40;
    boolean[] primes=new boolean[n+1];
    sieve(n,primes);  
  }
  //suppose false means the number is prime just to reduce the complexity as we dont need to flip the shit
  //and true means the number isnt prime
  static void sieve(int n,boolean[] primes){
    for(int i=2;i*i<n;i++){
      if(!primes[i]){
        for(int j=2*i;j<=n;j+=i){
          primes[j]=true;
        }
      }
    }
    for(int i=2;i<=n;i++){
      if(!primes[i]){
        System.out.print(i+" ");
      }
    }
  }
}
