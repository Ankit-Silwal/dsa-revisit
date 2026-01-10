
import java.util.ArrayList;

public class subsetWithAsciValue {
  public static void main(String[] args) {
    System.out.print(subseq("hakjf", ""));  
  }
  static ArrayList<String> subseq(String up,String p){
    if(up.isEmpty()){
      ArrayList<String> list=new ArrayList<>();
      list.add(p);
      return list;
    }
    char ch=up.charAt(0);
    ArrayList<String> left=subseq(up.substring(1),p+ch);
    ArrayList<String> middle=subseq(up.substring(1),p+(ch+0));
    ArrayList<String> right=subseq(up.substring(1),p);
    left.addAll(middle);
    left.addAll(right);
    return left;
  }
}
