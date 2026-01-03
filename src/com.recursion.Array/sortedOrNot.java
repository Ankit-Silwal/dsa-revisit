public class sortedOrNot {
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,9,10};
    System.out.print(find(arr,0,arr.length-1));  
  }
  static boolean find(int[] arr,int start,int end){
    if(start >= end){
      return true;
    }
    if(arr[start] > arr[start+1]){
      return false;
    }
    return find(arr, start+1, end);
  }
}
