public class perfectSquareRoot {
  public static void main(String[] args) {
      System.out.println(root(36));
  }  
  static int root(int num){
    int s=0,e=num,m=0;
    while(s<=e){
      m=s+(e-s)/2;
      if(m*m==num){
        return m;
      }else if(m*m>num){
        e=m-1;
      }else{
        s=m+1;
      }
    }
    return -1;
  }
}
