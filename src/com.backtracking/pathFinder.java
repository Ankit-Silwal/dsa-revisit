public class pathFinder {
  public static void main(String[] args) {
      paths("",3,3);
  }
  static void paths(String p,int r,int c){
    if(r==1 && c==1){
      System.out.println(p);
      return;
    }
    if(r>1){
      paths(p+'D',r-1,c);
    }
    if(c>1){
      paths(p+'R',r,c-1);
    }
  }
}

