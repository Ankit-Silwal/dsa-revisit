public class skipWord {
  public static void main(String[] args) {
      System.out.print(skip("djsaklsdjaAppleklfdsja",""));
  }
  static String skip(String up,String p){
    if(up.isEmpty()){
      return p;
    }
    char ch=up.charAt(0);
    if(up.startsWith("Apple")){
      return skip(up.substring(5),p);
    }else{
      return skip(up.substring(1),p+ch);
    }
  }
}
