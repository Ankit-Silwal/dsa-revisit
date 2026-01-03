
import java.util.ArrayList;

public class arrayLisReturnWithoutArgument {
  public static void main(String[] args) {
      int[] arr={1,2,3,4,1,2,3,4,2,32,34,3,4,1};
      System.out.println(search(arr,1,0));
  }
  static ArrayList<Integer> search(int[] arr,int target,int index){
    ArrayList<Integer> list=new ArrayList<>();
    if(index==arr.length){
      return list;
    }
    if(arr[index]==target){
      list.add(index);
    }
    ArrayList<Integer> ansFromBelowCalls=search(arr,target,index+1);
    list.addAll(ansFromBelowCalls);
    return list;
  }
}
