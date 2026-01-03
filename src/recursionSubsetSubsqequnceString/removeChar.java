public class removeChar {
  public static void main(String[] args) {
    System.out.print(remove("aabddjdaaavdjklasdf",""));  
  }
  static String remove(String up,String p){
    if(up.isEmpty()){
      return p;
    }
    char ch=up.charAt(0);
    if(ch=='a'){
      return remove(up.substring(1),p);
    }else{
      return remove(up.substring(1), p+ch);
    }
  }
}
