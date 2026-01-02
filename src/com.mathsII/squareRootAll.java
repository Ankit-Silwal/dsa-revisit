public class squareRootAll {
  public static void main(String[] args) {
      System.out.printf("%.4f",root(40,4));
  }
  static double root(int num,int place){
    int s=0,e=num;
    double ans=0;
    while(s<=e){
      int m=s+(e-s)/2;
      if(m*m==num){
        ans=m;
        return ans; 
      }else if(m*m>num){
        e=m-1;
      }else{
        s=m+1;
        ans=m;
      }
    }
    double incr=0.1;
    for(int i=0;i<=place;i++){
      while(ans*ans<num){
        ans+=incr;
      }
      ans-=incr;
      incr/=10;
    }
    return ans;
  }
}
