
import java.util.ArrayList;

public class subSequence {
  public static void main(String[] args) {
    System.out.println(subseq("ajsl",""));    
  }
  static ArrayList<String> subseq(String p,String up){
    ArrayList<String> list=new ArrayList<>();
    if(p.isEmpty()){
      list.add(up);
      return list;
    }
    char ch=p.charAt(0);
    ArrayList<String> left=subseq(p.substring(1),up+ch);
    ArrayList<String> right=subseq(p.substring(1),up);
    left.addAll(right);
    return left;
  }

}
