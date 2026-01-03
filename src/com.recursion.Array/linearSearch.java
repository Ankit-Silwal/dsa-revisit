
import java.util.ArrayList;

public class linearSearch {
  public static void main(String[] args) {
      int[] arr={1,2,3,4,5,1,2,3,4,5,6,7,8,7,5,1,1};
      ArrayList<Integer> list=new ArrayList<>();
      System.out.print(search(arr,1,0,list));
  }
  static ArrayList<Integer> search(int [] arr,int target,int index,ArrayList<Integer> list){
    if(index==arr.length){
      return list;
    }
    if(arr[index]==target){
      list.add(index);
    }
    return search(arr,target,index+1,list);
  }
}
