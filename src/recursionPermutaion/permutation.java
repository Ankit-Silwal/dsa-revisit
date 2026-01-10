import java.util.ArrayList;

public class permutation{
  public static void main(String[] args) {
    System.out.print(permu("abc",""));  
  }
  static ArrayList<String> permu(String up,String p){
    if(up.isEmpty()){
      ArrayList<String> list=new ArrayList<>(0);
      list.add(p);
      return list;
    }
    char ch=up.charAt(0);
    ArrayList<String> ans=new ArrayList<>();
    for(int i=0;i<=p.length();i++){
      String f=p.substring(0,i);
      String s=p.substring(i,p.length());
      ans.addAll(permu(up.substring(1), f+ch+s));
    }
    return ans;
  }
}