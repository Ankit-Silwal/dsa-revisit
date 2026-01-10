
import java.util.ArrayList;

public class pathFinderWithDiagonal {
  public static void main(String[] args) {
      System.out.print(findPath("", 3, 3));
  }
  static ArrayList<String> findPath(String p,int r,int c){
    if(r==1 && c==1){
      ArrayList<String> ans=new ArrayList<>();
      ans.add(p);
      return ans;
    }
    ArrayList<String> list=new ArrayList<>();
    if(r>1){
      list.addAll(findPath(p+'D', r-1, c));
    }
    if(c>1){
      list.addAll(findPath(p+'R', r, c-1));
    }
    if(c>1 && r>1){
      list.addAll(findPath((p+'d'), r-1, c-1));
    }
    return list;
  }
}
